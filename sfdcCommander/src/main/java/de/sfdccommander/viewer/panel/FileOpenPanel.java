/**
 * 
 */
package de.sfdccommander.viewer.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;

import de.sfdccommander.controller.listener.ClickButtonHandler;
import de.sfdccommander.viewer.UiLayout;
import net.miginfocom.swing.MigLayout;

/**
 * @author jochen
 * 
 */
public class FileOpenPanel extends JPanel {
    /**
     * serialVersionUID constant.
     */
    private static final long serialVersionUID = 1L;

    private final String filetype;
    private final boolean twoLines;
    private final boolean foldersOnly;

    private JLabel fileLabel;
    private JButton selectFileButton;
    private JTextField fileTextField;
    private FileFilter filter;

    /**
     * Default constructor.
     * 
     * @param filetype
     * @param twoLines
     * @param foldersOnly
     */
    public FileOpenPanel(final String filetype, final boolean twoLines,
            final boolean foldersOnly) {
        this.filetype = filetype;
        this.twoLines = twoLines;
        this.foldersOnly = foldersOnly;
        initializeObjects();
    }

    /**
     * Initialize objects.
     */
    private void initializeObjects() {

        fileLabel = new JLabel(filetype);
        fileTextField = new JTextField();

        String tmpButtonText = "Select " + filetype;
        selectFileButton = new JButton();
        if (twoLines) {
            selectFileButton.setText(tmpButtonText);
        } else {
            selectFileButton.setToolTipText(tmpButtonText);
        }
        selectFileButton.setIcon(UIManager.getIcon("FileView.fileIcon"));
        selectFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent aE) {
                openFileDialog();
            }
        });

        fileTextField.addKeyListener(new ClickButtonHandler(selectFileButton));

        this.setLayout(new MigLayout(UiLayout.LABEL_FIELD_ROW_INSET_LAYOUT,
                UiLayout.LABEL_FIELD_COLUMN_LAYOUT));

        this.add(fileLabel, UiLayout.LABEL_GAP);
        if (twoLines) {
            this.add(fileTextField, UiLayout.GX);
            this.add(selectFileButton, UiLayout.WGS_BUTTON);
        } else {
            this.add(fileTextField, UiLayout.SGX);
            this.add(selectFileButton, "");
        }

    }

    /**
     * @param aFilter
     *            FileFilter for FileOpenPanel
     */
    public final void setFileFilter(final FileFilter aFilter) {
        this.filter = aFilter;

    }

    /**
     * @return file text field
     */
    public final JTextField getFile() {
        return fileTextField;
    }

    /**
     * Opens File with JFileChooser.
     */
    private void openFileDialog() {
        JFileChooser fc;
        String fileName;
        fc = new JFileChooser();
        if (filter != null) {
            fc.setFileFilter(filter);
        }
        if (foldersOnly) {
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        }
        String currentFolder = "";
        if (fileTextField.getText() != "") {
            int lastSep = -1;
            if (fileTextField.getText().contains("\\")) {
                lastSep = fileTextField.getText().lastIndexOf("\\");
            } else {
                lastSep = fileTextField.getText().lastIndexOf("/");
            }
            if (lastSep >= 0) {
                currentFolder = fileTextField.getText().substring(0, lastSep);
            }
        }
        fc.setCurrentDirectory(new File(currentFolder));
        int returnVal = fc.showOpenDialog(new JPanel());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fileName = fc.getSelectedFile().toString();
            fileTextField.setText(fileName);
        }
    }
}
