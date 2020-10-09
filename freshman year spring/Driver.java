package driver;

import adt.Database;
import adt.Response;

/** 
 * This interface stipulates the protocols
 * for query drivers.
 * 
 * Do not modify this interface.
 */
public interface Driver {
	public Response execute(Database db, String query);
}
