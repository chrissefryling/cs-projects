import java.io.*;
import java.util.*;

public class AsciiArtEditor 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Please input the filename:");
		Scanner input = new Scanner(System.in);
		String fileName = input.nextLine();
		File file = new File(fileName);
		System.out.println("Number of rows:");
		int rows = input.nextInt();
		System.out.println("Number of columns:");
		int cols = input.nextInt();
		AsciiArt painting = new AsciiArt(fileName,rows,cols);
		System.out.println("MENU:");
		System.out.println("1. Apply Flood Fill.");
		System.out.println("2. Crop The Image.");
		System.out.println("3. Display Information.");
		System.out.println("4. Save.");
		System.out.println("5. Exit.");
		int choice = input.nextInt();
		
		if(choice == 1)
		{
			System.out.println("Symbol:");
			char symbols = input.next().charAt(0);
			System.out.println("New symbol:");
			char replacement = input.next().charAt(0);
			System.out.println("Row:");
			int row1 = input.nextInt();
			System.out.println("Col:");
			int col1 = input.nextInt();
			painting.floodFill(row1, col1, symbols, replacement);
		}
		else if(choice == 2)
		{
			System.out.println("New rows:");
			int rowss = input.nextInt();
			System.out.println("New columns:");
			int colss = input.nextInt();
			painting.crop(colss, rowss);
		}
		else if(choice == 3)
		{
			System.out.println("Row: ");
			int R = input.nextInt();
			System.out.println("Column: ");
			int C = input.nextInt();
			char sym = painting.getChar(R, C);
			System.out.println(sym);
		}
		else if(choice == 4)
		{
			String saveFile = "";
			Scanner read = new Scanner(System.in);
			System.out.println("Enter new file:");
			saveFile = read.nextLine();
			painting.save(saveFile);
			System.out.println("The file has been saved.");
			read.close();
		}
		else
		{
			System.out.println("Done.");
		}
		
		input.close();
	}

}
