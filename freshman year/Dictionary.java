import java.util.*;
import java.util.Map.Entry;
import java.net.*;
import java.io.*;
public class Dictionary 
{
	private double total;
	private List<Entry<String, Integer>> dict = new ArrayList<Entry<String, Integer>>();
	public class ADT
	{
		private String word;
		private int count;
		
		public ADT()
		{
			word = "";
			count = 0;
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		String word = "";
		Scanner user = new Scanner(System.in);
		URL url = new URL("https://drive.google.com/file/d/0ByG7tKHaTjMWeU9XcUJ2V1pPa1k/view");
		Scanner input = new Scanner(url.openStream());
		int[] counts = null;
		while(input.hasNextLine())
		{
			String line = input.nextLine();
			line = line.replaceAll("[^a-zA-Z]", " ");
		}
		//MENU
		System.out.println("What would you like to do?");
		System.out.println("1. Remove word.");
		System.out.println("2. Find Frequency of a Word.");
		System.out.println("3. Get Average Length.");
		System.out.println("4. Get Average Frequency.");
		System.out.println("5. Get Top Used Words.");
		System.out.println("6. Compare Top Words to Most Used English Words.");
		System.out.println("7. End Program.");
		int choice = user.nextInt();
		Dictionary dt = new Dictionary();
		
		//CHOICES
		if(choice == 1)
		{
			System.out.println("What word do you want to remove?");
			word = user.nextLine();
			dt.remove(word);
			//remove word
		}
		else if(choice == 2)
		{
			System.out.println("What word do you want to remove?");
			word = user.nextLine();
			double freq = dt.get(word);
			System.out.println("The frequency of " + word + " is " + freq);
			//get frequency
		}
		else if(choice == 3)
		{
			double length = dt.getAverageLength();
			System.out.println("The average word length is " + length);
			//averg length
		}
		else if(choice == 4)
		{
			double aver = dt.getAverageFreq();
			System.out.println("The average word frequency is " + aver);
			//averg freq
		}
		else if(choice == 5)
		{
			System.out.println("Number of top words: ");
			int top = user.nextInt();
			String[] topped = dt.getTopWords(top);
			for(int i = 0; i < topped.length; i++)
			{
				System.out.println(topped[i]);
			}
			//top words
		}
		else if(choice == 6)
		{
			dt.compareWords();
			//compare top words
		}
		else
		{
			System.out.println("Goodbye.");
		}
	}
	
	public Dictionary()
	{
		//create empty dictionary here
		total = 0;
	}
	
	public void put(String word)
	{
		//puts word into dictionary, checks if new word or already used
		for(int i = 0; i < dict.size(); i++)
		{
			if(word.equals(dict[i]))
			{
				//update count
			}
		}
		//add new word
	}
	
	public double get(String word)
	{
		//returns frequency of a word
		double freq = 0;
		double count = 0;
		for(int i = 0; i < dict.size(); i++)
		{
			if(word.equals(dict[i]))
			{
				
			}
		}
		freq = count / total;
		return freq;
	}
	
	public double remove(String word)
	{
		//removes word from dictionary and returns frequency
		double freq = 0;
		for(int i = 0; i < dict.size(); i++)
		{
			if(word.equals(dict[i]))
			{
				dict.remove(word);
			}
		}
		//calculate frequency here
		return freq;
	}
	
	public double getAverageLength()
	{
		//returns average length of words
		return 0;
	}
	
	public double getAverageFreq()
	{
		//returns average frequency
		return 0;
	}
	
	public String[] getTopWords(int top)
	{
		//gets the top words, using int top as how many words to be returned
		String[] topWords = new String[top];
		//find top words
		return topWords;
	}
	
	public void compareWords() //compares top words to most used english words
	{
		String[] top = getTopWords(10);
		System.out.println("Top ten words in file: ");
		for(int i = 0; i < 10; i++)
		{
			System.out.print(top[i] + ", ");
		}
		System.out.println("\nTop ten most used english words: ");
		System.out.println("The, be, to, off, and, a, in, that, have, I.");
	}
}
