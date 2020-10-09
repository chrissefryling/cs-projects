import java.io.*;
import java.util.*;
import java.net.*;

public class Dictionary 
{
	private ArrayList<ArrayList<Entry>> words = new ArrayList<>();
	private double total = 0;
	
	public class Entry
	{
		private String word;
		private int num;
		
		public Entry(String word)
		{
			this.word = word;
			this.num = 0;
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		String line = "";
		String[] w = null;
		Dictionary words = new Dictionary();
		URL url = new URL("https://drive.google.com/file/d/0ByG7tKHaTjMWeU9XcUJ2V1pPa1k/view");
		Scanner input = new Scanner(url.openStream());
		while(input.hasNext())
		{
			line = input.nextLine();
			w = line.replaceAll("[^a-zA-Z]", " ").split(" ");
			for(String word : w)
			{
				words.put(word.toLowerCase());
			}
		}
		
		//print top 100 words
		
		input.close();
	}
	
	public Dictionary()
	{
		words = new ArrayList<>(26);
		for(int i = 0; i < 26; i++)
		{
			words.add(new ArrayList<Entry>());
		}
	}
	
	public void put(String word)
	{
		int alpha = ((int) word.charAt(0)) - 'a';
		ArrayList<Entry> w = words.get(alpha);
		
	}
	
	public double get(String word)
	{
		int alpha = ((int) word.charAt(0)) - 'a';
		ArrayList<Entry> w = words.get(alpha);
		
		for(Entry i : w)
		{
			if(i.word.equals(word))
			{
				return i.num;
			}
		}
		return 0;
	}
	
	public double remove(String word)
	{
		if(get(word) != 0)
		{
			words.get(word.charAt(0)).remove(word);
			return words.num / total;
		}
	}
	
	public double getAverageLength()
	{
		double length;
		for(int i = 0; i < words.size(); i++)
		{
			
		}
		return length / total;
	}
	
	public double getAverageFreq()
	{
		
	}
	
	public String[] getTopWords(int top)
	{
		Entry[] tops = new Entry[top];
		
	}
}
