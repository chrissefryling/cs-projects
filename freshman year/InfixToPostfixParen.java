/**
 * @author Christine Fryling
 * @version 1
 * This program changes infix to postfix. It will tell the user if 
 * there are any errors.
 */
import java.util.*;
public class InfixToPostfixParen 
{
	public static void main(String[] args)
	{
		
		Scanner user = new Scanner(System.in);
		String infix = "";
		
		do{
			System.out.println("Please type an expression. If done, enter done.");
			infix = user.nextLine().toLowerCase();
			
			if(!infix.equals("done"))
			{
				Queue<Character> q = convertToPostfix(infix);
				System.out.println(q);
			}
			else
			{
				System.out.println("Goodbye.");
			}
		}while(!infix.equals("done"));
		user.close();
	}
	
	/**
	 * Changes infix to postfix
	 * @param infix - the expression
	 * @return q - the queue of postfix
	 */
	public static Queue<Character> convertToPostfix(String infix) 
	{
		LinkedList<Character> q = new LinkedList<Character>();
		Stack<Character> s = new Stack<Character>();
		infix = infix.replaceAll(" ", "");
		char[] ch = infix.toCharArray();
		
		for(int i = 0; i < ch.length ; i++)
		{
			char c = ch[i];
			
			if(operand(c)) //if c is operand
			{
				if(i < ch.length - 1 && !(operator(ch[i + 1]) || ch[i + 1] == ')'))
				{
					throw new RuntimeException("Missing operator.");
				}
				else q.offer(c);
			}
			else if(c == '(')
			{
				if(i >= ch.length - 1 || operator(ch[i + 1]))
				{
					throw new RuntimeException("Missing operand.");
				}
				else s.push(c);
			}
			else if(c == ')')
			{
				try 
				{
					while (s.peek() != '(' ) 
					{
						q.offer(s.pop());
					}
				} 
				catch (EmptyStackException e) 
				{
					throw new RuntimeException("Uneven parenthesis.");
				}
				
				s.pop(); 
				
			}
			else if(operator(c)) //if c is operator
			{
				if(i == 0 || i >= ch.length - 1 || operator(ch[i + 1]) || ch[i + 1] == ')')
				{
					throw new RuntimeException("Missing operand.");
				}
				while(!s.isEmpty() && s.peek() != '(' && !precedence(c, s.peek()))
				{
					q.offer(s.pop());
				}
				s.push(c);
			}
			else //if not operand or operator or parenthesis
			{
				throw new RuntimeException("Unexpected character.");
			}
		}
		
		while(!s.isEmpty())
		{
			q.offer(s.pop());
		}
		
		return q;
	}
	
	/**
	 * finds whether the next operator has precedence over the first
	 * @param a - first operator
	 * @param b - second operator
	 * @return true if and only if a is of greater precedence than b
	 */
	public static boolean precedence(char a, char b)
	{
		return (a == '/' || a == '*') && (b == '+' || b == '-');
	}
	
	/**
	 * tests to see if the character is an operand
	 * @param c - character
	 * @return true or false
	 */
	public static boolean operand(char c)
	{
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
	}
	
	/**
	 * tests to see if the character is an operator
	 * @param c - character
	 * @return true or false
	 */
	public static boolean operator(char c)
	{
		return c == '+' || c == '-' || c == '/' || c == '*';
	} 
	
}