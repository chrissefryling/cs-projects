import java.util.*;
import java.awt.*;

public class ShapeTester {

	public static void main(String[] args) 
	{
		double side = 20;
		double radius = 10;
		double x = 0;
		double y = 0;
		Color color = StdDraw.BLUE;
		double velocityX = 1;
		double velocityY = 1;
		
		
		StaticSquare square = new StaticSquare(25, 25, side, color);
		BouncingBall ball = new BouncingBall(75, 75, radius, color, velocityX, velocityY);

	
		StdDraw.setXscale(0,100);
		StdDraw.setYscale(0, 100);
		
		while(true){
		StdDraw.clear();
		square.draw();
		ball.draw();
		ball.update(0, 100, 0, 100);
		StdDraw.show(20);
		
		}
		
	}

}
