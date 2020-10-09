package driver;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import adt.Database;
import adt.Response;
import adt.Row;
import adt.Table;

public class DInsertInto implements Driver {

	private static final Pattern pattern;
	static {
		pattern = Pattern.compile("INSERT\\s+INTO\\s+([a-z_0-9]+)\\s+(?:\\((.+)\\))?\\s*VALUES\\s+\\((.*)\\)",
				// INSERT\s+INTO\s+([a-z_0-9]+)\s+\(([,a-z0-9_\"\s]+)\)+\s+VALUES\s+\(([,a-z0-9_"\s]+)\)
				Pattern.CASE_INSENSITIVE);
	}

	@Override
	public Response execute(Database db, String query) {
		// TODO Auto-generated method stub
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches())
			return null;

		String table_name = matcher.group(1).trim();
		if (db.get(table_name) == null) {
			return new Response(false, "Table does not exist.", null);
		}
		ArrayList<String> values = new ArrayList<String>();
		ArrayList<String> columns = new ArrayList<String>();
		ArrayList<String> types = new ArrayList<String>();
		//if(matcher.group(2).trim();)
		//String c = matcher.group(2).trim();
		if (matcher.group(2) == null) {
			columns = (ArrayList<String>) db.get(table_name).getSchema().get("column_names");
		} else {
			String c = matcher.group(2).trim();
			String[] cols = c.split("\\s*,\\s*");
			for (int i = 0; i < cols.length; i++) {
				columns.add(cols[i]);
			}
		}
		String v = matcher.group(3).trim();
		String[] v2 = v.split("\\s*,\\s*");
		Table table = new Table();
		for (int i = 0; i < v2.length; i++) {
			values.add(v2[i]);
		}
		for (int z = 0; z < columns.size(); z++) {
			int index = ((ArrayList<String>) db.get(table_name).getSchema().get("column_names"))
					.indexOf(columns.get(z));
			types.add(((ArrayList<String>) db.get(table_name).getSchema().get("column_types")).get(index));
		}
		Row r = new Row();
		Object primary = null;
		if (values.size() != columns.size()) {
			return new Response(false, "unmatched size", null);
		}
		if (values.size() != types.size()) {
			return new Response(false, "unmatched size", null);
		}

		for (int j = 0; j < columns.size(); j++) {
			if (r.containsKey(columns.get(j))) {
				return new Response(false, "same name", null);
			}
			if (db.get(table_name).getSchema().get("primary_column_name").equals(columns.get(j))) {
				if (primary != null) {
					return new Response(false, "error", null);
				}
				primary = values.get(j);
				table.getSchema().put("primary_column_name", columns.get(j));
				if(db.get(table_name).containsKey(values.get(j).replaceAll("\"", "")))
				{
					return new Response(false, "null primary", null);
				}
				if (values.get(j).toLowerCase().equals("null")) {
					return new Response(false, "null primary", null);
				}
				if (types.get(j).toLowerCase().equals("string")) {
					primary = ((String) primary).replaceAll("\"", "");
				}
			}
			if (types.get(j).toLowerCase().equals("string") && values.get(j).toLowerCase().matches("\".*\"")) {
				r.put(columns.get(j), values.get(j).replaceAll("\"", ""));
			} else if (types.get(j).toLowerCase().equals("integer") && values.get(j).matches("[-+]?[1-9][0-9]*|0")) {
				r.put(columns.get(j), Integer.parseInt(values.get(j)));
			} else if (types.get(j).toLowerCase().equals("boolean")
					&& values.get(j).toLowerCase().matches("true|false")) {
				r.put(columns.get(j), Boolean.parseBoolean(values.get(j)));
			} else if (values.get(j).toLowerCase().matches("null")) {

			} else {
				return new Response(false, "doesnt match", null);
			}
		}
		if (primary == null) {
			return new Response(false, "null primary", null);
		}
		table.put(primary, r);
		table.getSchema().put("column_names", db.get(table_name).getSchema().get("column_names"));
		table.getSchema().put("column_types", db.get(table_name).getSchema().get("column_types"));
		table.getSchema().put("table_name", null);
		db.get(table_name).put(primary, r);
		return new Response(true, "table: " + table_name + " number of rows: ", table);
	}

}
