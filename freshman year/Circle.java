import edu.princeton.cs.introcs.StdDraw;

/*
 * @author Chrisse Fryling
 * @date October 10 2017
 * 
 * This class creates a circle. 
 * it can also calculate the area of a circle and the perimeter
 */
public class Circle extends GraphicObject {
	private double radius;

	/*
	 * Constructor class
	 * 
	 * @param newX,newY,red,green,blue,newRadius
	 * 
	 * @return
	 */
	public Circle(double newX, double newY, int red, int green, int blue, double newRadius) {
		super(newX, newY, red, green, blue);
		this.radius = newRadius;
	}

	/*
	 * draw class
	 * 
	 * @param
	 * 
	 * @return
	 */
	public void draw() {
		StdDraw.setCanvasSize(1000, 1000);
		StdDraw.setXscale(0, 1000);
		StdDraw.setYscale(0, 1000);

		StdDraw.setPenRadius(0.02);

		StdDraw.setPenColor(super.getColor());
		StdDraw.circle(super.getX(), super.getY(), radius);
	}

	/*
	 * calculates the area of the circle
	 * 
	 * @param
	 * 
	 * @return area
	 */
	public double calculateArea() {
		return 3.14 * (radius * radius);
	}

	/*
	 * calculates the perimeter of the circle
	 * 
	 * @param
	 * 
	 * @return perimeter
	 */
	public double calculatePerimeter() {
		return (2 * 3.14 * radius);
	}

	/*
	 * to string class
	 * 
	 * @param
	 * 
	 * @return string object of class
	 */
	public String toString() {
		return "Area: " + calculateArea() + " Perimeter: " + calculatePerimeter() + " Radius: " + radius
				+ super.toString();
	}

}
