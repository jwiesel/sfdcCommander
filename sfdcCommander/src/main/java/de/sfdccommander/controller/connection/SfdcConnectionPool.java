/**
 *
 */
package de.sfdccommander.controller.connection;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.sforce.soap._2006._04.metadata.SessionHeader;
import com.sforce.soap.partner.LoginResult;
import com.sforce.soap.partner.SforceServiceLocator;
import com.sforce.soap.partner.SoapBindingStub;
import com.sforce.soap.partner.fault.InvalidIdFault;
import com.sforce.soap.partner.fault.LoginFault;
import com.sforce.soap.partner.fault.UnexpectedErrorFault;

import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.model.SfdcConfig;
import de.sfdccommander.viewer.SfdcCommander;

/**
 * Pool of all active srvrmgr sessions.
 * 
 * @author jochen
 * 
 */
public final class SfdcConnectionPool {
    /**
     * SrvrMgrConnectionPool singleton.
     */
    private static SfdcConnectionPool instance;
    /**
     * List of sessions in pool.
     */
    private final List<SoapBindingStub> bindings;

    private final SfdcCommander commander;

    /**
     * Default constructor.
     */
    private SfdcConnectionPool() {
        bindings = new ArrayList<SoapBindingStub>();
        commander = SfdcCommander.getInstance();
    }

    /**
     * Provide SrvrMgrSession based on parameters.
     * 
     * @param config
     *            parameters for session
     * @return either new or existing session based on parameters
     * @throws CommanderException
     * @throws ConnectionException
     * @throws ServerManagerException
     *             if issue with srvrmgr occurs
     */
    public SoapBindingStub getBinding(final SfdcConfig aConfig)
            throws CommanderException {
        SoapBindingStub binding = null;
        SforceServiceLocator salesForceSL = new SforceServiceLocator();

        boolean equals = false;
        for (SoapBindingStub actBinding : bindings) {
            // Compare Parameters
            if (actBinding.getUsername().equals(aConfig.getUsername())) {
                if (actBinding.getPassword().equals(aConfig.getPassword())) {
                    equals = true;
                }
            }
            if (equals) {
                binding = actBinding;
                break;
            }
        }
        if (binding == null) {
            try {
                binding = (SoapBindingStub) salesForceSL.getSoap();
                binding.setTimeout(60000);
                LoginResult lr;
                lr = binding.login(aConfig.getUsername(),
                        aConfig.getPassword());

                SessionHeader sh = new SessionHeader();
                sh.setSessionId(lr.getSessionId());
                binding._setProperty(SoapBindingStub.ENDPOINT_ADDRESS_PROPERTY,
                        lr.getServerUrl());
                binding.setHeader(
                        salesForceSL.getServiceName().getNamespaceURI(),
                        "SessionHeader", sh);
                if (lr.isPasswordExpired()) {
                    commander.info(
                            "An error has occurred. Your password has expired.");
                }
            } catch (LoginFault e) {
                throw new CommanderException(
                        "Login failed. Please check your username, password and security token and ensure your user is not locked.",
                        e);
            } catch (UnexpectedErrorFault e) {
                throw new CommanderException(
                        "Login failed due to an unexcepted error. Please check the log file for details.",
                        e);
            } catch (InvalidIdFault e) {
                throw new CommanderException("Login failed. Invalid Id.", e);
            } catch (RemoteException e) {
                throw new CommanderException(
                        "Login failed due to a remote issue. Please check the log-file for details.",
                        e);
            } catch (ServiceException e) {
                throw new CommanderException(
                        "Could not connect to SOAP-API. Wrong URL?", e);
            }

            bindings.add(binding);
        }
        return binding;
    }

    /**
     * @return SrvrMgrConnectionPool Singleton
     */
    public static SfdcConnectionPool getInstance() {
        if (SfdcConnectionPool.instance == null) {
            SfdcConnectionPool.instance = new SfdcConnectionPool();
        }
        return SfdcConnectionPool.instance;
    }
}
