import java.util.*;
import java.awt.*;

public class ShapeTester {

	public static void main(String[] args) 
	{
		Graphics g;
		double x = 2;
		double y = 3;
		double side = 4;
		double radius = 4;
		Color color = Color.BLUE;
		double velocityX = 5;
		double velocityY = 5;
		
		
		StaticSquare square = new StaticSquare(x, y, side, color);
		BouncingBall ball = new BouncingBall(x, y, radius, color, velocityX, velocityY);

		square.draw(g);
		ball.draw(g);
	}

}
