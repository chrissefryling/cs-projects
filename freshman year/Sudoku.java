import java.io.*;
import java.util.*;

public class Sudoku 
{
	//fields
	private int rows;
	private int cols;
	private int[][] board;

	public static void main(String[] args) throws FileNotFoundException //main
	{
		Scanner input = new Scanner(System.in);
		System.out.println("File: ");
		String fileName = input.nextLine();
		Sudoku game = new Sudoku(fileName);
		game.solve();
		System.out.println(game);
	}

	public Sudoku(String fileName) throws FileNotFoundException//constructor
	{
		rows = 9;
		cols = 9;
		board = new int[rows][cols];
		File file = new File(fileName);
		Scanner read = new Scanner(file);
		while(read.hasNext())
		{
			for (int i = 0; i < rows; i++) 
			{
				for (int z = 0; z < cols; z++) 
				{
					board[i][z] = read.nextInt();
				}
			}
		}
	}
	
	public boolean solve() //method that does the solving 
	{	
		boolean fill;
		int col;
		int row;

		for (int i = 0; i < rows; i++) 
		{
			for (int z = 0; z < cols; z++) 
			{
				if(board[i][z]==0) 
				{
					fill = false;
				}
				else
				{
					fill = true;
				}
			}
		}
		if(fill == true)
			{
				return true;
			}
		for(int n = 0; n < 9; n++) 
		{
			if(isValidChoice(row,col,n)) 
			{
				board[row][col] = n;
				if(solve()) 
					{
						return true;
					}
				else
					{
						board[row][col] = 0;
					}
			}
		}
		return false;
	}
	
	private boolean isValidChoice(int row, int col, int value) //is the row & col valid
	{
		if (isValidRow(row, value) && isValidCol(col, value) && isValidBox(row, col, value))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private boolean isValidRow(int row, int value) //row
	{
		for (int i = 0; i < cols; i++) 
		{
			if (board[row][i] == value)
			{
				return false;
			}
		}
			return true;
	}

			
	private boolean isValidCol(int col, int value) //col
	{
		for (int i = 0; i < rows; i++) 
		{
			if (board[i][col] == value)
			{
				return false;
			}
		}
		return true;
	}
			
	private boolean isValidBox(int row, int col, int value) //box itself
	{
		for (int i=0; i < rows; i++) 
		{
			for (int z = 0; z < cols; z++) 
			{
				if(board[i][z]==0) 
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
}
