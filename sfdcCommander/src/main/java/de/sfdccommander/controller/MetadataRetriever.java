package de.sfdccommander.controller;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sforce.soap._2006._04.metadata.AsyncResult;
import com.sforce.soap._2006._04.metadata.MetadataBindingStub;
import com.sforce.soap._2006._04.metadata.MetadataServiceLocator;
import com.sforce.soap._2006._04.metadata.PackageTypeMembers;
import com.sforce.soap._2006._04.metadata.RetrieveMessage;
import com.sforce.soap._2006._04.metadata.RetrieveRequest;
import com.sforce.soap._2006._04.metadata.RetrieveResult;
import com.sforce.soap._2006._04.metadata.RetrieveStatus;
import com.sforce.soap._2006._04.metadata.SessionHeader;
import com.sforce.soap.partner.LoginResult;
import com.sforce.soap.partner.SforceServiceLocator;
import com.sforce.soap.partner.SoapBindingStub;

public class MetadataRetriever {

    // Binding for the metadata WSDL used for making metadata API calls
    private MetadataBindingStub metadataConnection;

    private String manifest;

    private String systemName;

    private final static long ONE_SECOND = 1000;

    static BufferedReader rdr = new BufferedReader(
            new InputStreamReader(System.in));

    // maximum number of attempts to retrieve the results
    private static final int MAX_NUM_POLL_REQUESTS = 50;

    private static final double API_VERSION = 34.0;

    public MetadataRetriever(String username, String password) {
        createMetadataConnection(username, password);
    }

    public void retrieveZip() throws RemoteException, Exception {
        RetrieveRequest retrieveRequest = new RetrieveRequest();
        // The version in package.xml overrides the version in RetrieveRequest
        retrieveRequest.setApiVersion(API_VERSION);
        setUnpackaged(retrieveRequest);

        // Start the retrieve operation
        AsyncResult asyncResult = metadataConnection.retrieve(retrieveRequest);
        String asyncResultId = asyncResult.getId();

        // Wait for the retrieve to complete
        int poll = 0;
        long waitTimeMilliSecs = ONE_SECOND;
        RetrieveResult result = null;
        do {
            Thread.sleep(waitTimeMilliSecs);
            // Double the wait time for the next iteration
            waitTimeMilliSecs *= 2;
            if (poll++ > MAX_NUM_POLL_REQUESTS) {
                throw new Exception(
                        "Request timed out.  If this is a large set "
                                + "of metadata components, check that the time allowed "
                                + "by MAX_NUM_POLL_REQUESTS is sufficient.");
            }
            result = metadataConnection.checkRetrieveStatus(asyncResultId,
                    true);
            System.out.println("Retrieve Status: " + result.getStatus());
        } while (!result.isDone());

        if (result.getStatus() == RetrieveStatus.Failed) {
            throw new Exception(result.getErrorStatusCode() + " msg: "
                    + result.getErrorMessage());
        } else if (result.getStatus() == RetrieveStatus.Succeeded) {
            // Print out any warning messages
            StringBuilder buf = new StringBuilder();
            if (result.getMessages() != null) {
                for (RetrieveMessage rm : result.getMessages()) {
                    buf.append(rm.getFileName() + " - " + rm.getProblem());
                }
            }
            if (buf.length() > 0) {
                System.out.println("Retrieve warnings:\n" + buf);
            }

            // Write the zip to the file system
            System.out.println("Writing results to zip file");
            ByteArrayInputStream bais = new ByteArrayInputStream(
                    result.getZipFile());
            File resultsFile = new File(systemName + ".zip");
            FileOutputStream os = new FileOutputStream(resultsFile);
            try {
                ReadableByteChannel src = Channels.newChannel(bais);
                FileChannel dest = os.getChannel();
                copy(src, dest);

                System.out.println(
                        "Results written to " + resultsFile.getAbsolutePath());
            } finally {
                os.close();
            }
        }
    }

