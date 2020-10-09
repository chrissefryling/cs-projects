import java.util.*;

public class Maze 
{
	private Cell[][] maze;
	private int nrRows;
	private int nrCols;
	
	private class Cell {
		private boolean north;
		private boolean east;
		private boolean south;
		private boolean west;
		private boolean visited;
		private boolean path;
		private int row;
		private int column;
		public Cell(int r, int c) {
			this.row = r;
			this.column = c;
			this.path = false;
			this.visited = false;
			this.north = true;
			this.south = true;
			this.east = true;
			this.west = true;
		}
	}
		
	public Maze(int nrRows, int nrCols)
	{
		this.nrRows = nrRows;
		this.nrCols = nrCols;
		maze = new Cell[nrRows][nrCols];
		for(int x = 0; x < nrRows; x++){
			for(int y = 0; y < nrCols; y++){
				maze[x][y] = new Cell(x, y);
			}
		}
	}
	
	private static enum Direction{
		NORTH, SOUTH, EAST, WEST;
	}
	
	public void generateMaze(int startRow, int startCol)
	{
		
		Stack<Cell> stack = new Stack<Cell>();
		Cell startCell = maze[startRow][startCol];
		startCell.visited = true;
		stack.push(startCell);
		int end_row = 0;
		int end_col = 0;
		while (!stack.isEmpty()){
			Cell currentCell = stack.pop();
			ArrayList<Direction> neighbors = new ArrayList<Direction>();
			if(currentCell.column + 1 < nrCols && !maze[currentCell.row][currentCell.column+1].visited){
				neighbors.add(Direction.EAST);
			}
			if(currentCell.row + 1 < nrRows && !maze[currentCell.row+1][currentCell.column].visited){
				neighbors.add(Direction.SOUTH);
			}
			if(currentCell.column - 1 >= 0 && !maze[currentCell.row][currentCell.column-1].visited){
				neighbors.add(Direction.WEST);
			}
			if(currentCell.row - 1 >= 0 && !maze[currentCell.row-1][currentCell.column].visited){
				neighbors.add(Direction.NORTH);
			}
			if(neighbors.size() > 0){
				Direction dir = neighbors.get((int)(Math.random() * neighbors.size()));
				Cell neighbor;
				switch(dir){
				case EAST:
					neighbor = maze[currentCell.row][currentCell.column + 1];
					neighbor.west = false;
					currentCell.east = false;
					break;
				case WEST:
					neighbor = maze[currentCell.row][currentCell.column - 1];
					neighbor.east = false;
					currentCell.west = false;
					break;
				case NORTH:
					neighbor = maze[currentCell.row - 1][currentCell.column];
					neighbor.south = false;
					currentCell.north = false;
					break;
				case SOUTH:
					neighbor = maze[currentCell.row + 1][currentCell.column];
					neighbor.north = false;
					neighbor.south = false;
					break;
				default:
					neighbor = null;
					break;
				}
				neighbor.visited = true;
				stack.push(currentCell);
				stack.push(neighbor);
			}
			
			
		}
		
	}
	
	public String toString()
	{
		String out = "";
		for(int i = 0; i < nrCols; i++){
			out += "_ ";
		}
		out += "\n";
		for(int row = 0; row < nrRows; row++){
			//out += "|";
			for(int col = 0; col < nrCols; col++){
				Cell currentCell = maze[row][col];
				if(currentCell.west){
					out += "_";
				}else{
					out += " ";
				}
				if(currentCell.south){
					out += "|";
				}else{
					out += " ";
				}
				
			}
			out += "|";
			out += "\n";
		}
		for(int i = 0; i < nrCols; i++){
			out += "_ ";
		}
		
		return out;
	}
	
	
	//BONUS
	public void findPath(int startRow, int  startCol, int endRow, int endCol){
		
		for(int i = 0; i < nrRows; i++)
		{
			for(int j = 0; j < nrCols; j++)
			{
				maze[i][j].visited = false;
			}
		}
		
		Cell start = maze[startRow][startCol];
		Stack<Cell> stack = new Stack<Cell>();
		
	    Cell currentCell = start;
	    Cell neighbor;
		
		stack.push(currentCell);
		
		while (currentCell.row != endRow && currentCell.column != endCol && !stack.isEmpty()){
			
			currentCell = stack.peek();
			currentCell.visited = true;
			currentCell.path = true;
		
			ArrayList<Direction> neighbors = new ArrayList<Direction>();
			
			if(currentCell.column + 1 < nrCols && !maze[currentCell.row][currentCell.column+1].visited && !maze[currentCell.row][currentCell.column+1].east){
				neighbors.add(Direction.EAST);
			}
			if(currentCell.row + 1 < nrRows && !maze[currentCell.row+1][currentCell.column].visited && !maze[currentCell.row][currentCell.column+1].south){
				neighbors.add(Direction.SOUTH);
			}
			if(currentCell.column - 1 >= 0 && !maze[currentCell.row][currentCell.column-1].visited && !maze[currentCell.row][currentCell.column+1].west){
				neighbors.add(Direction.WEST);
			}
			if(currentCell.row - 1 >= 0 && !maze[currentCell.row-1][currentCell.column].visited && !maze[currentCell.row][currentCell.column+1].north){
				neighbors.add(Direction.NORTH);
			}
			
			if(neighbors.size()>0)
			{
				Direction dir = neighbors.get(0);
				
				switch(dir){
				case EAST:
					neighbor = maze[currentCell.row][currentCell.column + 1];
					break;
				case WEST:
					neighbor = maze[currentCell.row][currentCell.column - 1];
					break;
				case NORTH:
					neighbor = maze[currentCell.row - 1][currentCell.column];
					break;
				case SOUTH:
					neighbor = maze[currentCell.row + 1][currentCell.column];
					break;
				default:
					neighbor = null;
					break;
				}
				
				stack.push(neighbor);
				Cell cell = stack.peek();
				int r = cell.row;
				int c = cell.column;
				
				System.out.println("move: " + "[" + r + "," + c + "]" );
				
			}
			else
			{
				currentCell.path = false;
				stack.pop();
			}	
		}
		
		if(currentCell.path == true){
			
			while(!stack.isEmpty())
			{
				Cell cell = stack.pop();
				int r = cell.row;
				int c = cell.column;
				
				System.out.println("move: " + "[" + r + "," + c + "]" );
				
			}
		}
	}
	public static void main(String[] args){
		Maze maze = new Maze(20, 20);
		maze.generateMaze(0, 0);
		System.out.println(maze);
		int path = 1;
		for(int i = 0; i < 20; i++ )
		{
			System.out.println("Path:" +  path++);
			for(int j = 0; j < 20; j++)
				
			{
				maze.findPath(0, 0, i, j);
			}
		}
		//System.out.println(maze);
	}
	

}
