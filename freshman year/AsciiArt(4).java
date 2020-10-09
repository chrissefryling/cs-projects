import java.util.*;
import java.io.*;

public class AsciiArt 
{
	private char [][] image;
	private int nrRow;
	private int nrCol;
	
	public AsciiArt(String fileName, int nrRow, int nrCol) throws FileNotFoundException
	{
		this.nrRow = nrRow;
		this.nrCol = nrCol;
		File file = new File(fileName);
		Scanner in  = new Scanner(file);
		image = new char[nrRow][nrCol];
		String line = "";
		
		for(int i = 0; i < nrRow; i++)
		{
			line = in.nextLine();
			for(int j = 0; j < nrCol; j++)
			{
				image[i][j] = line.charAt(j);
			}
		}
	}
	
	
	public char getChar(int row, int col)
	{
		char sym = image[row][col];
		return sym;
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
		String array = "";
		
		for(int i = 0; i < nrRow; i++)
		{
			for(int z = 0; z < nrCol; z++)
			{
				array += image[i][z];
			}
			array+= "\n";
		}
		
		return array;
	}
	
	public void crop(int col1, int row1, int col2, int row2)
	{
		char [][] cropped = new char[row1][col1];
		for(int i = 0; i < row1; i++)
		{
			for(int z = 0; z < col1; z++)
			{
				cropped[i][z] = image[i][z];
				System.out.println(cropped[i][z]);
			}
		}
	}
	
	public void save(String fileName)throws IOException 
	{
		
		File file = new File(fileName);
		
		String images = "";
		for(int i = 0; i < nrRow; i++)
		{
			for(int z = 0; z < nrCol; z++)
			{
				images += image[i][z];
			}
			images += "\n";
		}
		
		FileWriter write = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(write);
		bw.write(images);
		bw.close();
	}
}
