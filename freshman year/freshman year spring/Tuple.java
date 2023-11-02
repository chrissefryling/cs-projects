package serial1;
import java.io.Serializable;

public class Tuple implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int x, y;
	
	public Tuple(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() { 
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int setX(int x) { 
		int temp = this.x;
		this.x = x;
		return temp;
	}
	
	public int setY(int y) { 
		int temp = this.y;
		this.y = y;
		return temp;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
	
	@Override
	public boolean equals(Object other) {
		if (other != null && other instanceof Tuple) {
			Tuple that = (Tuple) other;
			return this.x == that.x && this.y == that.y;
		}
		else return false;
	}
}
