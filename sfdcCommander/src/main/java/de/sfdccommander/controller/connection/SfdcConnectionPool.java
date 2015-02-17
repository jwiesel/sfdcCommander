/**
 *
 */
package de.sfdccommander.controller.connection;

import java.util.ArrayList;
import java.util.List;

import com.sforce.soap.partner.Connector;
import com.sforce.soap.partner.GetUserInfoResult;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

import de.sfdccommander.model.CommanderConfig;
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
    private final List<PartnerConnection> connections;

    private final SfdcCommander commander;

    /**
     * Default constructor.
     */
    private SfdcConnectionPool() {
        connections = new ArrayList<PartnerConnection>();
        commander = SfdcCommander.getInstance();
    }

    /**
     * Provide SrvrMgrSession based on parameters.
     * 
     * @param config
     *            parameters for session
     * @return either new or existing session based on parameters
     * @throws ConnectionException
     * @throws ServerManagerException
     *             if issue with srvrmgr occurs
     */
    public PartnerConnection getConnection(final CommanderConfig aConfig)
            throws ConnectionException {
        PartnerConnection connection = null;

        for (PartnerConnection actConnection : connections) {
            // Compare Parameters
            boolean equals = false;
            if (actConnection.getConfig().getUsername()
                    .equals(aConfig.getSfUsername())) {
                if (actConnection.getConfig().getPassword()
                        .equals(aConfig.getSfPassword())) {
                    if (actConnection
                            .getConfig()
                            .getAuthEndpoint()
                            .equals(aConfig.getSfServerurl()
                                    + "/services/Soap/u/26.0")) {
                        // TODO: Proxy Check einbauen
                        equals = true;
                    }
                }
            }
            if (equals) {
                connection = actConnection;
            }
        }
        if (connection == null) {
            ConnectorConfig connectorConfig = new ConnectorConfig();
            connectorConfig.setUsername(aConfig.getSfUsername());
            connectorConfig.setPassword(aConfig.getSfPassword());
            connectorConfig.setAuthEndpoint(aConfig.getSfServerurl()
                    + "/services/Soap/u/26.0");
            if (!aConfig.getHttpProxyPort().equals("")) {
                connectorConfig.setProxy(aConfig.getHttpProxyHost(),
                        Integer.parseInt(aConfig.getHttpProxyPort()));
            }
            // connectorConfig.setTraceMessage(true);
            // connectorConfig.setPrettyPrintXml(true);

            PartnerConnection newConnection = Connector
                    .newConnection(connectorConfig);

            GetUserInfoResult tmpUserInfo = newConnection.getUserInfo();

            // display some current settings
            commander.notify("Auth EndPoint: "
                    + connectorConfig.getAuthEndpoint());
            commander.notify("Service EndPoint: "
                    + connectorConfig.getServiceEndpoint());
            commander.notify("Username: " + tmpUserInfo.getUserName());
            commander.notify("SessionId: " + connectorConfig.getSessionId());

            connections.add(newConnection);
            connection = newConnection;
        }
        return connection;
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
