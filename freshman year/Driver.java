
/** 
 * A class containing a main method, instantiating the array representing the matrix,
 * prompting the user for a file name containing the maze contents and opening a Scanner
 * attached to the file, a.	and calling all of the other methods.
 * THIS METHOD MUST ALSO USE TRY/CATCH BLOCKS TO INSURE THAT THE FILES OPENS CORRECTLY.
 * 
 * @author Christine Fryling
 * @date 
 **/

import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {
		// variables
		int[][] theMaze = new int[15][15];
		Scanner input = new Scanner(System.in);
		System.out.println("Input file path: ");
		String filePath = input.nextLine();
		try {
			File file = new File(filePath);
			Scanner inputFile = new Scanner(file);
			MazeOperations.fillMaze(theMaze, inputFile);
			MazeOperations.printMaze(theMaze);
			MazeOperations.traverseMaze(theMaze, 0, 0);
			MazeOperations.printMaze(theMaze);
		} catch (FileNotFoundException e) {
			System.out.println("Filepath does not exist.");
		}
		input.close();

	}
}
