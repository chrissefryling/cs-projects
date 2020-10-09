import java.util.*;

public class ReverseSentence 
{
	public static void main (String[] args)
	{
		Stack<String> s = new Stack<String>();
		Scanner user = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String input = user.nextLine();
		String[] words = input.split("\\s+");
		
		backwards(s,words);
		
		user.close();
	}
	
	public static void backwards(Stack<String> s, String[] words)
	{
		for(int i = 0; i < words.length; i++)
		{
			s.push(new String(words[i]));
		}
		System.out.println("Backwards: ");
		while(!s.isEmpty())
		{
			System.out.print(s.pop() + " ");
		}
	}
}
