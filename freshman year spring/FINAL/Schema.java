package adt;

import java.io.Serializable;

import adt.HashMap;

/** 
 * This class is a hash map alias providing
 * a Field Name -> Field Value mapping.
 * 
 * Additional non-map features can be implemented.
 */
public class Schema extends HashMap<String, Object> implements Serializable {
	private static final long serialVersionUID = 1312848533834221175L;

	/** Do not modify. **/
    public Schema() {
    	super();
    }
    
    /** Do not modify. **/
    public Schema(Schema schema) {
    	super(schema);
    }
}