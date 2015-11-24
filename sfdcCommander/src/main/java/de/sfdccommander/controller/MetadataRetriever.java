package de.sfdccommander.controller;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.sforce.soap._2006._04.metadata.AsyncResult;
import com.sforce.soap._2006._04.metadata.DescribeMetadataObject;
import com.sforce.soap._2006._04.metadata.DescribeMetadataResult;
import com.sforce.soap._2006._04.metadata.FileProperties;
import com.sforce.soap._2006._04.metadata.ListMetadataQuery;
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
import com.sforce.soap.partner.fault.InvalidIdFault;
import com.sforce.soap.partner.fault.LoginFault;
import com.sforce.soap.partner.fault.UnexpectedErrorFault;

import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.viewer.SfdcCommander;

public class MetadataRetriever {

    // Binding for the metadata WSDL used for making metadata API calls
    private MetadataBindingStub metaBinding;

    private String systemName;

    private final static long ONE_SECOND = 1000;

    static BufferedReader rdr = new BufferedReader(
            new InputStreamReader(System.in));

    // maximum number of attempts to retrieve the results
    private static final int MAX_NUM_POLL_REQUESTS = 100;

    private static final double API_VERSION = 34.0;

    private final SfdcCommander commander;

    public MetadataRetriever(String username, String password, String loginUrl)
            throws CommanderException {
        createMetadataConnection(username, password, loginUrl);
        commander = SfdcCommander.getInstance();
    }

    public void retrieveZip() throws CommanderException {
        RetrieveRequest retrieveRequest = new RetrieveRequest();
        // The version in package.xml overrides the version in RetrieveRequest
        retrieveRequest.setApiVersion(API_VERSION);
        retrieveRequest.setUnpackaged(buildPackage());
        try {

            // Start the retrieve operation
            AsyncResult asyncResult = metaBinding.retrieve(retrieveRequest);
            String asyncResultId = asyncResult.getId();

            // Wait for the retrieve to complete
            int poll = 0;
            long waitTimeMilliSecs = ONE_SECOND;
            RetrieveResult result = null;
            do {
                Thread.sleep(waitTimeMilliSecs);
                // Double the wait time for the next iteration
                if (waitTimeMilliSecs < 100) {
                    waitTimeMilliSecs *= 2;
                }
                if (poll++ > MAX_NUM_POLL_REQUESTS) {
                    throw new CommanderException(
                            "Request timed out.  If this is a large set "
                                    + "of metadata components, check that the time allowed "
                                    + "by MAX_NUM_POLL_REQUESTS is sufficient.");
                }
                result = metaBinding.checkRetrieveStatus(asyncResultId, true);
                commander.info("Retrieve Status: " + result.getStatus());
            } while (!result.isDone());

            if (result.getStatus() == RetrieveStatus.Failed) {
                throw new CommanderException(result.getErrorStatusCode()
                        + " msg: " + result.getErrorMessage());
            } else if (result.getStatus() == RetrieveStatus.Succeeded) {
                // Print out any warning messages
                StringBuilder buf = new StringBuilder();
                if (result.getMessages() != null) {
                    for (RetrieveMessage rm : result.getMessages()) {
                        buf.append(rm.getFileName() + " - " + rm.getProblem()
                                + "\r\n");
                    }
                }
                if (buf.length() > 0) {
                    commander.info("Retrieve warnings:\n" + buf);
                }

                // Write the zip to the file system
                File resultsFile = new File(systemName + ".zip");
                writeZip(result.getZipFile(), resultsFile);

            }
        } catch (RemoteException e) {
            throw new CommanderException("Could not retrieve metadata.", e);

        } catch (InterruptedException e) {
            throw new CommanderException(
                    "Metdata download request has been interrupted.", e);
        }
    }

    private void writeZip(byte[] content, File zipFile)
            throws CommanderException {
        commander.info("Writing results to zip file");
        ByteArrayInputStream bais = new ByteArrayInputStream(content);
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(zipFile);
            ReadableByteChannel src = Channels.newChannel(bais);
            FileChannel dest = os.getChannel();
            copy(src, dest);

            commander.info("Results written to " + zipFile.getAbsolutePath());
        } catch (FileNotFoundException e) {
            throw new CommanderException(
                    "Could not find zip-file: " + zipFile.getAbsolutePath(), e);
        } catch (IOException e) {
            throw new CommanderException(
                    "Could not write zip-File: " + zipFile.getAbsolutePath(),
                    e);
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                throw new CommanderException(
                        "Could not close zip-file after creation.", e);
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

    private com.sforce.soap._2006._04.metadata._package buildPackage()
            throws CommanderException {
        SfdcCommander commander = SfdcCommander.getInstance();
        commander.info("Gathering Metadata from your Org...");
        List<PackageTypeMembers> pd = new ArrayList<PackageTypeMembers>();
        try {
            DescribeMetadataResult metadataResult = metaBinding
                    .describeMetadata(API_VERSION);
            for (DescribeMetadataObject objectType : metadataResult
                    .getMetadataObjects()) {
                PackageTypeMembers pdi = new PackageTypeMembers();
                pdi.setName(objectType.getXmlName());

                ListMetadataQuery[] queries = new ListMetadataQuery[1];
                queries[0] = new ListMetadataQuery();
                queries[0].setType(objectType.getXmlName());
                FileProperties[] tmpListMetadata = metaBinding
                        .listMetadata(queries, API_VERSION);
                if (tmpListMetadata != null) {
                    List<String> members = new ArrayList<String>();
                    for (FileProperties member : tmpListMetadata) {
                        members.add(URLDecoder.decode(member.getFullName()));
                    }
                    pdi.setMembers(members.toArray(new String[members.size()]));
                }
                pd.add(pdi);
            }
        } catch (RemoteException e) {
            throw new CommanderException(
                    "Could not describe metadata to build package.xml", e);
        }

        com.sforce.soap._2006._04.metadata._package r = new com.sforce.soap._2006._04.metadata._package();
        r.setTypes(pd.toArray(new PackageTypeMembers[pd.size()]));
        r.setVersion(API_VERSION + "");
        return r;

    }

    private void createMetadataConnection(final String username,
            final String password, String loginUrl) throws CommanderException {

        MetadataServiceLocator metaDataSL = new MetadataServiceLocator();
        SforceServiceLocator salesForceSL = new SforceServiceLocator();
        salesForceSL.setSoapEndpointAddress(loginUrl + "/services/Soap/u/34.0");

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

            this.metaBinding = metaBinding;

        } catch (ServiceException e) {
            throw new CommanderException(
                    "Could not connection to salesforce-API.", e);
        } catch (LoginFault e) {
            throw new CommanderException(
                    "Login failed for the following reason: "
                            + e.getFaultReason(),
                    e);
        } catch (UnexpectedErrorFault e) {
            throw new CommanderException(
                    "Login failed due to an unexcepted error. Please check the log file for details.",
                    e);
        } catch (InvalidIdFault e) {
            throw new CommanderException("Login failed. Invalid Id.", e);
        } catch (RemoteException e) {
            throw new CommanderException(
                    "Login failed due to a remote issue: " + e.getMessage(), e);
        }

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
