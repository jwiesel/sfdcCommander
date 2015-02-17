package de.sfdccommander.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.tmatesoft.svn.core.SVNDepth;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNProperties;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.BasicAuthenticationManager;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.svn.SVNRepositoryFactoryImpl;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.SVNCommitClient;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.tmatesoft.svn.core.wc.SVNUpdateClient;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

import de.sfdccommander.model.CommanderConfig;
import de.sfdccommander.viewer.SfdcCommander;

/**
 * @author jochen Handles the SVN Repository Connection.
 */
public class SvnHandler {

    /**
     * 
     */
    private final CommanderConfig config;

    /**
     * @param aConfig
     *            CommanderConfig which contains svn properties.
     */
    public SvnHandler(final CommanderConfig aConfig) {
        this.config = aConfig;
    }

    /**
     * @param svnPathString
     *            String which contains the local SVN folder path.
     * @return Error code. If true --> SVN Operation failed.
     */
    public final boolean performSVNupdate(final String svnPathString) {
        SfdcCommander commander = SfdcCommander.getInstance();
        boolean error = false;
        File svnPath = new File(svnPathString);

        // checkout
        try {
            ISVNAuthenticationManager authManager = getAuthManager(config);
            SVNUpdateClient updateClient = new SVNUpdateClient(authManager,
                    SVNWCUtil.createDefaultOptions(true));

            updateClient.doUpdate(svnPath, SVNRevision.HEAD, SVNDepth.INFINITY,
                    true, true);
            commander.notify("SVN Update successfully processed.");
        } catch (SVNException e) {
            commander.notify(e.getMessage());
            error = true;
        }
        return error;
    }

    /**
     * @param svnPathString
     *            String which contains the local SVN folder path.
     * @param aComment
     *            The SVN Comment which has been entered.
     * @param aConfig
     *            CommanderConfig for SVN Connect.
     * @return Error code. If true --> SVN Operation failed.
     */
    public final boolean performSVNcommit(final String svnPathString,
            final String aComment, final CommanderConfig aConfig) {
        SfdcCommander commander = SfdcCommander.getInstance();
        boolean error = false;
        File[] paths = new File[1];
        // paths[0] = projectFile;
        // boolean svnNew = false;

        // svn add
        SVNProperties props = new SVNProperties();
        try {
            ISVNAuthenticationManager authManager = getAuthManager(config);
            // if (svnNew) {
            // SVNWCClient addClient = new SVNWCClient(authManager,
            // SVNWCUtil.createDefaultOptions(true));
            // addClient.doAdd(projectFile, true, false, true,
            // SVNDepth.INFINITY, true, true);
            // commander.notify("Projectfile successfully added.");
            // }
            // commit
            SVNCommitClient commitClient = new SVNCommitClient(authManager,
                    SVNWCUtil.createDefaultOptions(true));
            commitClient.doCommit(paths, false, aComment, props, null, false,
                    true, SVNDepth.INFINITY);
            commander.notify("Projectfile successfully commited.");

        } catch (SVNException e) {
            commander.notify(e.getMessage());
            error = true;
        }

        return error;

    }

    /**
     * @param svnPathString
     *            String which contains the local SVN folder path.
     * @param aConfig
     *            CommanderConfig for SVN Connect.
     * @return Error code. If true --> SVN Operation failed.
     */
    public final boolean performCheckOut(final String svnPathString,
            final CommanderConfig aConfig) {
        SfdcCommander commander = SfdcCommander.getInstance();
        boolean error = false;
        File svn_logFolder = new File(svnPathString + "/.svn");
        File svnPath = new File(svnPathString);
        // checkout
        if (!svn_logFolder.exists()) {
            try {
                SVNURL url = SVNURL.parseURIDecoded(aConfig.getSvnRepository());
                ISVNAuthenticationManager authManager = getAuthManager(aConfig);
                SVNUpdateClient updateClient = new SVNUpdateClient(authManager,
                        SVNWCUtil.createDefaultOptions(true));
                updateClient.setIgnoreExternals(false);
                updateClient.doCheckout(url, svnPath, SVNRevision.HEAD,
                        SVNRevision.HEAD, SVNDepth.INFINITY, true);
                commander.notify("SVN Checkout successfully processed.");

            } catch (SVNException e) {
                commander.notify(e.getErrorMessage().getFullMessage());
                error = true;
            }

        }
        return error;
    }

    /**
     * @param aConfig
     *            CommanderConfig for SVN Connection
     * @return SVNRepository to versionize
     */
    private ISVNAuthenticationManager getAuthManager(
            final CommanderConfig aConfig) {
        SfdcCommander commander = SfdcCommander.getInstance();
        SVNRepository repository = null;
        ISVNAuthenticationManager authManager = null;
        try {
            SVNURL url = SVNURL.parseURIDecoded(aConfig.getSvnRepository());
            if (url.getProtocol().equals("http")) {
                DAVRepositoryFactory.setup();

                authManager = new BasicAuthenticationManager(
                        aConfig.getSvnUser(), aConfig.getSvnPassword());
                repository = DAVRepositoryFactory.create(url, null);
            } else if (url.getProtocol().equals("svn")) {
                SVNRepositoryFactoryImpl.setup();
                repository = SVNRepositoryFactory.create(url, null);
                authManager = SVNWCUtil.createDefaultAuthenticationManager(
                        aConfig.getSvnUser(), aConfig.getSvnPassword());
            }
            repository.setAuthenticationManager(authManager);
        } catch (SVNException e) {
            // handle exception
            commander.notify(e.getMessage());
        }
        return authManager;
    }

    /**
     * @param src
     *            Source File
     * @param dest
     *            Destination File
     * @param bufSize
     *            Size of byte[] buffer
     * @param force
     *            Overwrite Flag
     * @throws IOException
     *             Cannot overwrite existing file
     */
    private void copyFile(final File src, final File dest, final int bufSize,
            final boolean force) throws IOException {
        if (dest.exists()) {
            if (force) {
                dest.delete();
            } else {
                throw new IOException("Cannot overwrite existing file: "
                        + dest.toString());
            }
        }
        byte[] buffer = new byte[bufSize];
        int read = 0;
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            while (true) {
                read = in.read(buffer);
                if (read == -1) {
                    // -1 bedeutet EOF
                    break;
                }
                out.write(buffer, 0, read);
            }
        } finally {
            // Sicherstellen, dass die Streams auch
            // bei einem throw geschlossen werden.
            // Falls in null ist, ist out auch null!
            if (in != null) {
                // Falls tats�chlich in.close() und out.close()
                // Exceptions werfen, die jenige von 'out' geworfen wird.
                try {
                    in.close();
                } finally {
                    if (out != null) {
                        out.close();
                    }
                }
            }
        }
    }

}
