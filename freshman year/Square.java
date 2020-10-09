import edu.princeton.cs.introcs.StdDraw;

/*
 * this class creates a square. it can draw a square, calculate the area,
 * or calculate the perimeter.
 */
public class Square extends GraphicObject {
	private double sideLength;

	/*
	 * constructor class
	 * 
	 * @param newX,newY,red,green,blue,sideLength
	 * 
	 * @return
	 */
	public Square(double newX, double newY, int red, int green, int blue, double sideLength) {
		super(newX, newY, red, green, blue);
		this.sideLength = sideLength;
	}

	/*
	 * this class draws the square
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
		StdDraw.square(super.getX(), super.getY(), sideLength / 2);
	}

	/*
	 * this class calculates the area
	 * 
	 * @param
	 * 
	 * @return area
	 */
	public double calculateArea() {
		return sideLength * sideLength;
	}

	/*
	 * this class calculates the perimeter
	 * 
	 * @param
	 * 
	 * @return
	 */
	public double calculatePerimeter() {
		return sideLength * 4;
	}
}
