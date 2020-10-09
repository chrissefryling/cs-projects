import java.util.*;
import java.io.*;

public class WordReader 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the location of the file.");
		String filename = userInput.nextLine();
		File file = new File(filename);
		Scanner fileInput = new Scanner(file);
	
		while(fileInput.hasNextLine())
		{
			  String first = fileInput.next();//just the first word
			  String line = fileInput.nextLine();//take in entire line
			  String last = line.substring(line.lastIndexOf(' '));
			  System.out.println("First: " + first + " Last: " + last);	
		}		
	}
}
