package driver;

import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.io.*;
import java.util.regex.Pattern;

import adt.Database;
import adt.HashMap;
import adt.Response;
import adt.Row;
import adt.Table;

import javax.xml.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.json.*;

public class DImport implements Driver {

	private static final Pattern pattern;
	static {
		pattern = Pattern.compile("IMPORT\\s+([a-z0-9_]+)(.JSON|.XML)\\s*", Pattern.CASE_INSENSITIVE);
	}

	@Override
	public Response execute(Database db, String query) {
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches())
			return null;
		String file_name = matcher.group(1);
		String type = matcher.group(2);
		Table table = new Table();
		//File file = new File(file_name + type);
		ArrayList<String> columns = new ArrayList<String>();
		ArrayList<String> types = new ArrayList<String>();
		//ArrayList<String> values = new ArrayList<String>();
		String primary_name = null;
		Row row = new Row();
		String table_name = null;
		if (type.equals(".json")) {
			try {
				JsonReader reader = Json.createReader(new FileInputStream(file_name + ".json"));
				JsonObject jObject = reader.readObject();
				reader.close();
				table_name = jObject.getString("table_name");
				primary_name = jObject.getString("primary_column_name");
				JsonArray cols = jObject.getJsonArray("column_names");
				JsonArray typ = jObject.getJsonArray("column_types");
				JsonValue v = jObject.get("rows");
				String valu = v.toString();
				String[] row1 = valu.split("},\\s*");
				for (int i = 0; i < cols.size(); i++) {
					columns.add(cols.getString(i));
				}
				for (int i = 0; i < typ.size(); i++) {
					types.add(typ.getString(i));
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (type.equals(".xml")) {
			try {
				File in = new File(file_name + ".xml");
				Unmarshaller unmarshaller = JAXBContext.newInstance().createUnmarshaller();
				
				//Object result = unmarshaller.unmarshal(in);
			} 
			catch (JAXBException e) {
				e.printStackTrace();
			}
		}

		table_name = check(table_name, db);
		table.getSchema().put("table_name", null);
		table.getSchema().put("primary_column_name", primary_name);
		table.getSchema().put("column_names", columns);
		table.getSchema().put("column_types", types);
		return new Response(true, "table name: " + table_name + " from file: " + file_name + type, table);
	}

	int check = 0;
	private String check(String name, Database db) {
		if (db.containsKey(name)) {
			check += 1;
			name = name + "_" + check;
		}
		return name;
	}

}
