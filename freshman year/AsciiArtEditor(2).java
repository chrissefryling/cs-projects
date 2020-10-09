import java.util.*;
import java.io.*;

public class AsciiArtEditor 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		//create the scanners
		Scanner user = new Scanner(System.in);
		Scanner menu = new Scanner(System.in);
		//ask the user questions 
		System.out.println("What is the filename?");
		String fileName = user.nextLine();
		System.out.println("Number of rows?");
		int rows = user.nextInt();
		System.out.println("Number of cols?");
		int cols = user.nextInt();
		user.close();
		//create instance
		AsciiArt art = new AsciiArt(fileName,rows,cols);
		//MENU
		System.out.println("Welcome! MENU:");
		System.out.println("1. Apply Flood Fill.");
		System.out.println("2. Replace Color.");
		System.out.println("3. Replace Area of Image.");
		System.out.println("4. Display Info on Image.");
		System.out.println("5. Save to File.");
		System.out.println("6. Exit Program.");
		int choice = menu.nextInt();
		//CHOICES
		if(choice == 1)
		{
			System.out.println("Row: ");
			int row = menu.nextInt();
			System.out.println("Col: ");
			int col = menu.nextInt();
			System.out.println("Target Character: ");
			char target = menu.nextLine().charAt(0);
			System.out.println("Replacement character: ");
			char symbol = menu.nextLine().charAt(0);
			art.floodFill(row,col,target,symbol);
			art.print();
		}
		else if(choice == 2)
		{
			System.out.println("Target character:");
			char targ = menu.nextLine().charAt(0);
			System.out.println("Replacement character:");
			char replace = menu.nextLine().charAt(0);
			art.replaceColor(targ,replace);
			art.print();
		}
		else if(choice == 3)
		{
			System.out.println("Row 1:");
			int row1 = menu.nextInt();
			System.out.println("Row 2:");
			int row2 = menu.nextInt();
			System.out.println("Col 1:");
			int col1 = menu.nextInt();
			System.out.println("Col 2:");
			int col2 = menu.nextInt();
			System.out.println("Replacement:");
			char temp = menu.nextLine().charAt(0);
			art.replaceArea(row1,col1,row2,col2,temp);
			art.print();	
		}
		else if(choice == 4)
		{
			System.out.println(art.toString());
		}
		else if(choice == 5)
		{
			System.out.println("What is the name of the file you wish to save the image to?");
			String save = menu.nextLine();
			art.save(save);
			System.out.println("Successfully saved!");
		}
		else
		{
			System.out.println("Goodbye!");
			menu.close();
		}	
	}
}
