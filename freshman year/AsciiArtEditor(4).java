import java.util.*;

import java.io.*;

public class AsciiArtEditor 
{
	///Users/Chrisse/Downloads/Scream.txt
	public static void main(String[] args) throws IOException
	{
		Scanner user = new Scanner(System.in);
		System.out.println("What is the filename?");
		String filename = user.nextLine();
		System.out.println("What is the number of rows?");
		int rows = user.nextInt();
		System.out.println("What is the number of columns?");
		int cols = user.nextInt();
		AsciiArt art = new AsciiArt(filename,rows,cols);
		//System.out.println(art.toString());
		int choice = 0;
		do
		{
			//MENU
			System.out.println("Menu:");
			System.out.println("1. Apply Flood Fill.");
			System.out.println("2. Crop The Image.");
			System.out.println("3. Display Information.");
			System.out.println("4. Save.");
			System.out.println("5. Exit.");
			choice = user.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Row: ");
				int row1 = user.nextInt();
				System.out.println("Col: ");
				int col1 = user.nextInt();
				System.out.println("Target Character: ");
				char target = user.next().charAt(0);
				System.out.println("Replacement character: ");
				char symbol = user.next().charAt(0);
				art.floodFill(row1,col1,target,symbol);
				System.out.println(art.toString());
			}
			else if(choice == 2)
			{
				System.out.println("New # of rows: ");
				int newRow = user.nextInt();
				System.out.println("New # of columns: ");
				int newCol = user.nextInt();
				art.crop(newCol, newRow, cols, rows);
			}
			else if(choice == 3)
			{
				System.out.println("Dimensions: ");
				System.out.println(rows + "x" + cols);
			}
			else if(choice == 4)
			{
				System.out.println("What is the name of the file you'd like to save the image to?");
				String saveFile = user.nextLine();
				art.save(saveFile);
				System.out.println("Saved.");
			}
		}while(choice != 5);
		
		user.close();
	}

}
