package driver;

import adt.Response;
import adt.Row;
import adt.Database;
import adt.Table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DSelect implements Driver {
	private static final Pattern pattern;
	static {
		pattern = Pattern.compile(
				"SELECT\\s+(\\*|(?:[a-z][a-z0-9_]*(?:\\s+AS\\s+[a-z][a-z0-9_]*)?)(?:\\s*,\\s*[a-z][a-z0-9_]*(?:\\s+AS\\s+[a-z][a-z0-9_]*)?)*)\\s+FROM\\s+([a-z][a-z0-9_]*)",
				Pattern.CASE_INSENSITIVE);
	}

	@Override
	public Response execute(Database db, String query) {
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches())
			return null;
		String[] columns = matcher.group(1).split("\\s*,\\s*");
		String table_name = matcher.group(2);
		if (!db.containsKey(table_name)) {
			return new Response(false, "table does not exist", null);
		}
		String pn = null;
		Object pnVal = null;
		Table table = new Table(db.get(table_name));
		ArrayList<String> colN = (ArrayList<String>) table.getSchema().get("column_names");
		ArrayList<String> colT = (ArrayList<String>) table.getSchema().get("column_types");
		ArrayList<String> newNames = new ArrayList<String>();
		ArrayList<String> newTypes = new ArrayList<String>();
		ArrayList<String> rowCol = new ArrayList<String>();
		Row[] rows = table.values().toArray(new Row[table.values().size()]);
		int numPrimary = 0;
		Table newTable = new Table();
		String prim = (String) table.getSchema().get("primary_column_name");
		// if all are selected
		if (columns[0].equals("*")) {
			table = new Table(db.get(table_name));
			table.getSchema().put("table_name", null);
			return new Response(true, table_name, table);
		}
		// if no *
		else {
			for (int i = 0; i < columns.length; i++) {
				String[] c = columns[i].split("\\s+");
				int len = c.length;
				if (c.length == 1) {
					if (newNames.contains(c[0])) {
						return new Response(false, "name repeated", null);
					}
					if (c[0].equals(prim)) {
						numPrimary += 1;
					}
					newNames.add(c[0]);
					newTypes.add(colT.get(colN.indexOf(c[0])));
					rowCol.add(c[0]);
				} else if (c.length == 3) {
					if (newNames.contains(c[2])) {
						return new Response(false, "name repeated", null);
					}
					if (c[0].equals(prim)) {
						numPrimary += 1;
					}
					newNames.add(c[2]);
					newTypes.add(colT.get(colN.indexOf(c[0])));
					rowCol.add(c[0]);
				} else {
					return new Response(false, "incorrect naming", null);
				}
			}
			if (numPrimary < 1) {
				return new Response(false, "primary bad", null);
			}
			for (int j = 0; j < rows.length; j++) {
				Row r = new Row();
				boolean flag = false;
				for (int i = 0; i < rowCol.size(); i++) {
					if (rows[j].get(rowCol.get(i)) != null) {
						r.put(newNames.get(i), rows[j].get(rowCol.get(i)));
					}
					if (prim.equals(rowCol.get(i)) && flag == false) {
						pn = newNames.get(i);
						flag = true;
						pnVal = rows[j].get(rowCol.get(i));
					}
				}
				newTable.put(pnVal, r);
			}
		}
		newTable.getSchema().put("table_name", null);
		newTable.getSchema().put("primary_column_name", pn);
		newTable.getSchema().put("column_names", newNames);
		newTable.getSchema().put("column_types", newTypes);
		return new Response(true, table_name, newTable);
	}
}
