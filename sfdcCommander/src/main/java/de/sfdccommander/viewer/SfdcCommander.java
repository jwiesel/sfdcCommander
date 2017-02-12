/**
 * 
 */
package de.sfdccommander.viewer;

import org.apache.log4j.Logger;

import de.sfdccommander.controller.StartModeDispatcher;

/**
 * @author jochen
 * 
 */
public class SfdcCommander {

    /**
     * 
     */
    private static SfdcCommander instance;

    private boolean guiMode;

    /**
     * @param args
     */
    public static void main(final String[] args) {
        SfdcCommander.getInstance(args);
    }

    /**
     * @param args
     * @return
     */
    public static SfdcCommander getInstance(final String[] args) {
        if (SfdcCommander.instance == null) {
            SfdcCommander.instance = new SfdcCommander(args);
        }
        return SfdcCommander.instance;
    }

    /**
     * @param args
     * @return
     */
    public static SfdcCommander getInstance() {
        if (SfdcCommander.instance == null) {
            SfdcCommander.instance = new SfdcCommander();
        }
        return SfdcCommander.instance;
    }

    /**
     * @param args
     */
    public SfdcCommander(final String[] args) {
        getLogger().info("Application started.");
        setGuiMode(false);
        StartModeDispatcher dispatcher = new StartModeDispatcher(args);
        dispatcher.dispatch();
    }

    /**
     * 
     */
    public SfdcCommander() {

    }

    /**
     * @param message
     *            The Notification message.
     */
    public final void info(final String message) {
        System.out.println(message);
        getLogger().info(message);
    }

    /**
     * @param message
     *            The Error message.
     */
    public final void error(final String message, final Throwable anException) {
        if (isGuiMode()) {
            NotificationPanel notificationPanel = Window.getInstance()
                    .getNotificationLabel();
            notificationPanel.error(message);
        }
        System.out.println("Error: " + message);
        getLogger().error(message, anException);
    }

    /**
     * @param message
     *            The Debug message.
     */
    public final void debug(final String message) {
        getLogger().debug(message);
    }

    /**
     * @return
     */
    private Logger getLogger() {
        return Logger.getLogger(this.getClass());
    }

    /**
     * @return the guiMode
     */
    public boolean isGuiMode() {
        return guiMode;
    }

    /**
     * @param aGuiMode
     *            the guiMode to set
     */
    public void setGuiMode(boolean aGuiMode) {
        guiMode = aGuiMode;
    }

}
