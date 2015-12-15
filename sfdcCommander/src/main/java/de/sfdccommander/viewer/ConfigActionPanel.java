/**
 *
 */
package de.sfdccommander.viewer;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import de.sfdccommander.controller.CommanderPropertiesHandler;
import de.sfdccommander.controller.Tasks;
import de.sfdccommander.controller.helper.CommanderException;
import de.sfdccommander.controller.helper.PropertiesFileFilter;
import de.sfdccommander.model.CommanderConfig;
import de.sfdccommander.viewer.panel.FileOpenPanel;
import net.miginfocom.swing.MigLayout;

/**
 * @author jochen
 * 
 */
public class ConfigActionPanel extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private FileOpenPanel configPanel;
    private JPanel actionPanel;

    private JButton extractDxFileButton;
    SfdcCommander commander;

    /**
     * Default constructor.
     */
    public ConfigActionPanel() {
        commander = SfdcCommander.getInstance();
        initializeComponents();
        commander.debug("ConfigActionPanel loaded");
    }

    /**
     * Initialize components.
     */
    private void initializeComponents() {

        configPanel = new FileOpenPanel(Translations.PROPERTIES_FILE, true,
                false);
        configPanel.setFileFilter(new PropertiesFileFilter());
        configPanel.setBorder(
                BorderFactory.createTitledBorder(Translations.CONFIGURATION));

        actionPanel = new JPanel();
        actionPanel.setLayout(new MigLayout(UiLayout.W1_ROW_LAYOUT, "[150]"));
        actionPanel.setBorder(
                BorderFactory.createTitledBorder(Translations.ACTIONS));

        extractDxFileButton = new JButton(Translations.GENERATE_DOCU);
        // extractDxFileButton.setIcon(Images.getImageResource(Images.DOWN));

        extractDxFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent aE) {
                if (configPanel.getFile().getText().equals("")) {
                    Window.getInstance().getNotificationLabel()
                            .notify("Please specify a properties file");
                } else {
                    CommanderPropertiesHandler propHandler = new CommanderPropertiesHandler(
                            configPanel.getFile().getText());
                    try {
                        CommanderConfig config = propHandler.loadProperties();
                        setCursor(
                                Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                        Tasks.render(config);
                        setCursor(null);
                    } catch (CommanderException e) {
                        commander.error(e.getMessage(), e);
                    }
                }
            }
        });

        actionPanel.add(extractDxFileButton, UiLayout.GX);

        this.setLayout(new MigLayout(UiLayout.W2_ROW_LAYOUT, "[][]"));
        this.add(configPanel, "grow");
        this.add(actionPanel, "grow");
    }

}
