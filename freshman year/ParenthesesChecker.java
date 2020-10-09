import java.util.*;

public class ParenthesesChecker 
{
    public static void main(String[] args) 
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Please type an expression: ");
        String string = user.nextLine();
        boolean equal = balance(string);
        
        if(equal == true)
        {
            System.out.println("Valid.");
        }
        else
        {
        	System.out.println("Mismatched parentheses.");
        }
        
        user.close();
    }
    
    public static boolean balance(String str)
    {
    	Stack<Character> s = new Stack<Character>();
    	
    	for (int i = 0; i < str.length(); i++)
    	{
    		//({[
    		if(str.charAt(i) == '(')
    		{
    			s.push('(');
    		}
    		else if(str.charAt(i) == '{')
    		{
    			s.push('{');
    		}
    		else if(str.charAt(i) == '[')
    		{
    			s.push('[');
    		}
    		
    		//}])
    		else if(str.charAt(i) == ')')
    		{
    			if(!s.empty() && s.peek().equals('('))
    			{
    				s.pop();
    			}
    			else
    			{
    				return false;
    			}
    		}	
    		else if(!s.empty() && str.charAt(i) == '}')
    		{
    			if(s.peek().equals('{'))
    			{
    				s.pop();
    			}
    			else
    			{
    				return false;
    			}
    		}
    		else if(!s.empty() && str.charAt(i) == ']')
    		{
    			if(s.peek().equals('['))
    			{
    				s.pop();
    			}
    			else
    			{
    				return false;
    			}
		}
	}
    	
    //if the stack is empty, it's valid. if there's left over paren it's not	
    	if(s.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
    }
}

