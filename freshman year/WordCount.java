import java.util.*;
import java.io.*;

public class WordCount 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the location of the file.");
		String filename = userInput.nextLine();
		File file = new File(filename);
		Scanner fileInput = new Scanner(file);

		int lines = 0;
		int letters = 0;
		int word = 0;
		while(fileInput.hasNextLine())
		{
			  String sentence = fileInput.nextLine();
			  letters += sentence.length();
			  word += new StringTokenizer(sentence, " ").countTokens();
			  lines++;		
		}
		System.out.print("Number of lines: " + lines);
		System.out.print("\nNumber of characters: " + letters);
		System.out.print("\nNumber of words: " + word);
	}
}
