import java.awt.*;
import java.util.*;
import javax.swing.*;

public class StaticSquare extends StaticShape
{
	private double x;
	private double y;
	private double side;
	private Color color;

	public StaticSquare(double x, double y, double side, Color color)
	{
		super(x, y, color);
		this.x = x;
		this.y = y;
		this.side = side;
		this.color = color;
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
		peri = x + x + y + y;
		return peri;
	}
	
	public void draw(java.awt.Graphics g)
	{
		g.drawRect(80, 30, 200, 200);
	}
}
