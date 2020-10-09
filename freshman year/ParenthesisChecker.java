import java.util.*;

public class ParenthesisChecker 
{
	public static void main(String[] args) 
	{
		//ask the user for an expression
		Scanner user = new Scanner(System.in);
		System.out.println("Type in an expression.");
		String str = user.nextLine();
		
		//call the method that checks for balance
		boolean bal = isBalanced(str);
		
		//print if valid or invalid
		if(bal)
		{
			System.out.println("The expression is balanced.");
		}
		else
		{
			System.out.println("The expression is unbalanced.");
		}
	}
	
	public static boolean isBalanced(String expression)
	{
		//create the stack 
		Stack<Character> stack  = new Stack<Character>();
		
		//if the expression is 0 
		if(expression.length() <= 0) return false;
		
		//if the expression is odd
		if(expression.length() % 2 != 0) return false;
		
		//for loop to go through each character
        for(int i = 0; i < expression.length(); i++) 
        {
        	//create a character
            char c = expression.charAt(i);
            
            //start with beginning parenthesis
            if(c == '[' || c == '(' || c == '{' ) 
            {
                stack.push(c);
            }
            
            //end with closing parenthesis
            else if(c == ']') 
            {
                if(stack.pop() != '[') return false;
            }
            else if(c == ')') 
            {
                if(stack.pop() != '(') return false;
            }
            else if(c == '}') 
            {
                if(stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty(); //true or false
	}
}