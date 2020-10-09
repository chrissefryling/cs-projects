import java.util.*;
import java.io.*;
import java.net.*;
public class FrequencyAnalysis
{
		private static double total;
		public static void main(String[] args) throws IOException
		{
			URL url = null;
			try {
				url = new URL("http://www.gutenberg.org/files/11/11-0.txt");
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			 Scanner input = new Scanner(url.openStream());
			 int[] counts = new int [26];
			 while (input.hasNextLine())
			 {
				 String line = input.nextLine();
				 count(line,counts);
			 }
			System.out.println("URL: ");
			for(int z = 0; z< counts.length; z++){
				System.out.println("Letter: " + z + " Count: " + counts[z] + " Frequency: " + counts[z]/total);
			}
		}
		public static void count(String line, int[] counts)
		{
			line = line.toLowerCase();
			for(int z = 0; z< line.length(); z++){
				char character = line.charAt(z);
				if(Character.isLetter(character)){
					int index = character - 'a';
					counts[index] += 1;
					total += 1;
			}
			
		}

}
}

