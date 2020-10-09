import java.awt.*;
import java.util.*;

public abstract class DynamicShape extends StaticShape 
{
	private double x;
	private double y;
	private Color color;
	private double velocityX;
	private double velocityY;
	
	public DynamicShape(double x, double y, Color color, double velocityX, double velocityY) 
	{
		super(x,y,color);
		this.x = x; 
		this.y = y;
		this.color = color;
		this.velocityX = velocityX;
		this.velocityY = velocityY;
	}
	
	public abstract void update(double minX, double maxX, double minY, double maxY);
	
	
	
	

}
