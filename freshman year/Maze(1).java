import java.util.*;
public class Maze 
{
	private class Cell
	{
		public boolean north;
		public boolean south;
		public boolean east;
		public boolean west;
		public boolean visited;
		public int row;
		public int col;
		
		public Cell(int row, int col)
		{
			north = true;
			south = true;
			east = true;
			west = true;
			visited = false;
			this.row = row;
			this.col = col;
		}
	}

	private Cell[][] maze;
	private int nrRows;
	private int nrCols;
	Cell cell = new Cell(nrRows,nrCols);
	
	public Maze(int nrRows, int nrCols)
	{
		this.nrRows = nrRows;
		this.nrCols = nrCols;
		maze = new Cell[nrRows][nrCols];
	}
	
	public void generateMaze(int startRow, int startCol)
	{
		Stack<Cell> stack = new Stack<Cell>();
		maze[startRow][startCol] = new Cell(startRow,startCol);
		stack.push(maze[startRow][startCol]);
		while(!(stack.isEmpty()))
		{
			stack.pop();
			Cell nb = maze[startRow + 1][startCol];
			if(nb.visited = false)
			{
				cell.north = false;
				nb.visited = true;
			}
			stack.push(maze[startRow][startCol]);
			stack.push(nb);
			break;
		}
	}
	
	public String toString()
	{
		String result = "";
		for(int i = 0; i <= nrCols; i++)
		{
			result += "-";
		}
		result += "\n";
		for(int z = 0; z <= nrCols; z++)
		{
			for(int j = 0; j <= nrRows; j++)
			{
				if(cell.north)
				{
					result += "|";
				}
				else if(cell.south)
				{
					result += "|";
				}
				else if(cell.west)
				{
					result += "|";
				}
				else if(cell.east)
				{
					result += "|";
				}
				else if(!(cell.east))
				{
					result += " ";
				}
				else if(!(cell.west))
				{
					result += " ";
				}
				else if(!(cell.north))
				{
					result += " ";
				}
				else if(!(cell.south))
				{
					result += " ";
				}
			}
			result += "\n";
		}
		return result;
	}
}
