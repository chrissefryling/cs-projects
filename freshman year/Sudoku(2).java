import java.io.*;
import java.util.*;

public class Sudoku {
///Users/Yasi/Downloads/sudoku_1.txt//
	private static int Row1 = 9;
	private static int Col1 = 9;
	private static int[][] sudoku = new int[Row1][Col1];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter filename: ");
		String file = scanner.nextLine();
		Sudoku test = new Sudoku(file);
		System.out.println("Sudoku Board Before: \n" + test.toString());
		test.solve();
		System.out.println("Suduko Board After: \n" + test.toString());
	}

	public Sudoku() {
		for (int i = 0; i < Row1; i++) {
			for (int j = 0; j < Col1; j++) {
				sudoku[i][j] = 0;
			}
		}
	}
	public Sudoku(String filename) {
		File file = new File(filename);
		Scanner values = null;
		try {
			values = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File is invalid");
		}

		for (int i = 0; i < Row1; i++) {
			for (int j = 0; j < Col1; j++) {
				sudoku[i][j] = values.nextInt();
			}
		}
	}
	private boolean isValidChoice(int row, int col, int value) {
		if (isValidRow(row, value) && isValidCol(col, value) && isValidBox(row, col, value)){
			return true;
		}
			return false;
	}
		private boolean isValidRow(int row, int value) {
		for (int i = 0; i < Col1; i++) {
			if (sudoku[row][i] == value)
				return false;
		}
			return true;
			}

			
			private boolean isValidCol(int col, int value) {
				for (int j = 0; j < Row1; j++) {
					if (sudoku[j][col] == value)
						return false;
				}
						return true;
			}
			
			
		
		private boolean isValidBox(int row, int col, int value) {
		if (row % 3 == 0) {
			if (col % 3 == 0) {
				if (sudoku[row][col + 1] == value)
					return false;
				else if (sudoku[row][col + 2] == value)
					return false;
				else if (sudoku[row + 1][col] == value)
					return false;
				else if (sudoku[row + 1][col + 1] == value)
					return false;
				else if (sudoku[row + 1][col + 2] == value)
					return false;
				else if (sudoku[row + 2][col] == value)
					return false;
				else if (sudoku[row + 2][col + 1] == value)
					return false;
				else if (sudoku[row + 2][col + 2] == value)
					return false;}
		}

		if (row % 3 == 0) {
			if (col % 3 == 1) {
				if (sudoku[row][col - 1] == value)
					return false;
				else if (sudoku[row][col + 1] == value)
					return false;
				else if (sudoku[row + 1][col - 1] == value)
					return false;
				else if (sudoku[row + 1][col] == value)
					return false;
				else if (sudoku[row + 1][col + 1] == value)
					return false;
				else if (sudoku[row + 2][col - 1] == value)
					return false;
				else if (sudoku[row + 2][col] == value)
					return false;
				else if (sudoku[row + 2][col + 1] == value)
					return false;}
		}
		if (row % 3 == 0) {
			if (col % 3 == 2) {
				if (sudoku[row][col - 2] == value)
					return false;
				else if (sudoku[row][col - 1] == value)
					return false;
				else if (sudoku[row + 1][col - 2] == value)
					return false;
				else if (sudoku[row + 1][col - 1] == value)
					return false;
				else if (sudoku[row + 1][col] == value)
					return false;
				else if (sudoku[row + 2][col - 2] == value)
					return false;
				else if (sudoku[row + 2][col - 1] == value)
					return false;
				else if (sudoku[row + 2][col] == value)
					return false;}
		}
		if (row % 3 == 1) {
			if (col % 3 == 0) {
				if (sudoku[row - 1][col] == value)
					return false;
				else if (sudoku[row - 1][col + 1] == value)
					return false;
				else if (sudoku[row - 1][col + 2] == value)
					return false;
				else if (sudoku[row][col + 1] == value)
					return false;
				else if (sudoku[row][col + 2] == value)
					return false;
				else if (sudoku[row + 1][col] == value)
					return false;
				else if (sudoku[row + 1][col + 1] == value)
					return false;
				else if (sudoku[row + 1][col + 2] == value)
					return false;}
		}
		if (row % 3 == 1) {
			if (col % 3 == 1) {
				if (sudoku[row - 1][col - 1] == value)
					return false;
				else if (sudoku[row - 1][col] == value)
					return false;
				else if (sudoku[row - 1][col + 1] == value)
					return false;
				else if (sudoku[row][col - 1] == value)
					return false;
				else if (sudoku[row][col + 1] == value)
					return false;
				else if (sudoku[row + 1][col - 1] == value)
					return false;
				else if (sudoku[row + 1][col] == value)
					return false;
				else if (sudoku[row + 1][col + 1] == value)
					return false;}
		}
		if (row % 3 == 1) {
			if (col % 3 == 2) {
				if (sudoku[row - 1][col - 2] == value)
					return false;
				else if (sudoku[row - 1][col - 1] == value)
					return false;
				else if (sudoku[row - 1][col] == value)
					return false;
				else if (sudoku[row][col - 2] == value)
					return false;
				else if (sudoku[row][col - 1] == value)
					return false;
				else if (sudoku[row + 1][col - 2] == value)
					return false;
				else if (sudoku[row + 1][col - 1] == value)
					return false;
				else if (sudoku[row + 1][col] == value)
					return false;}
		}

		if (row % 3 == 2) {
			if (col % 3 == 0) {
				if (sudoku[row - 2][col] == value)
					return false;
				else if (sudoku[row - 2][col + 1] == value)
					return false;
				else if (sudoku[row - 2][col + 2] == value)
					return false;
				else if (sudoku[row - 1][col] == value)
					return false;
				else if (sudoku[row - 1][col + 1] == value)
					return false;
				else if (sudoku[row - 1][col + 2] == value)
					return false;
				else if (sudoku[row][col + 1] == value)
					return false;
				else if (sudoku[row][col + 2] == value)
					return false;}
		}

		if (row % 3 == 2) {
			if (col % 3 == 1) {
				if (sudoku[row - 2][col - 1] == value)
					return false;
				else if (sudoku[row - 2][col] == value)
					return false;
				else if (sudoku[row - 2][col + 1] == value)
					return false;
				else if (sudoku[row - 1][col - 1] == value)
					return false;
				else if (sudoku[row - 1][col] == value)
					return false;
				else if (sudoku[row - 1][col + 1] == value)
					return false;
				else if (sudoku[row][col - 1] == value)
					return false;
				else if (sudoku[row][col + 1] == value)
					return false;}
		}

		if (row % 3 == 2) {
			if (col % 3 == 2) {
				if (sudoku[row - 2][col - 2] == value)
					return false;
				else if (sudoku[row - 2][col - 1] == value)
					return false;
				else if (sudoku[row - 2][col] == value)
					return false;
				else if (sudoku[row - 1][col - 2] == value)
					return false;
				else if (sudoku[row - 1][col - 1] == value)
					return false;
				else if (sudoku[row - 1][col] == value)
					return false;
				else if (sudoku[row][col - 2] == value)
					return false;
				else if (sudoku[row][col - 1] == value)
					return false;}
		}
		return true;
	}

	public String toString() {
		String board = "";
		for (int i = 0; i < Row1; i++) {
			for (int j = 0; j < Col1; j++) {
				board += sudoku[i][j] + " ";}
			board += "\n";
		}
		return board;
	}
	public boolean solve() {
		
		boolean filled=true;
		int ro=0;
		int co=0;

		for (int i=0; i<Row1; i++) {
			for (int j=0; j<Col1; j++) {
				if(sudoku[i][j]==0) {
					filled=false;
					ro=i;
					co=j;
					j=Col1;}
			}
		}
		if(filled) return true;
		for(int k=1; k<=9; k++) {
			if(isValidChoice(ro,co,k)) {
				sudoku[ro][co]=k;
				if(solve()) return true;
				else sudoku[ro][co]=0;}
		}
		return false;
	}
}
