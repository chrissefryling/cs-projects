import java.util.Scanner;

/*
 * This class can manipulate an array of graphic objects
 */
public class ObjectOperations {
	/*
	 * This method reads a data file containing information about shapes to be drawn
	 * to the screen.
	 */
	public static void fillArray(GraphicObject[] objectList, Scanner filename) {
		for (int i = 0; i < 20; i++) {
			String type = filename.next();
			if (type == "S") {
				double newX = filename.nextDouble();
				double newY = filename.nextDouble();
				int red = filename.nextInt();
				int green = filename.nextInt();
				int blue = filename.nextInt();
				double sideLength = filename.nextDouble();
				objectList[i] = new Square(newX, newY, red, green, blue, sideLength);
			} else if (type == "R") {
				double newX = filename.nextDouble();
				double newY = filename.nextDouble();
				int red = filename.nextInt();
				int green = filename.nextInt();
				int blue = filename.nextInt();
				double newLength = filename.nextDouble();
				double newWidth = filename.nextDouble();
				objectList[i] = new Rectangle(newX, newY, red, green, blue, newLength, newWidth);
			} else if (type == "C") {
				double newX = filename.nextDouble();
				double newY = filename.nextDouble();
				int red = filename.nextInt();
				int green = filename.nextInt();
				int blue = filename.nextInt();
				double radius = filename.nextDouble();
				objectList[i] = new Circle(newX, newY, red, green, blue, radius);
			} else if (type == "E") {
				double newX = filename.nextDouble();
				double newY = filename.nextDouble();
				int red = filename.nextInt();
				int green = filename.nextInt();
				int blue = filename.nextInt();
				double semiMajorAxis = filename.nextDouble();
				double semiMinorAxis = filename.nextDouble();
				objectList[i] = new Ellipse(newX, newY, red, green, blue, semiMajorAxis, semiMinorAxis);
			}
			filename.nextLine();
		}
		filename.close();
	}

	/*
	 * This method iterates through the objectList and calls the draw method to draw
	 * each shape to the screen.
	 * 
	 * @param objectList
	 * 
	 * @return
	 */
	public static void drawList(GraphicObject[] objectList) {
		for (int i = 0; i < 20; i++) {
			objectList[i].draw();
		}
	}

	/*
	 * This method iterates through the ObjectList and calls the toString method for
	 * each object.
	 * 
	 * @objectList
	 */
	public static void printList(GraphicObject[] objectList) {
		for (int i = 0; i < 20; i++) {
			objectList[i].toString();
		}
	}

}
