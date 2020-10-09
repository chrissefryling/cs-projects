import java.util.*;
import java.io.*;

public class Sudoku 
{
	///Users/Chrisse/Downloads/sudoku_1.txt
	//fields
	private int nrRows;
	private int nrCols;
	private int[][] board;
	
	public Sudoku(String fileName) throws FileNotFoundException
	{
		nrRows = 9;
		nrCols = 9;
		board = new int[nrRows][nrCols];
		File file = new File(fileName);
		Scanner read = new Scanner(file);
		for (int i = 0; i < nrRows; i++) 
		{
			for (int j = 0; j < nrCols; j++) 
			{
				board[i][j] = read.nextInt();
			}
		}
		
		read.close();
	}
	
	public boolean isValidChoice(int r, int c, int val)
	{
		if(isValidRow(r,val) && isValidCol(c,val) && isValidBox(r,c,val))
		{
			return true;
		}
		
		else return false;
	}
	
	public boolean isValidRow(int r, int val)
	{
		for(int i = 0; i < nrCols; i++)
		{
			if(board[r][i] == val)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean isValidCol(int c, int val)
	{
		for(int i = 0; i < nrRows; i++)
		{
			if(board[i][c] == val)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean isValidBox(int r, int c, int v)
	{
		
		int row = (r / 3)*3;
		int col = (c / 3)*3;
		for (int i = 0; i < 3; ++i)
		{
		    for (int j = 0; j < 3; ++j)
		    {
			if (v == board[row+i][col+j])
				{
			    return false;
				}
		    }
		}

		return true; 
	}
	
	public boolean solve()
	{
		boolean taken  = true;
		int r = 0;
		int c = 0;

		for (int i = 0; i < nrRows; i++) 
		{
			for (int j = 0; j < nrCols; j++) 
			{
				if(board[i][j] == 0) 
				{
					taken = false;
					r = i;
					c = j;
					j = nrCols;
				}
			}
		}
		
		if(taken) return true;
		
		for(int z = 1; z <= 9; z++) 
		{
			if(isValidChoice(r, c, z)) 
			{
				board[r][c] = z;
				if(solve()) return true;
				else board[r][c] = 0;
			}
		}
		return false;
	}
	
	public String toString()
	{
		String result = "";
		
		for(int i = 0; i < nrRows; i++)
		{
			for(int j = 0; j < nrCols; j++)
			{
				result += board[i][j] + " ";
			}
			result += "\n";
		}
		
		return result;
	}
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the filename?");
		String fileName = input.nextLine();
		Sudoku game = new Sudoku(fileName);
		System.out.println(game);
		game.solve();
		System.out.println(game);
		input.close();
	}

}
