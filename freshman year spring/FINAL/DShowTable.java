package driver;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import adt.Database;
import adt.Response;
import adt.Row;
import adt.Table;

public class DShowTable implements Driver {
	private static final Pattern pattern;
	static {
		pattern = Pattern.compile("SHOW\\s+TABLES\\s*", Pattern.CASE_INSENSITIVE);
	}

	@Override
	public Response execute(Database db, String query) {
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches())
			return null;
		List<String> names = new ArrayList<>();
		List<String> types = new ArrayList<>();
		types.add("string");
		names.add("table_name");
		names.add("row_count");
		types.add("integer");
		int num = db.size();
		if (db.size() == 0) {
			return new Response(false, "no values", null);
		}
		Table table = new Table();
		Row row = null;
		String[] tnames = db.keySet().toArray(new String[0]);
		for (int i = 0; i < tnames.length; i++) {
			row = new Row();
			row.put("table_name", tnames[i]);
			row.put("row_count", db.get(tnames[i]).size());
			table.put(tnames[i], row);
		}

		table.getSchema().put("table_name", null);
		table.getSchema().put("primary_column_name", "table_name");
		table.getSchema().put("column_names", names);
		table.getSchema().put("column_types", types);
		return new Response(true, "Number of tables: " + num, table);
	}
}