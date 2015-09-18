/**
 * 
 */
package de.sfdccommander.model;

import java.util.HashMap;

import com.sforce.soap.partner.Field;

import de.sfdccommander.controller.helper.CharacterEncoder;

/**
 * @author jochen
 *
 */
public class CustomObjectFieldMap extends HashMap<String, String> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public CustomObjectFieldMap(final Field aField) {
        this.put("fullName", CharacterEncoder.encode(aField.getName()));
        this.put("label", CharacterEncoder.encode(aField.getLabel()));
        this.put("required", "true");
        if (aField.getExternalId() != null) {
            this.put("externalId", aField.getExternalId() + "");
        }
        this.put("unique", aField.isUnique() + "");
        this.put("type", aField.getType().getValue());

        if (aField.getScale() != 0) {
            this.put("scale", aField.getScale() + "");
        }
        if (aField.getPrecision() != 0) {
            this.put("precision", aField.getPrecision() + "");
        }
        if (aField.getLength() != 0) {
            this.put("length", aField.getLength() + "");
        }
        if (aField.getReferenceTo() != null) {
            this.put("referenceTo",
                    CharacterEncoder.encode(aField.getReferenceTo()[0]));
        }
        if (aField.getRelationshipName() != null) {
            this.put("relationshipName",
                    CharacterEncoder.encode(aField.getRelationshipName()));
        }
        if (aField.getInlineHelpText() != null) {
            this.put("inlineHelpText", aField.getInlineHelpText());
        }
        this.put("description",
                "Standard Field: Please review the salesforce.com documentation");
    }

}
