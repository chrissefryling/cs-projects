import java.util.*;
import java.awt.*;

public abstract class StaticShape 
{
	//Fields
	private double x;
	private double y;
	private Color color;
	
	//Constructor
	public StaticShape(double x, double y, Color color)
	{
		this.x = x;
		this.y = y;
		this.color = color;
	}
	//Abstract methods
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract void draw(java.awt.Graphics g);
	
	//Get methods
	public Color getColor()
	{
		return color;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	
	//Set methods
	public void setColor(Color color)
	{
		this.color = color;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
}
