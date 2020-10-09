import edu.princeton.cs.introcs.StdDraw;

/*
 * @author Chrisse Fryling
 * @date October 10 2017
 * 
 * This class creates an ellipse. It can draw an ellipse, calculate the area,
 * or calculate the perimeter.
 */
public class Ellipse extends GraphicObject {
	private double semiMajorAxis;
	private double semiMinorAxis;

	/*
	 * Class constructor
	 * 
	 * @param newX,newY,red,green,blue,newSemiMajor,newSemiMinor
	 * 
	 * @return
	 */
	public Ellipse(double newX, double newY, int red, int green, int blue, double newSemiMajor, double newSemiMinor) {
		super(newX, newY, red, green, blue);
		this.semiMajorAxis = newSemiMajor;
		this.semiMinorAxis = newSemiMinor;
	}

	/*
	 * draw class, draws the ellipse
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
		StdDraw.ellipse(super.getX(), super.getY(), semiMajorAxis, semiMinorAxis);
	}

	/*
	 * calculates the area
	 * 
	 * @param
	 * 
	 * @return area
	 */
	public double calculateArea() {
		return (3.14 * semiMajorAxis * semiMinorAxis);
	}

	/*
	 * calculates the perimeter
	 * 
	 * @param
	 * 
	 * @return perimeter
	 */
	public double calculatePerimeter() {
		return (2 * 3.14) * (Math.sqrt((Math.pow(semiMajorAxis, 2) + Math.pow(semiMinorAxis, 2)) / 2));
	}

	/*
	 * to string class
	 * 
	 * @param
	 * 
	 * @return string object of class
	 */
	public String toString() {
		return "Area: " + calculateArea() + " Perimeter: " + calculatePerimeter() + " Major Axis: " + semiMajorAxis
				+ " Minor Axis: " + semiMinorAxis + super.toString();
	}

}
