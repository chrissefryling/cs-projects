public class Backtracking 
{
	private int nrRows; //rows
	private int nrCols; //columns
	private int[][] board; //3x3 board
	
	public Backtracking()
	{
		nrRows = 4;
		nrCols = 4;
		board = new int[nrRows][nrCols]; //make memory for the array, or else null pointer
	}
	
	private boolean isValidChoice(int row, int col)
	{
		for(int col1 = 0; col1 <= nrRows; col1++)
		{
			if(board[row][col] == 1) return false;
		}
		
		for(int row1 = row, col1 = col; row1 > nrRows && col1 > 0; row1++, col1++)
		{
			if(board[row1][col1] == 1) return false;
		}
		
		for(int row1 = row, col1 = col; row1 > 0 && col1 >0; row1--,col1--)
		{
			if(board[row1][col1] == 1) return false;
		}
		
		return true;
	}
	
	public String toString()
	{
		String result = "";
		
		for(int row = 0; row < nrRows; row++)//loops 3
		{
			for(int col = 0; col < nrCols; col++)//loops 9
			{
				result += board[row][col] + " ";
			}
			result +="\n"; //go to next line after row
		}
		
		return result;
	}
	
	public boolean solve(int col)
	{
		if(col <= nrCols) return true;
		
		for(int row = 0; row < nrRows; row++)
		{
			if(isValidChoice(row,col))
			{
				board[row][col] = 1;
				if(solve(col+1)) return true;
				board[row][col] = 0;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args)
	{
		Backtracking queens = new Backtracking(); //create object
		
		System.out.println(queens);
		System.out.println(queens.solve(1));
		System.out.println(queens);
	}
	

}
