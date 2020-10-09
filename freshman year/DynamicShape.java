import java.awt.*;
import java.util.*;

public abstract class DynamicShape extends StaticShape 
{
	public double velocityX;
	public double velocityY;
	public DynamicShape(double x, double y, Color color, double velocityX, double velocityY) 
	{
		super(x,y,color);
		this.velocityX = velocityX;
		this.velocityY = velocityY;
	}
	public abstract void update(double minX, double maxX, double minY, double maxY);
	
	

}
