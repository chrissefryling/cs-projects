import java.io.*;
import java.util.*;

public class AsciiArtEditor 
{
	public static void main(String[] args) throws IOException
	{
		int choice = 0;
		int rows = 0; 
		int cols = 0;
		String filename = "";
		Scanner user = new Scanner(System.in); //reading picture
		Scanner input = new Scanner(System.in); //reading user choices
		
		//the picture 
		System.out.println("Please type in the filename: ");
		filename = user.nextLine();
		System.out.println("Number of rows: ");
		rows = user.nextInt();
		System.out.println("Number of columns: ");
		cols = user.nextInt();
		
		AsciiArt art = new AsciiArt(filename,rows,cols);
		
		//menu
		do{
			System.out.println("User Menu: ");
			System.out.println("1. Apply Flood Fill.");
			System.out.println("2. Replace Color.");
			System.out.println("3. Replace Area of Image.");
			System.out.println("4. Display Information.");
			System.out.println("5. Save.");
			System.out.println("6. Exit.");
			choice = input.nextInt();
			
			//if else
			
			if(choice == 1)
			{
				System.out.println("Row: ");
				int r = input.nextInt();
				System.out.println("Col: ");
				int c = input.nextInt();
				System.out.println("Desired Replacement Char: ");
				char re = input.next().charAt(0);
				System.out.println("Target Char: ");
				char t = input.next().charAt(0);
				art.floodFill(r, c, t, re);
				System.out.println(art);
			}
			else if(choice == 2)
			{
				System.out.println("Target Char: ");
				char tar = input.next().charAt(0);
				System.out.println("Replacement Char: ");
				char rep = input.next().charAt(0);
				art.replaceColor(tar, rep);
				System.out.println(art);
			}
			else if(choice == 3)
			{
				System.out.println("Row 1: ");
				int row1 = input.nextInt();
				System.out.println("Row 2: ");
				int row2 = input.nextInt();
				System.out.println("Column 1: ");
				int col1 = input.nextInt();
				System.out.println("Column 2: ");
				int col2 = input.nextInt();
				System.out.println("Replacement Char: ");
				char replacement = input.next().charAt(0);
				art.replaceArea(row1, col1, row2, col2, replacement);
				System.out.println(art);
			}
			else if(choice == 4)
			{
				System.out.println("Dimensions: ");
				System.out.println(rows + " by " + cols);
			}
			else if(choice == 5)
			{
				System.out.println("Filename: ");
				String f = input.nextLine();
				art.save(f);
				System.out.println("Saved.");
				
			}
			else if(choice > 6 || choice < 1)
			{
				System.out.println("Invalid. Please type 1-6.");
			}
			
		}while(choice != 6);
		
		System.out.println("Goodbye.");
		user.close();
		input.close();
	}

}
