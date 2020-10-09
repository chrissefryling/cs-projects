import java.io.*;
import java.util.*;

public class AsciiArtEditor 
{
	static String[][] image;
    ///Users/Yasi/Downloads/Askira.txt
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Scanner user = new Scanner(System.in);
		System.out.println("What is the filename?");
		String fileName = user.nextLine();
		File file = new File(fileName);
		System.out.println("How many rows?");
		int rows = user.nextInt();
		System.out.println("How many columns?");
		int cols = user.nextInt();
		AsciiArt art = new AsciiArt(fileName,rows,cols);
		
		
		//MENU
		System.out.println("User Menu:");
		System.out.println("1. Apply Flood Fill.");
		System.out.println("2. Crop The Image.");
		System.out.println("3. Display Information");
		System.out.println("4. Save.");
		System.out.println("5. Exit.");
		
		int userChoice = user.nextInt();
		
		if(userChoice == 1) 
		{
			System.out.println("Row you want to change:");
			int row1 = user.nextInt();
			System.out.println("Col you want to change:");
			int col1 = user.nextInt();
			System.out.println("Symbol you want to change:");
			char symbol = user.next().charAt(0);
			System.out.println("What do you want to change it to?");
			char replacement = user.next().charAt(0);
			art.floodFill(row1, col1, symbol, replacement);
		}
		if(userChoice == 2) //if the user wants to crop the image
		{
			System.out.println("New rows:");
			int newRows = user.nextInt();
			System.out.println("New columns:");
			int newCols = user.nextInt();
			art.crop(newCols, newRows, newCols, newRows);
		}
		if(userChoice == 3) //display information
		{
			System.out.println("Row: ");
			int rows1 = user.nextInt();
			System.out.println("Column: ");
			int cols1 = user.nextInt();
			System.out.println(art.getChar(rows1, cols1));
		}
		if(userChoice == 4) //save the image to a file
		{
			System.out.println("What is the filename?");
			Scanner files = new Scanner(System.in);
			String newName = files.nextLine();
			art.save(newName);
			System.out.println("Done!");
		}
		if(userChoice == 5) //quit the program
		{
			System.out.println("Goodbye!");
		}
		
	}

}
