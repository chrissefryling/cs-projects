package xml3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;

@XmlRootElement(name="element")
public class Element {
	private String type;
	private Object data;
	
	public Element() {
		data = null;
		type = null;
	}
	
	public Element(Object data) {
		if (data instanceof String || data instanceof Integer) {
			this.data = data;
			this.type = getType();
		}
		else throw new IllegalArgumentException();
	}
	
	@XmlAttribute
	public String getType() {
		if (data instanceof String)
			return "string";
		else if (data instanceof Integer)
			return "integer";
		else throw new IllegalStateException();
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@XmlElement
	public String getData() {
		return data.toString();
	}
	
	public void setData(String data) {
		if (type.equals("string"))
			this.data = data;
		else if (type.equals("integer"))
			this.data = Integer.parseInt(data);
		else throw new IllegalArgumentException();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other != null && other instanceof Element) {
			Element that = (Element) other;
			return this.type.equals(that.type) && this.data.equals(that.data);
		}
		else return false;
	}
	
	@Override
	public String toString() {
		if (data != null)
			return String.format("Element[%s]", data);
		else
			return "NullElement";
	}
}