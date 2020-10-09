import java.awt.*;
import java.util.*;

public class StaticSquare extends StaticShape
{
	private double side;
	public StaticSquare(double x, double y, double side, Color color)
	{
		super(x, y, color);
		this.side = side;	
	}
	public double getArea()
	{
		double area = 0;
		area = x * y;
		return area;
	}
	public double getPerimeter()
	{
		double peri = 0;
		peri = 2 * x + 2*y ;
		return peri;
	}
	public void draw()
	{
		StdDraw.filledSquare(x,y, side);
		this.setColor(color);
		StdDraw.setPenColor(color);
	}
}
