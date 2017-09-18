/**
 * 
 */
package de.sfdccommander.controller.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

/**
 * KeyListener which does button click when typing in "ENTER".
 * 
 * @author jochen
 * 
 */
public class ClickButtonHandler implements KeyListener {

    /**
     * JButton which should be clicked.
     */
    private final JButton button;

    /**
     * @param aButton
     *            button to be clicked
     */
    public ClickButtonHandler(final JButton aButton) {
        this.button = aButton;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
     */
    @Override
    public void keyTyped(final KeyEvent e) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
     */
    @Override
    public final void keyPressed(final KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_ENTER) {
            button.doClick();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
     */
    @Override
    public void keyReleased(final KeyEvent e) {

    }

}
