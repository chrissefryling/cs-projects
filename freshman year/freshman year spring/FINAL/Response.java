package adt;

/** 
 * This class is a hash map alias providing
 * a Field Name -> Field Value mapping.
 * 
 * Additional non-map features can be implemented.
 */
public class Response extends HashMap<String, Object> {
	private static final long serialVersionUID = 1392865719114639315L;

	/** Do not modify. **/
    public Response() {
    	super();
    }
    
    /** Do not modify. **/
    public Response(Response response) {
    	super(response);
    }
    
    /** Do not modify. **/
    public Response(boolean success, String message, Table table) {
    	this.put("success", success);
    	this.put("message", message);
    	this.put("table", table);
    }
}