import java.util.*;
import java.io.*;

public class AsciiArt 
{
	private char [][] image;
	private int nrRow;
	private int nrCol;
	
	
	private class Node
	{
		private int row;
		private int col;
		
		public Node(int row, int col)
		{
			this.row = row;
			this.col = col;
		}
	}
	
	public AsciiArt()
	{
		nrRow = 0;
		nrCol = 0;
		image = new char[nrRow][nrCol];
	}
	
	public AsciiArt(String fileName, int nrRow, int nrCol) throws FileNotFoundException
	{
		this.nrRow = nrRow;
		this.nrCol = nrCol;
		image = new char[nrRow][nrCol];
		File file = new File(fileName);
		Scanner read = new Scanner(file);
		String line = "";
		for (int i = 0; i < nrRow; i++) 
		{
			line = read.nextLine();
			for (int j = 0; j < nrCol; j++) 
			{
				image[i][j] = line.charAt(j);
			}
		}
		read.close();
	}
	
	public void floodFill(int row, int col, char target, char replacement)
	{
		Queue<Node> art = new LinkedList<Node>();
		if (target == replacement) return;
		art.add(new Node(row,col));
		while(!art.isEmpty())
		{
			Node n = art.remove();
			row = n.row;
			col = n.col;
			if(image[row][col] == target)
			{
				image[row][col] = replacement;
				if((row-1) > 0 && image[row-1][col] == target) art.add(new Node(row-1,col));
				if((row+1) < image.length && image[row+1][col] == target) art.add(new Node(row+1,col));
				if((col-1) > 0 && image[row][col-1] == target) art.add(new Node(row,col-1));
				if((col+1) < image.length && image[row][col+1] == target) art.add(new Node(row,col+1));
			}
		}
		return;
	}
	
	public void replaceColor(char target, char replacement)
	{
		for(int i = 0; i < nrRow; i++)
		{
			for(int z = 0; z < nrCol; z++)
			{
				if(image[i][z] == target)
				{
					image[i][z] = replacement;
				}
			}
		}
	}
	
	public String toString()
	{
		String image1 = "";
		
		for(int i = 0; i < nrRow; i++)
		{
			for(int j = 0; j < nrCol; j++)
			{
				image1 += image[i][j];
			}
			image1 += "\n";
		}
		return image1;
	}
	
	public void replaceArea(int row1, int col1, int row2, int col2, char replacement)
	{
		for(int i = row1; i <= row2; i++)
		{
			for(int j = col1; j <= col2; j++)
			{
				image[i][j] = replacement;
			}
		}
	}
	
	public void save(String fileName)throws IOException 
	{
		
		File file = new File(fileName);
		String newImage = "";
		
		for(int i = 0; i < nrRow; i++)
		{
			for(int z = 0; z < nrCol; z++)
			{
				newImage += image[i][z];
			}
			newImage += "\n";
		}
		
		FileWriter writer = new FileWriter(file.getAbsoluteFile());
		BufferedWriter buffered = new BufferedWriter(writer);
		buffered.write(newImage);
		buffered.close();
	}
	

}
