package driver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import adt.Database;
import adt.Response;

public class DDumpTable implements Driver {

	private static final Pattern pattern;
	static {
		pattern = Pattern.compile("DUMP\\s+TABLE\\s+([a-zA-z0-9_]+)", Pattern.CASE_INSENSITIVE);
	}

	@Override
	public Response execute(Database db, String query) {
		// TODO Auto-generated method stub
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches())
			return null;

		String table_name = matcher.group(1);
		if (db.get(table_name) != null) {
			db.remove(table_name);
			return new Response(true, "table deleted", db.get(table_name));
		} else
			return new Response(false, "table does not exist", null);
	}

}
