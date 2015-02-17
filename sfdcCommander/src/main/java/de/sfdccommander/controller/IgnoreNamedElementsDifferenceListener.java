/**
 * 
 */
package de.sfdccommander.controller;

import java.util.HashSet;
import java.util.Set;

import org.custommonkey.xmlunit.Difference;
import org.custommonkey.xmlunit.DifferenceConstants;
import org.custommonkey.xmlunit.DifferenceListener;
import org.w3c.dom.Node;

/**
 * @author jochen
 * 
 */
public class IgnoreNamedElementsDifferenceListener implements
        DifferenceListener {

    private final Set<String> blackList = new HashSet<String>();

    public IgnoreNamedElementsDifferenceListener(String... elementNames) {
        for (String name : elementNames) {
            blackList.add(name);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.custommonkey.xmlunit.DifferenceListener#differenceFound(org.custommonkey
     * .xmlunit.Difference)
     */
    @Override
    public int differenceFound(Difference aDifference) {
        if (aDifference.getId() == DifferenceConstants.TEXT_VALUE_ID) {
            if (blackList.contains(aDifference.getControlNodeDetail().getNode()
                    .getNodeName())) {
                return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
            }
        }

        return DifferenceListener.RETURN_ACCEPT_DIFFERENCE;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.custommonkey.xmlunit.DifferenceListener#skippedComparison(org.w3c
     * .dom.Node, org.w3c.dom.Node)
     */
    @Override
    public void skippedComparison(Node aControl, Node aTest) {
        // TODO Auto-generated method stub

    }

}
