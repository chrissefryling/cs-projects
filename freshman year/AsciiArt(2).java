import java.io.*;
import java.util.*;

public class AsciiArt 
{
	private char [][] image;
	private int nrRow;
	private int nrCol;
	
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
	
	public char getChar(int row, int col)
	{
		return image[row][col];
	}
	
	public void floodFill(int row, int col, char target, char replacement)
	{
		if(row < 0) return;
		if(col < 0) return;
		if(row > image.length) return;
		if(col > image.length) return;
		
		target = image[row][col];
		
		if(replacement < image[row][col]) return;
		if(target != (image[row][col])) return;
		
		image[row][col] = replacement;
		
		floodFill(row - 1, col, target, replacement);
        floodFill(row + 1, col, target, replacement);
        floodFill(row, col - 1, target, replacement);
        floodFill(row, col + 1, target, replacement);
	}
	
	public String toString()
	{
		String pic = "";
		
		for(int i = 0; i < nrRow; i++)
		{
			for(int j = 0; j < nrCol; j++)
			{
				pic += image[i][j];
			}
			pic += "\n";
		}
		return pic;
	}
	
	public void crop(int col1, int row1, int col2, int row2)
	{
		char [][] crop = new char[row1][col1];
		for(int i = 0; i < row1; i++)
		{
			for(int j = 0; j < col1; j++)
			{
				crop[i][j] = image[i][j];
			}
		}
		System.out.println(crop);
	}
	
	public void save(String fileName)throws IOException 
	{
		
		File file = new File(fileName);
		
		String saved = "";
		
		for(int i = 0; i < nrRow; i++)
		{
			for(int j = 0; j < nrCol; j++)
			{
				saved += image[i][j];
			}
			saved += "\n";
		}
		
		FileWriter write = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(write);
		bw.write(saved);
		bw.close();
	}
}
