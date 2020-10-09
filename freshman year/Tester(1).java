/**
* This class is the tester class, using both Dictionary and Entry. It reads in a file, 
 * creates different entries and dictionaries. It prints the top 10 words and the 
 * dictionary
 * @author Christine Fryling
 * @version November 5 2017
 */

package project3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// /Users/Chrisse/Downloads/alone.txt
public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		// Ask user for input
		Scanner read = new Scanner(System.in);
		System.out.println("Input file path: ");
		String filePath = read.nextLine();

		// Take in words from file
		String line = "";
		String[] w = null;
		Dictionary words = new Dictionary();
		File file = new File(filePath);
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			line = input.nextLine();
			w = line.replaceAll("[^a-zA-Z]", " ").split(" +");
			for (String word : w) {
				words.insert(word.toLowerCase().trim());
			}
		}

		// Print dictionary & top 10 words
		System.out.print("Dictionary:");
		words.printDictionary();
		System.out.println("Top 10 words: " + Arrays.toString(words.getTopWords(5)));

		input.close();
		read.close();
	}

}
