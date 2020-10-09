
public class Cell extends Maze
{
	public boolean north;
	public boolean south;
	public boolean east;
	public boolean west;
	public int visited;
	public int row;
	public int col;
	
	public Cell(int nrRow, int nrCol)
	{
		super(nrRow,nrCol);
		north = true;
		south = true;
		east = true;
		west = true;
		visited = 1;
		row = nrRow;
		col = nrCol;
	}
}
