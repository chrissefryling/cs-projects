import edu.princeton.cs.introcs.StdDraw;

/*
 * This class creates a rectangle. It can draw a rectangle, 
 * calculate the area, and calculate the perimeter.
 */
public class Rectangle extends GraphicObject {
	private double length;
	private double width;

	/*
	 * constructor class
	 * 
	 * @param newX,newY,red,green,blue,newLength,newWidth
	 */
	public Rectangle(double newX, double newY, int red, int green, int blue, double newLength, double newWidth) {
		super(newX, newY, red, green, blue);
		this.length = newLength;
		this.width = newWidth;
	}

	/*
	 * draw class, draws a rectangle
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
		StdDraw.rectangle(super.getX(), super.getY(), width / 2, length / 2);
	}

	/*
	 * calculates the area of a rectangle
	 * 
	 * @param
	 * 
	 * @return area
	 */
	public double calculateArea() {
		return length * width;
	}

	/*
	 * calculates the perimeter of the rectangle
	 * 
	 * @param
	 * 
	 * @return perimeter
	 */
	public double calculatePerimeter() {
		return (length * 2) + (width * 2);
	}

}
