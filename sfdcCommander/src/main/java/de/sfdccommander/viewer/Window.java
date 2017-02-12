package de.sfdccommander.viewer;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public final class Window extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static Window instance;

    private NotificationPanel notificationPanel;
    private JTabbedPane tabbedPane;

    private ConfigActionPanel configActionPanel;

    SfdcCommander commander;

    /**
     * Default constructor.
     */
    private Window() {
    }

    /**
     * Initialize components.
     */
    public void init() {
        commander = SfdcCommander.getInstance();
        commander.setGuiMode(true);
        try {
            String cn = UIManager.getSystemLookAndFeelClassName();
            UIManager.setLookAndFeel(cn);
        } catch (ClassNotFoundException e) {
            commander.error(Translations.SYSTEM_LOOK_NOT_LOADED, e);
        } catch (InstantiationException e) {
            commander.error(Translations.SYSTEM_LOOK_NOT_LOADED, e);
        } catch (IllegalAccessException e) {
            commander.error(Translations.SYSTEM_LOOK_NOT_LOADED, e);
        } catch (UnsupportedLookAndFeelException e) {
            commander.error(Translations.SYSTEM_LOOK_NOT_LOADED, e);
        }

        tabbedPane = new JTabbedPane();
        configActionPanel = new ConfigActionPanel();
        notificationPanel = new NotificationPanel();

        tabbedPane.addTab(Translations.START, configActionPanel);

        setTitle(Translations.SFDC_COMMANDER + " " + Translations.VERSION);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(tabbedPane, BorderLayout.CENTER);
        getContentPane().add(notificationPanel, BorderLayout.SOUTH);

        setVisible(true);
        setSize(UiLayout.WINDOW_WIDTH, UiLayout.WINDOW_HEIGHT);
        setLocationRelativeTo(null);

        // Image im = Toolkit.getDefaultToolkit()
        // .getImage(Images.class.getResource("/img/" +
        // Images.SFDC_COMNMANDER_LOGO));
        // setIconImage(im);

    }

    /**
     * @return UtilWindow instance
     */
    public static Window getInstance() {
        if (Window.instance == null) {
            Window.instance = new Window();
            Window.instance.init();
        }
        return Window.instance;
    }

    /**
     * @return the errorLabel
     */
    public NotificationPanel getNotificationLabel() {
        return notificationPanel;
    }

    /**
     * @return the configActionPanel
     */
    public final ConfigActionPanel getConfigActionPanel() {
        return configActionPanel;
    }
}
