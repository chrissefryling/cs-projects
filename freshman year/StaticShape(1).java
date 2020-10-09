import java.util.*;

import java.awt.*;

public abstract class StaticShape 
{
	public Color color;
	public double x;
	public double y;
	
	public StaticShape(double x, double y, Color color)
	{
		this.color = color;
		this.x = x;
		this.y = y;
		
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract void draw();
	
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
