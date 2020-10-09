package json1;

import javax.json.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class Sandbox {
	public static void main(String[] args) {
		Map<String, Integer> a = new HashMap<>();
		a.put("alpha", 5);
		a.put("beta",  4);
		a.put("delta", 5);
		a.put("gamma", 5);
		a.put("tau",   3);
		a.put("pi",    2);
		write(a);
		System.out.println(a);
		
		Map<String, Integer> b = read();
		System.out.println(b);
		
		System.out.println(a.equals(b));
		System.out.println(a == b);
	}
	
	public static void write(Map<String, Integer> row) {
		try {
		    JsonWriter writer = Json.createWriter(new FileOutputStream("data/example1.json"));
		    
		    JsonObjectBuilder builder = Json.createObjectBuilder();
		    for (String key: row.keySet()) {
		    	builder.add(key, row.get(key));
		    }
		    JsonObject object = builder.build();
		    
		    writer.writeObject(object);
		    
		    writer.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Map<String, Integer> read() {
		Map<String, Integer> result = null;
		try {
			JsonReader reader = Json.createReader(new FileInputStream("data/example1.json"));
		    
		    JsonObject object = reader.readObject();
		    
		    result = new HashMap<>();
		    for (String key: object.keySet()) {
		    	result.put(key, object.getInt(key));
		    }
		    
		    reader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
