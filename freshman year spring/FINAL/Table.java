package adt;

import java.io.Serializable;

import adt.HashMap;

/** 
 * This class is a hash map alias providing
 * a Primary Key Value -> Row mapping.
 * 
 * Additional non-map features can be implemented.
 */
public class Table extends HashMap<Object, Row> implements Serializable{
	private static final long serialVersionUID = -3681477684147554400L;
	
	/** Do not modify. **/
	private Schema schema;
	
	/** Do not modify. **/
	public Schema getSchema() {
		return schema;
	}
	
	/** Do not modify. **/
	public void setSchema(Schema schema) {
		this.schema = schema;
	}
	
	/** Do not modify. **/
	public Table() {
		super();
		setSchema(new Schema());
	}
	
	/** Do not modify. **/
	public Table(Table table) {
		super(table);
		setSchema(new Schema(table.schema));
	}
}