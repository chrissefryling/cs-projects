package serial1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Sandbox {
	public static void main(String[] args) {
		Tuple a = new Tuple(3, 4);
		serialize(a);
		System.out.println(a);

		Tuple b = deserialize();
		System.out.println(b);
		
		System.out.println(a.equals(b));
		System.out.println(a == b);
	}
	
	public static void serialize(Tuple obj) {
		ObjectOutputStream stream = null;
		FileOutputStream file = null;
		try {
			file = new FileOutputStream("data/example1.ser");
			stream = new ObjectOutputStream(file);
			
			stream.writeObject(obj);

			stream.close();
			file.close();
		}
		catch (IOException i) {
			i.printStackTrace();
		}
	}
	
	public static Tuple deserialize() {
		Tuple result = null;
		ObjectInputStream stream = null;
		FileInputStream file = null;
		try {
			file = new FileInputStream("data/example1.ser");
			stream = new ObjectInputStream(file);
			
			result = (Tuple) stream.readObject();

			stream.close();
			file.close();
		}
		catch (IOException i) {
			i.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
}
