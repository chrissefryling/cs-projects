/**Yasmine Pourarian
 * CS 111-002
 * Assignment 3
 **/
import java.util.*;
import java.io.*;
public class WordReader 
//Sample file: /Users/Yasi/Downloads/sample_input-2.txt//
{
	public static void main(String[] args) 
	//Problem 5
	{
		Scanner scanner = new Scanner(System.in);
		File text = null;
		Scanner reader = null;
		String name = null;
		//File location
		System.out.println("Problem Five, Enter the file location: ");
		name = scanner.nextLine();
		text = new File(name);
		
		//When file is not found
		try {
		  reader = new Scanner(text);} 
		catch (FileNotFoundException e) {
			System.out.println("The file does not exist.");
		}
		while(reader.hasNextLine()){
			  String numline = reader.nextLine();
			  String firstword = numline.substring(0,numline.indexOf(" "));
			  String lastword = numline.substring(numline.lastIndexOf(" "));
			  System.out.println("First word in text: " + firstword + " Last word in text: " + lastword);	
		}
		
		
	}

}
