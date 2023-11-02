package driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
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
import javax.xml.bind.Marshaller;
import javax.json.*;

public class DExport implements Driver {

	private static final Pattern pattern;
	static {
		pattern = Pattern.compile("EXPORT\\s+([a-zA-z0-9_]+)\\s+([a-z0-9_]+)(.JSON|.XML)", Pattern.CASE_INSENSITIVE);
	}

	@Override
	public Response execute(Database db, String query) {
		// TODO Auto-generated method stub
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches())
			return null;
		String table_name = matcher.group(1);
		String file_name = matcher.group(2);
		String type = matcher.group(3);
		Table table = db.get(table_name);
		File file = new File(file_name + type);
		ArrayList<String> columns = (ArrayList<String>) table.getSchema().get("column_names");
		ArrayList<String> types = (ArrayList<String>) table.getSchema().get("column_types");
		Set<Entry<Object, Row>> val = table.entrySet();
		String primary = (String) table.getSchema().get("primary_column_name");

		if (!db.containsKey(table_name)) {
			return new Response(false, "table does not exist.", null);
		}
		// this does not work
		if (file.getAbsoluteFile().exists() && file.isFile()) {
			return new Response(false, "file already in use.", null);
		}

		if (type.equals(".json")) {
			try {
				JsonWriter writer = Json.createWriter(new FileOutputStream(file_name + ".json"));
				JsonObjectBuilder builder = Json.createObjectBuilder();
				JsonArrayBuilder cols = Json.createArrayBuilder();
				JsonArrayBuilder typ = Json.createArrayBuilder();
				builder.add("table_name", table_name);
				builder.add("primary_column_name", primary);
				for (int i = 0; i < columns.size(); i++) {
					cols.add(columns.get(i));
				}
				builder.add("column_names", cols.build());
				for (int j = 0; j < types.size(); j++) {
					typ.add(types.get(j));
				}
				builder.add("column_types", typ.build());
				for (Entry<Object, Row> e : val) {
					Row row = (Row) e.getValue();
					JsonObjectBuilder rows = Json.createObjectBuilder();
					for (int i = 0; i < columns.size(); i++) {
						Object rowEntryValue = row.get(columns.get(i));
						if (rowEntryValue instanceof Integer) {
							rows.add(columns.get(i), (Integer) row.get(columns.get(i)));
						} else if (rowEntryValue instanceof String) {
							rows.add(columns.get(i), (String) row.get(columns.get(i)));
						} else if (rowEntryValue instanceof Boolean) {
							rows.add(columns.get(i), (Boolean) row.get(columns.get(i)));
						}
					}
					builder.add(e.getKey().toString(), rows);
				}
				JsonObject jObject = builder.build();
				writer.writeObject(jObject);
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (type.equals(".xml")) {
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance();
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				jaxbMarshaller.marshal(table_name, new File(file_name + ".xml"));
				jaxbMarshaller.marshal(primary, new File(file_name + ".xml"));
				jaxbMarshaller.marshal(types, new File(file_name + ".xml"));
				jaxbMarshaller.marshal(columns, new File(file_name + ".xml"));
			} catch (JAXBException e) {
				e.printStackTrace();
			}

		} else {
			return new Response(false, "something is wrong with the extention.", null);
		}
		return new Response(true, "filename: " + file_name + type, table);
	}

}
