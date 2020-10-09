import java.util.*;

import javax.xml.soap.Node;

import java.io.*;

public class AsciiArt 
{
	//fields
	private char [][] image;
	private int nrRow;
	private int nrCol;
	public AsciiArt(String fileName, int nrRow, int nrCol) throws FileNotFoundException
	{
		this.nrRow = nrRow;
		this.nrCol = nrCol;
		File file = new File(fileName);
		Scanner read  = new Scanner(file);
		image = new char[nrRow][nrCol];
		String str = "";
		for(int i = 0; i < nrRow; i++)
		{
			str = read.nextLine();
			for(int z = 0; z < nrCol; z++)
			{
				image[i][z] = (str.charAt(z));
			}
		}
		read.close();
	}
	public void floodFill(int row, int col, char target, char replacement)
	{
		if(target == replacement) return;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(row,col));
		
		while(!queue.isEmpty())
		{
			Node n = queue.remove();
		      if (image[n.row][n.col] == target)
		      {
		         image[n.row][n.col] = replacement;
		         queue.add(new Node(n.row-1, n.col));
		         queue.add(new Node(n.row+1, n.col));
		         queue.add(new Node(n.row, n.col-1));
		         queue.add(new Node(n.row, n.col+1));
		      }
		}
		return;


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
		String result = "";
		result ="Rows: " + nrRow + "\nCols: " + nrCol;
		return result;
	}
	public void replaceArea(int row1, int col1, int row2, int col2, char replacement)
	{
		for(int i = row1; i <= row2; i++)
		{
			for(int z = col1; z <= col2; z++)
			{
				image[i][z] = replacement;
			}
		}
	}
	public void save(String fileName)throws IOException
	{
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		String savedImage = "";
		for(int i = 0; i < nrRow; i++)
		{
			for(int z = 0; z < nrCol; z++)
			{
				savedImage += image[i][z];
			}
			savedImage += "\n";
		}
		bw.write(savedImage);
		bw.close();
	}
	public void print()
	{
		for(int i = 0; i < nrRow; i++)
		{
			for(int z = 0; z < nrCol; z++)
			{
				System.out.println(image[i][z]);
			}
		}	
	}
}
