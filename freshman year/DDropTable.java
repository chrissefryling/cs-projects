package driver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import adt.Database;
import adt.Response;
import adt.Table;

public class DDropTable implements Driver {
	private static final Pattern pattern;
	static {
		pattern = Pattern.compile("DROP\\s+TABLE\\s+([a-zA-z0-9_]+)", Pattern.CASE_INSENSITIVE);
	}

	@Override
	public Response execute(Database db, String query) {
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches())
			return null;

		String table_name = matcher.group(1);
		if (db.isEmpty()) {
			return new Response(false, "empty db", null);
		}
		if (db.get(table_name) == null || table_name == null) {
			return new Response(false, "no matching name", null);
		}

		Table table = db.get(table_name);

		db.remove(table_name);

		return new Response(true, table_name, table);
	}
}
