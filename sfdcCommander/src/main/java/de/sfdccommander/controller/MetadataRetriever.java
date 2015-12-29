package de.sfdccommander.controller;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.sforce.soap._2006._04.metadata.AsyncResult;
import com.sforce.soap._2006._04.metadata.DescribeMetadataObject;
import com.sforce.soap._2006._04.metadata.DescribeMetadataResult;
import com.sforce.soap._2006._04.metadata.FileProperties;
import com.sforce.soap._2006._04.metadata.ListMetadataQuery;
import com.sforce.soap._2006._04.metadata.MetadataBindingStub;
import com.sforce.soap._2006._04.metadata.PackageTypeMembers;
import com.sforce.soap._2006._04.metadata.RetrieveMessage;
import com.sforce.soap._2006._04.metadata.RetrieveRequest;
import com.sforce.soap._2006._04.metadata.RetrieveResult;
import com.sforce.soap._2006._04.metadata.RetrieveStatus;

import de.sfdccommander.controller.connection.SfdcConnectionPool;
import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.model.SfdcConfig;
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

    private static final int MAX_PACKAGE_MEMBERS = 60;

    private final SfdcCommander commander;

    public MetadataRetriever(SfdcConfig aConfig) throws CommanderException {
        // createMetadataConnection(username, password, loginUrl);
        SfdcConnectionPool connectionPool = SfdcConnectionPool.getInstance();
        metaBinding = connectionPool.createMetadataBinding(aConfig);
        commander = SfdcCommander.getInstance();
    }

    public void retrieveZip() throws CommanderException {
        RetrieveRequest retrieveRequest = new RetrieveRequest();
        // The version in package.xml overrides the version in RetrieveRequest
        retrieveRequest.setApiVersion(SfdcConnectionPool.API_VERSION);
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
                if (waitTimeMilliSecs < 100 * ONE_SECOND) {
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
        List<PackageTypeMembers> entitylist = new ArrayList<PackageTypeMembers>();
        int members = 0;
        try {
            DescribeMetadataResult metadataResult = metaBinding
                    .describeMetadata(SfdcConnectionPool.API_VERSION);
            for (DescribeMetadataObject objectType : metadataResult
                    .getMetadataObjects()) {
                PackageTypeMembers entity = generateEntityWithMembers(
                        objectType);
                if (entity.getMembers() != null) {
                    members += entity.getMembers().length;
                }
                // TODO: Add check for max. members to create several
                // entitylists & packages --> support for large orgs >10.000
                // members
                entitylist.add(entity);
            }
            commander.info(
                    "Your Org consists of " + members + " visible elements.");
        } catch (RemoteException e) {
            throw new CommanderException(
                    "Could not describe metadata to build package.xml", e);
        } catch (UnsupportedEncodingException e) {
            throw new CommanderException(
                    "Could not decode package member name with UTF-8. (Unsupported Encoding?)",
                    e);
        }

        com.sforce.soap._2006._04.metadata._package r = new com.sforce.soap._2006._04.metadata._package();
        r.setTypes(
                entitylist.toArray(new PackageTypeMembers[entitylist.size()]));
        r.setVersion(SfdcConnectionPool.API_VERSION + "");
        return r;

    }

    /**
     * @param objectType
     * @return
     * @throws RemoteException
     * @throws UnsupportedEncodingException
     */
    private PackageTypeMembers generateEntityWithMembers(
            DescribeMetadataObject objectType)
                    throws RemoteException, UnsupportedEncodingException {
        PackageTypeMembers entity = new PackageTypeMembers();
        entity.setName(objectType.getXmlName());

        ListMetadataQuery[] queries = new ListMetadataQuery[1];
        queries[0] = new ListMetadataQuery();
        queries[0].setType(objectType.getXmlName());
        FileProperties[] tmpListMetadata = metaBinding.listMetadata(queries,
                SfdcConnectionPool.API_VERSION);
        if (tmpListMetadata != null) {
            List<String> members = new ArrayList<String>();
            for (FileProperties member : tmpListMetadata) {
                members.add(URLDecoder.decode(member.getFullName(), "UTF-8"));
            }
            entity.setMembers(members.toArray(new String[members.size()]));
        }
        return entity;
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
