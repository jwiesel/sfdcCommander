/**
 *
 */
package de.sfdccommander.viewer;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.UIManager;

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

    private JComboBox taskSelectionComboBox;
    private JButton executeTaskButton;
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
        actionPanel.setLayout(new MigLayout(UiLayout.W1_ROW_LAYOUT, "[]"));
        actionPanel.setBorder(
                BorderFactory.createTitledBorder(Translations.ACTIONS));

        taskSelectionComboBox = new JComboBox();
        taskSelectionComboBox.addItem(Translations.EXPORT_SRC_TITLE);
        taskSelectionComboBox.addItem(Translations.EXPORT_DATA_TITLE);
        taskSelectionComboBox.addItem(Translations.RENDER_TITLE);
        taskSelectionComboBox.addItem(Translations.RENDERXLS_TITLE);
        taskSelectionComboBox.addItem(Translations.VERSIONIZE_TITLE);
        taskSelectionComboBox.addItem(Translations.COMPARE_CONFIG_TITLE);

        executeTaskButton = new JButton(Translations.EXECUTE_TASK);
        executeTaskButton.setIcon(UIManager.getIcon("FileView.directoryIcon"));

        executeTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent aE) {
                NotificationPanel notificationPanel = Window.getInstance()
                        .getNotificationLabel();
                if (configPanel.getFile().getText().equals("")) {
                    notificationPanel
                            .info(Translations.SPECIFY_PROPERTIES_FILE);
                } else {
                    CommanderPropertiesHandler propHandler = new CommanderPropertiesHandler(
                            configPanel.getFile().getText());
                    try {
                        CommanderConfig config = propHandler.loadProperties();
                        setCursor(
                                Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                        String selectedAction = taskSelectionComboBox
                                .getSelectedItem().toString();
                        boolean executed = true;
                        switch (selectedAction) {
                        case Translations.EXPORT_SRC_TITLE:
                            Tasks.exportSrc(config);
                            break;
                        case Translations.EXPORT_DATA_TITLE:
                            Tasks.exportData(config);
                            break;
                        case Translations.RENDER_TITLE:
                            Tasks.render(config);
                            break;
                        case Translations.RENDERXLS_TITLE:
                            Tasks.renderXls(config);
                            break;
                        case Translations.VERSIONIZE_TITLE:
                            Tasks.versionize(config);
                            break;
                        case Translations.COMPARE_CONFIG_TITLE:
                            Tasks.compare(config);
                            break;
                        default:
                            executed = false;
                            notificationPanel.info(Translations.SELECT_ACTION);
                        }
                        if (executed) {
                            notificationPanel
                                    .success(Translations.TASK_EXECUTED);
                        }
                        setCursor(null);
                    } catch (CommanderException e) {
                        commander.error(e.getMessage(), e);
                    }
                }
            }
        });

        actionPanel.add(taskSelectionComboBox, UiLayout.GX);
        actionPanel.add(executeTaskButton, UiLayout.WGS_BUTTON);

        this.setLayout(new MigLayout(UiLayout.W2_ROW_LAYOUT, "[500][200]"));
        this.add(configPanel, "grow");
        this.add(actionPanel, "grow");
    }

}
