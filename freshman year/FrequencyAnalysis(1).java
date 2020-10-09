import java.util.*;
import java.io.*;
import java.net.*;

public class FrequencyAnalysis 
{	
	private static double total;
	
	public static void main(String[] args) throws IOException
	{
		int[] counts = new int [26];
		URL url = new URL("http://www.gutenberg.org/files/11/11-0.txt");
		Scanner input = new Scanner(url.openStream());
		
		while (input.hasNextLine())
		 {
			 String line = input.nextLine();
			 count(line.toLowerCase(),counts);
		 }
		for(int i = 0; i < counts.length; i++)
		{
			System.out.println("Character: " + letter(i) + " Count: " + counts[i] + " Frequency: " + counts[i]/total);
		}
		input.close();
	}
	
	public static char letter(int i)
	{
		char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		return a[i];
	}
	
	public static void count(String line, int [] counts)
	{
		int numLetter = 0;
		for(int z = 0; z< line.length(); z++)
		{
			char c = line.charAt(z);
			
			if(Character.isLetter(c))
			{
				numLetter = c - 'a';
				counts[numLetter] += 1;
				total += 1;
			}
		}
	}
}
