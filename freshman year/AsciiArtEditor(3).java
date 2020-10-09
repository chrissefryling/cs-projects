import java.io.*;
import java.util.*;
///Users/Yasi/Downloads/Askira-2.txt
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
		int choice;
		
		AsciiArt painting = new AsciiArt(fileName, rows,cols);
		
		
		System.out.println("MENU:");
		System.out.println("1. Apply Flood Fill.");
		System.out.println("2. Replace Color.");
		System.out.println("3. Replace Area of Image.");
		System.out.println("4. Display Information");
		System.out.println("5. Save.");
		System.out.println("6. Exit.");
		 choice = input.nextInt();
		
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
			System.out.println(painting.toString());
		}
		else if(choice == 2)
		{
			System.out.println("Target:");
			char target = input.next().charAt(0);
			System.out.println("Replacement:");
			char replace = input.next().charAt(0);
			painting.replaceColor(target, replace);
			System.out.println(painting.toString());
		}
		else if(choice == 3)
		{
			System.out.println("Row1: ");
			int R1 = input.nextInt();
			System.out.println("Column1: ");
			int C1 = input.nextInt();
			System.out.println("Row2: ");
			int R2 = input.nextInt();
			System.out.println("Column2: ");
			int C2 = input.nextInt();
			System.out.println("Replacement: ");
			char repla = input.next().charAt(0);
			//System.out.println(sym);
			painting.replaceArea(C1, R1, C2, R2, repla);
			System.out.println(painting.toString());
		}
		else if(choice == 4)
		{
			System.out.println(painting.toString());
		}
		else if(choice == 5)
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
		

	}

}
