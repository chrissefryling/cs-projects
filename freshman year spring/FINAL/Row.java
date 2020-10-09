package adt;

import java.io.Serializable;

import adt.HashMap;

/** 
 * This class is a hash map alias providing
 * a Field Name -> Field Value mapping.
 * 
 * Additional non-map features can be implemented.
 */
public class Row extends HashMap<String, Object> implements Serializable {
	private static final long serialVersionUID = -5333500297549763810L;

	/** Do not modify. **/
    public Row() {
    	super();
    }
    
    /** Do not modify. **/
    public Row(Row row) {
    	super(row);
    }
}