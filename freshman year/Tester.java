import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * This class is the main class for Project 2. It calls a method that fills the array,
 * a method that draws the shapes, and a method that prints the shapes.
 */
public class Tester {

	public static void main(String[] args) {

		GraphicObject[] list = new GraphicObject[20];

		Scanner input = new Scanner(System.in);
		System.out.println("Please insert data filepath: ");
		String filePath = input.nextLine();

		try {
			File file = new File(filePath);
			Scanner read = new Scanner(file);
			ObjectOperations.fillArray(list, read);
			ObjectOperations.drawList(list);
			ObjectOperations.printList(list);
		} catch (FileNotFoundException e) {
			System.out.println("Filepath does not exist.");
		}
		input.close();
	}

}
