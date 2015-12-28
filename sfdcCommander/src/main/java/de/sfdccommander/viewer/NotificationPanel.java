/**
 *
 */
package de.sfdccommander.viewer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

/**
 * @author jochen
 * 
 */
public class NotificationPanel extends JPanel {
    /**
     * serialVersionUID constant.
     */
    private static final long serialVersionUID = 1L;

    private JLabel notificationLabel;
    private JLabel notificationText;
    private JButton hideButton;

    /**
     * Default constructor.
     */
    public NotificationPanel() {
        super();
        initializeComponents();
    }

    /**
     * Initialize components.
     */
    private void initializeComponents() {
        notificationLabel = new JLabel(Translations.NOTIFICATION + ": ");
        notificationLabel.setForeground(Color.RED);

        notificationText = new JLabel();
        notificationText.setText("");

        hideButton = new JButton(Translations.HIDE);
        hideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent aArg0) {
                hideNotification();
            }
        });

        notificationLabel.setVisible(false);
        notificationText.setVisible(false);
        hideButton.setVisible(false);

        this.setLayout(new MigLayout("", "[][][grow]"));
        this.add(notificationLabel);
        this.add(notificationText);
        this.add(hideButton, "right");
    }

    public void success(String aSuccessMessage) {
        notify(aSuccessMessage, Color.GREEN);
    }

    public void error(String anErrorMessage) {
        notify(anErrorMessage, Color.RED);
    }

    public void info(String anInfoMessage) {
        notify(anInfoMessage, Color.BLUE);
    }

    /**
     * @param notification
     *            Notification text
     * @param red
     */
    private final void notify(final String notification, Color aColor) {

        notificationLabel.setVisible(true);
        notificationText.setVisible(true);
        hideButton.setVisible(true);
        notificationText.setText(notification);
        notificationLabel.setForeground(aColor);
    }

    /**
     * Hide Notification.
     */
    public final void hideNotification() {
        notificationLabel.setVisible(false);
        notificationLabel.setForeground(Color.BLACK);
        notificationText.setVisible(false);
        hideButton.setVisible(false);
        notificationText.setText("");
    }
}
