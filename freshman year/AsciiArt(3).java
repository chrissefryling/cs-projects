import java.util.*;
import java.io.*;

public class AsciiArt 
{
	Queue image = new LinkedList();
	private int nrRow;
	private int nrCol;
	
	public AsciiArt(String fileName, int rows, int cols) throws FileNotFoundException
	{
		nrRow = rows;
		nrCol = cols;
		File file = new File(fileName);
		Scanner read  = new Scanner(file);
		image = null;
		String str = "";
		for(int a = 0; a < nrRow; a++)
		{
			str = read.nextLine();
			for(int b = 0; b < nrCol; b++)
			{
				image.add(str.charAt(b));
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
				savedImage += image.remove();
			}
			savedImage += "\n";
		}
		bw.write(savedImage);
		bw.close();
	}
	
	
	public Queue getChar(int row, int col)
	{
		return image.remove();
	}
	
	public void floodFill(int row, int col, char target, char replacement)
	{
		target = image.remove();
		if(target == replacement) return;
		if(target != replacement) return;
		replacement = image.remove();
		
		floodFill(col - 1, row, target, replacement);
        floodFill(col + 1, row, target, replacement);
        floodFill(col, row - 1, target, replacement);
        floodFill(col, row + 1, target, replacement);	
	}
	
	public void printMap()
	{
		for(int i = 0; i < nrRow; i++)
		{
			for(int z = 0; z < nrCol; z++)
			{
				System.out.println(image.remove(z));
			}
		}	
	}
	
	public void crop(int col1, int row1)
	{
		Queue newImage = new LinkedList();
		for(int i = 0; i < row1; i++)
		{
			for(int z = 0; z < col1; z++)
			{
				newImage = image.remove(z);
				System.out.println(newImage.remove(z));
			}
		}
	}
	
}