    /**
     * Helper method to copy from a readable channel to a writable channel,
     * using an in-memory buffer.
     */
    private void copy(ReadableByteChannel src, WritableByteChannel dest)
            throws IOException {
        // Use an in-memory byte buffer
        ByteBuffer buffer = ByteBuffer.allocate(8092);
        while (src.read(buffer) != -1) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                dest.write(buffer);
            }
            buffer.clear();
        }
    }

    private void setUnpackaged(RetrieveRequest request) throws Exception {
        // Edit the path, if necessary, if your package.xml file is located
        // elsewhere
        File unpackedManifest = new File(manifest);
        System.out.println(
                "Manifest file: " + unpackedManifest.getAbsolutePath());

        if (!unpackedManifest.exists() || !unpackedManifest.isFile())
            throw new Exception("Should provide a valid retrieve manifest "
                    + "for unpackaged content. " + "Looking for "
                    + unpackedManifest.getAbsolutePath());

        // Note that we populate the _package object by parsing a manifest file
        // here.
        // You could populate the _package based on any source for your
        // particular application.
        com.sforce.soap._2006._04.metadata._package p = parsePackage(
                unpackedManifest);
        request.setUnpackaged(p);
    }

    private com.sforce.soap._2006._04.metadata._package parsePackage(File file)
            throws Exception {
        try {
            InputStream is = new FileInputStream(file);
            List<PackageTypeMembers> pd = new ArrayList<PackageTypeMembers>();
            DocumentBuilder db = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder();
            Element d = db.parse(is).getDocumentElement();
            for (Node c = d.getFirstChild(); c != null; c = c
                    .getNextSibling()) {
                if (c instanceof Element) {
                    Element ce = (Element) c;
                    //
                    NodeList namee = ce.getElementsByTagName("name");
                    if (namee.getLength() == 0) {
                        // not
                        continue;
                    }
                    String name = namee.item(0).getTextContent();
                    NodeList m = ce.getElementsByTagName("members");
                    List<String> members = new ArrayList<String>();
                    for (int i = 0; i < m.getLength(); i++) {
                        Node mm = m.item(i);
                        members.add(mm.getTextContent());
                    }
                    PackageTypeMembers pdi = new PackageTypeMembers();
                    pdi.setName(name);
                    pdi.setMembers(members.toArray(new String[members.size()]));
                    pd.add(pdi);
                }
            }
            com.sforce.soap._2006._04.metadata._package r = new com.sforce.soap._2006._04.metadata._package();
            r.setTypes(pd.toArray(new PackageTypeMembers[pd.size()]));
            r.setVersion(API_VERSION + "");
            return r;
        } catch (ParserConfigurationException pce) {
            throw new Exception("Cannot create XML parser", pce);
        } catch (IOException ioe) {
            throw new Exception(ioe);
        } catch (SAXException se) {
            throw new Exception(se);
        }
    }

    private void createMetadataConnection(final String username,
            final String password) {

        MetadataServiceLocator metaDataSL = new MetadataServiceLocator();
        SforceServiceLocator salesForceSL = new SforceServiceLocator();

        try {

            SoapBindingStub soapBinding = (SoapBindingStub) salesForceSL
                    .getSoap();
            soapBinding.setTimeout(60000);
            LoginResult loginResult = soapBinding.login(username, password);

            SessionHeader sh = new SessionHeader();
            sh.setSessionId(loginResult.getSessionId());

            MetadataBindingStub metaBinding = (MetadataBindingStub) metaDataSL
                    .getMetadata();

            metaBinding._setProperty(SoapBindingStub.ENDPOINT_ADDRESS_PROPERTY,
                    loginResult.getMetadataServerUrl());

            metaBinding.setHeader(metaDataSL.getServiceName().getNamespaceURI(),
                    "SessionHeader", sh);

            System.out.println(metaBinding.describeMetadata(API_VERSION));

            this.metadataConnection = metaBinding;

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // The sample client application retrieves the user's login credentials.
    // Helper function for retrieving user input from the console
    String getUserInput(String prompt) {
        System.out.print(prompt);
        try {
            return rdr.readLine();
        } catch (IOException ex) {
            return null;
        }
    }

    /**
     * @return the manifest
     */
    public String getManifest() {
        return manifest;
    }

    /**
     * @param aManifest
     *            the manifest to set
     */
    public void setManifest(String aManifest) {
        manifest = aManifest;
    }

    /**
     * @return the systemName
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * @param aSystemName
     *            the systemName to set
     */
    public void setSystemName(String aSystemName) {
        systemName = aSystemName;
    }

}
