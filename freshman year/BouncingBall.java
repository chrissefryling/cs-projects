import java.util.*;
import java.awt.*;

public class BouncingBall extends DynamicShape 
{
	private double radius;
	public BouncingBall(double x, double y, double radius, Color color, double velocityX, double velocityY)
	{
		super(x,y,color,velocityX,velocityY);
	
		this.radius = radius;
	}
	public void update(double minX, double maxX, double minY, double maxY)
	{
	
		//x =  x + velocityX;
		setX(velocityX + x);
		//y = y +  velocityY;
		setY(velocityY + y);
		
		if (x + radius > maxX || x - radius < minX) 
		{
			velocityX = -1 * velocityX;
		}

		if (y + radius > maxY || y - radius < minY) 
		{
			velocityY = -1 * velocityY;
		}
	}
	
	public double getArea()
	{
		double area = 0;
		area = x * y;
		return area;
	}
	
	public double getPerimeter()
	{
		double perimeter = 0;
		perimeter = x + x + y + y;
		return perimeter;
	}
	
	public void draw()
	{
		StdDraw.filledCircle(x, y, radius);
		StdDraw.setPenColor(color);
		
	}
	
	
	
}
