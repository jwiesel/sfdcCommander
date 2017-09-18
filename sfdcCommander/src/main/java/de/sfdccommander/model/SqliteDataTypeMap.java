/**
 * 
 */
package de.sfdccommander.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jochen
 *
 */
public class SqliteDataTypeMap extends HashMap<String, String> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public SqliteDataTypeMap() {
        super();
        init();
    }

    private void init() {
        // primitive sf data types
        this.put("base64", "TEXT");
        this.put("boolean", "BOOLEAN");
        this.put("byte", "INT");
        this.put("date", "DATE");
        this.put("datetime", "DATETIME");
        this.put("double", "DOUBLE");
        this.put("int", "INT");
        this.put("string", "VARCHAR(255)");
        this.put("time", "DATETIME");
        // additional data types
        this.put("address", "VARCHAR(255)");
        this.put("anyType", "VARCHAR(255)");
        this.put("calculated", "TEXT");
        this.put("combobox", "VARCHAR(255)");
        this.put("currency", "VARCHAR(255)");
        this.put("DataCategoryGroupReference", "VARCHAR(100)");
        this.put("email", "VARCHAR(100)");
        this.put("encryptedstring", "VARCHAR(180)");
        this.put("id", "VARCHAR(20)");
        this.put("JunctionIdList", "TEXT");
        this.put("location", "VARCHAR(255)");
        this.put("masterrecord", "VARCHAR(20)");
        this.put("multipicklist", "VARCHAR(255)");
        this.put("percent", "DOUBLE");
        this.put("phone", "VARCHAR(50)");
        this.put("picklist", "VARCHAR(255)");
        this.put("reference", "VARCHAR(20)");
        this.put("textarea", "TEXT");
        this.put("url", "VARCHAR(255)");
    }

    /**
     * @param aInitialCapacity
     */
    public SqliteDataTypeMap(int aInitialCapacity) {
        super(aInitialCapacity);
    }

    /**
     * @param aM
     */
    public SqliteDataTypeMap(Map<? extends String, ? extends String> aM) {
        super(aM);
    }

    /**
     * @param aInitialCapacity
     * @param aLoadFactor
     */
    public SqliteDataTypeMap(int aInitialCapacity, float aLoadFactor) {
        super(aInitialCapacity, aLoadFactor);
    }

}
