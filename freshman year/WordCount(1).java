/**Yasmine Pourarian
 * CS 111-002
 * Assignment 3
 **/
import java.util.*;
import java.io.*;
public class WordCount 
//Sample file: /Users/Yasi/Downloads/sample_input-2.txt//
{
	public static void main(String[] args) {
		//Problem 6
		Scanner scanner = new Scanner(System.in);
		String name = null;
		Scanner reader = null;
		File text = null;
		int numlines = 0;
		int numletters = 0;
		int numwords = 0;
		//file location
		System.out.println("Problem Six, Enter the file location: ");
		name = scanner.nextLine();
		text = new File(name);
		
		//When file is not found
		try {
		  reader = new Scanner(text);} 
		catch (FileNotFoundException e) {
			System.out.println("The file does not exist.");
		}
		while(reader.hasNextLine()){
			  String passage = reader.nextLine();
			 numlines++;numletters += passage.length();
			  numwords += new StringTokenizer(passage, " ").countTokens();
			
		}
		System.out.println("Line count in passage: " + numlines);
		System.out.println("Character count in passage: " + numletters);
		System.out.println("Word count in passage: " + numwords);
	}
}
