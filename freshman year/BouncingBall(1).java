import java.util.*;
import java.awt.*;

public class BouncingBall extends DynamicShape 
{
	private double x;
	private double y;
	private double radius;
	private Color color;
	private double velocityX;
	private double velocityY;
	private double minX;
	private double minY;
	private double maxY;
	private double maxX;
	
	public BouncingBall(double x, double y, double radius, Color color, double velocityX, double velocityY)
	{
		super(x,y,color,velocityX,velocityY);
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
		this.velocityX = velocityX;
		this.velocityY = velocityY;
	}
	
	public void update(double minX, double maxX, double minY, double maxY)
	{
		this.minX = minX;
		this.minY = minY;
		this.maxX = maxX;
		this.maxY = maxY;
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
		x = velocityX;
		y = velocityY;
		
		if (x + radius > maxX || x - radius < minX) 
		{
			velocityX = -1 * velocityX;
		}

		if (y + radius > maxY || y - radius < minY) 
		{
			velocityY = -1 * velocityY;
		}
		
	}
}
