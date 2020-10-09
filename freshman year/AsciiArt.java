import java.util.*;
import java.io.*;

public class AsciiArt 
{
	private char [][] image;
	private int nrRow;
	private int nrCol;
	

	public AsciiArt (String fileName, int rows, int cols) throws FileNotFoundException
	{
		nrRow = rows;
		nrCol = cols;
		
		File file = new File(fileName);
		Scanner read  = new Scanner(file);
		image = new char[nrRow][nrCol];
		String str = "";
		for(int a = 0; a < nrRow; a++)
		{
			str = read.nextLine();
			for(int b = 0; b < nrCol; b++)
			{
				image[a][b] = str.charAt(b);
			}
		}
		read.close();
		
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
	
	
	public char getChar(int row, int col)
	{
		return image[row][col];
	}
	
	public void floodFill(int row, int col, char target, char replacement)
	{
		System.out.println("enter");
		if (target == replacement){
			System.out.println("enter");
			 return;
		}
		
		Queue<Node> a = new LinkedList<Node>();
		a.add(new Node(row,col));
		
		while(!a.isEmpty())
		{
			Node n = a.remove();
			row = n.row;
			col = n.col;
			if(image[row][col] == target)
			{
				image[row][col] = replacement;
				
				if((col-1) > 0 && image[row][col-1] == target) a.add(new Node(row,col-1));
				if((col+1) < image.length && image[row][col+1] == target) a.add(new Node(row,col+1));
				if((row-1) > 0 && image[row-1][col] == target) a.add(new Node(row-1,col));
				if((row+1) < image.length && image[row+1][col] == target) a.add(new Node(row+1,col));
			}
		}
		return;
	}
	public void printMap()
	{
		for(int i = 0; i < nrRow; i++)
		{
			for(int z = 0; z < nrCol; z++)
			{
				System.out.println(image[i][z]);
			}
			System.out.println();
		}	
	}
	
	public void replaceColor(char target, char replacement){
		
		for(int i = 0; i < image.length; i++)
		{
			for(int z = 0; z < image[0].length; z++)
			{
				if(image[i][z] == target)
				image[i][z] = replacement;
			}
		}
	}
	
	public void replaceArea(int col1, int row1,int col2, int row2, char replacement)
	{
		
		for(int i = row1; i < row2; i++)
		{
			for(int z = col1; z < col2; z++)
			{
				image[i][z] = replacement;
			}
		}
	}
	public String toString() {
		String string = "";
		for(int i = 0; i < nrRow; i++)
		{
			for(int z = 0; z < nrCol; z++)
			{
				string += image[i][z];
			}
			string += '\n';
		}
		return string;
	}
	private class Node 
	{
		private int row;
		private int col;
		
		public Node(int row, int col) {
			this.row = row;
			this.col = col;
	}
	}
	

}
