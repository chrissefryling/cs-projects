
public class QueensProblem 
{
	private int nrRows;
	private int nrCols;
	private int[][] board;
	
	public QueensProblem()
	{
		nrRows = 8;
		nrCols = 8;
		board = new int[nrRows][nrCols];
	}
	
	private boolean isValidChoice(int r, int c)
	{
		for(int col = 0; col <= c; col++)
		{
			if(board[r][col] != 0) return false;
		}
		for(int row = r, col = c; row >= 0 && col >= 0; row--,col--)
		{
			if(board[row][col] != 0) return false;
		}
		for(int row = r, col = c; row >= 0 && col >= 0; row--,col--)
		{
			if(board[row][col] != 0) return false;
		}
		
		return true;
	}
	
	public boolean solve(int col)
	{
		if(col >= nrCols) return true; //stop condition
		
		for(int row = 0; row < nrRows; row++)
		{
			if(isValidChoice(row,col))
			{
				board[row][col] = 1;
				if(solve(col + 1)) return true;
				board[row][col] = 0;
			}
		}
		
		return false;
	}
	
	public String toString()
	{
		String result = "";
		
		for(int row = 0; row < nrRows; row++) //rows
		{
			for(int col = 0; col < nrCols; col++) //cols
			{
				result += board[row][col] + " ";
			} 
			result += "\n";
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		QueensProblem queens = new QueensProblem();
		//System.out.println(queens);
		queens.solve(0);
		System.out.println(queens);
	}

}
