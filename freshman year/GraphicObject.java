import java.awt.Color;

/*
 * This class is the main graphic object.
 * 
 */
public abstract class GraphicObject {
	private double x;
	private double y;
	private Color color;

	/*
	 * constructor class
	 * 
	 * @param
	 * 
	 * @return
	 */
	public GraphicObject(double newX, double newY, int red, int green, int blue) {
		this.x = newX;
		this.y = newY;
	}

	/*
	 * getter method for x
	 * 
	 * @param
	 * 
	 * @return x
	 */
	public double getX() {
		return x;
	}

	/*
	 * getter method for y
	 * 
	 * @param
	 * 
	 * @return y
	 */
	public double getY() {
		return y;
	}

	/*
	 * getter method for color
	 * 
	 * @param
	 * 
	 * @return color
	 */
	public Color getColor() {
		return color;
	}

	/*
	 * to string method
	 * 
	 * @param
	 * 
	 * @return string object of class
	 */
	public String toString() {
		return " Color: " + color + " Y: " + y + " X: " + x;
	}

	public abstract void draw();

	public abstract double calculateArea();

	public abstract double calculatePerimeter();

}
