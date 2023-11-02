package xml3;

import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import java.io.File;

public class Sandbox {
	public static void main(String[] args) {
		Element a = new Element("alpha");
		marshall(a);
		System.out.println(a);
		
		Element b = (Element) unmarshall();
		System.out.println(b);
		
		System.out.println(a.equals(b));
		System.out.println(a == b);
	}
	
	public static <T> void marshall(Element element) { // writing
		try {
			Marshaller marshaller = JAXBContext.newInstance(Element.class).createMarshaller();
		    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    
		    marshaller.marshal(element, new File("data/example3.xml"));
		} 
		catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static Element unmarshall() { // importing 
		Element result = null;
		try {
			File in = new File("data/example3.xml");
			Unmarshaller unmarshaller = JAXBContext.newInstance(Element.class).createUnmarshaller();
			
			result = (Element) unmarshaller.unmarshal(in);
		} 
		catch (JAXBException e) {
			e.printStackTrace();
		}
		return result;
	}
}
