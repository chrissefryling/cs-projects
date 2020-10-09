
/** 
 * contains 3 methods
 *  works the maze
 *  
 *  MARK THE PATH WTIH 7, 3 if visited
 *  1 indicates empty, 0 indicates a wall
 **/

import java.util.*;

public class MazeOperations {
	/*
	 * This method fills the maze with ints. EACH integer in the file is separated
	 * by a space, so that you can use nextInt() to read the integers.
	 * 
	 * @param theMaze - the array
	 * 
	 * @param inputFile - the file
	 * 
	 * @return void
	 */
	public static void fillMaze(int[][] theMaze, Scanner inputFile) {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				theMaze[i][j] = inputFile.nextInt();
			}
		}
	}

	/*
	 * called before and after the traversal prints the contents of the maze Each
	 * value in the row should be separated by a single space
	 * 
	 * @param theMaze - the array
	 * 
	 * @return void
	 */
	public static void printMaze(int[][] theMaze) {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(theMaze[i][j] + " ");
			}
			System.out.println();
		}
	}

	/*
	 * from main for the first activation, it will be invoked with col == 0 and row
	 * == 0 this is the recursive traversal algorithm
	 * 
	 * @param theMaze - the array
	 * 
	 * @param row - number of rows
	 * 
	 * @param col - number of cols
	 * 
	 * @return true or false - depending on if that move is legal
	 */
	public static boolean traverseMaze(int[][] theMaze, int row, int col) {
		// check if visited before, if not out of bounds, if not a 0.
		// mark visited
		// if in last element [14][14] return true
		// else move down one element

		if (row == 14 && col == 14) // if it reaches the end
		{
			return true;
		} else {

		}

		return false;
	}
}
