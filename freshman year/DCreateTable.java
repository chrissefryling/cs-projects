package driver;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import adt.Database;
import adt.Response;
import adt.Table;

public class DCreateTable implements Driver {
	private static final Pattern pattern;
	private static final Pattern pattern1;
	static {
		pattern = Pattern.compile("CREATE\\s+TABLE\\s+([a-z][a-z0-9_]*)\\s+\\((.*)\\)",
				// (?:PRIMARY)?\\s*(INTEGER|STRING|BOOLEAN)\\s+([^\\\"]*)\\s",
				Pattern.CASE_INSENSITIVE
		// CREATE\s+TABLE\s+([^\"]*)\s+(?:PRIMARY)?\s*(INTEGER|STRING|BOOLEAN)\s+([^\"]*)\s
		);
		pattern1 = Pattern.compile("(?:PRIMARY)?\\s*(INTEGER|STRING|BOOLEAN)\\s+([a-z0-9_]*)\\s*",
				Pattern.CASE_INSENSITIVE);
	}

	@Override
	public Response execute(Database db, String query) {
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches()) 
			return null;

		String table_name = matcher.group(1).trim();
		String column_deff = matcher.group(2).trim();
		String[] arr = column_deff.split(",");
		Table table = new Table();
		String primary = "";
		int primCount = 0;
		List<String> names = new ArrayList<>();
		List<String> types = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			String ar = arr[i].trim();
			Matcher matcher2 = pattern1.matcher(ar);
			if (!matcher2.matches())
				return new Response(false, "incorrect col. def", null);
			String[] prim = ar.split(" ");
			if (prim.length == 3) {
				primary = matcher2.group(2).trim();
				primCount++;
			}
			String type = matcher2.group(1).trim().toLowerCase();
			String colname = matcher2.group(2).trim();
			types.add(type);
			names.add(colname);
		}

		if (primary == "") {
			return new Response(false, "no primary", null);
		}
		if (primCount > 1) {
			return new Response(false, "too many primaries", null);
		}

		table.getSchema().put("table_name", table_name);
		table.getSchema().put("primary_column_name", primary);
		table.getSchema().put("column_names", names);
		table.getSchema().put("column_types", types);
		db.put(table_name, table);

		return new Response(true, "num of columns: " + names.size() + " " + table.getSchema(), table);
	}
}
