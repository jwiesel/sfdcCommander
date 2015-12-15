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

    /**
     * @param notification
     *            Notification text
     */
    public final void notify(final String notification) {
        // Color tmpStartColor = Color.YELLOW;
        // int tmpStartRed = tmpStartColor.getRed();
        // int tmpStartGreen = tmpStartColor.getGreen();
        // int tmpStartBlue = tmpStartColor.getBlue();
        //
        // Color tmpEndColor = Color.LIGHT_GRAY;
        // int tmpEndRed = tmpEndColor.getRed();
        // int tmpEndGreen = tmpEndColor.getGreen();
        // int tmpEndBlue = tmpEndColor.getBlue();
        //
        // Math.max(tmpMath.max(arg0, arg1)

        notificationLabel.setVisible(true);
        notificationText.setVisible(true);
        hideButton.setVisible(true);
        notificationText.setText(notification);
    }

    /**
     * Hide Notification.
     */
    public final void hideNotification() {
        notificationLabel.setVisible(false);
        notificationText.setVisible(false);
        hideButton.setVisible(false);
        notificationText.setText("");
    }
}
