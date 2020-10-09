/** This class converts infix to postfix. 
 * @author Christine Fryling
 * @version 1
 * Code from: pages 174-176, Data Structures, Abstraction and Design using Java
 * by Elliot B Koffman and Paul Wolfgang
 */
import java.util.*;
public class InfixToPostfix 
{ 
	//NESTED CLASS
	/** Handles exception, shows user if they used a wrong character
	 * @param message
	 * @return message
	 */
	public static class SyntaxErrorException extends Exception 
	{
		private static final long serialVersionUID = 1L;
		SyntaxErrorException(String message) 
		{ 
			super(message); 
	    } 
	} 
	
	//fields 
    private static final Deque<Character> operatorStack = new ArrayDeque<>();  
    private static final StringJoiner postfix = new StringJoiner(" ");
    private static Queue<Character> queue = new LinkedList<Character>();

    /**
     * Main method for class InfixToPostfixParens, asks user to 
     * input a infix expression and calls methods to convert the expression
     * to postix.
     * @param args
     * @throws SyntaxErrorException
     */
    public static void main(String[] args) throws SyntaxErrorException
    {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter an expression: ");
    	String infix = input.nextLine();
    	convertToPostfix(infix);
    	System.out.println("The postfix expression is: " + getPostfix());
    	input.close(); 
    }

    /** Return the final postfix string. 
     *  @return The final postfix  
     */ 
    public static Queue<Character> getPostfix() 
    { 
    	return queue;
    } 
    
    /**
     * ToString method 
     * @return string object
     */
    public String toString()
    {
    	String result = "";
    	for(int i = 0; i < queue.size(); i++)
    	{
    		result += queue.element().toString() + " ";
    	}
    	return result;
    }

    /** 
     *  Convert a string from infix to postfix.  
     *  Uses a stack to convert an infix expression to postfix 
     *  @pre operator stack is empty 
     *  @post postFix contains postfix expression and stack is empty 
     *  @param infix the string to convert to postfix 
     *  @throws SyntaxErrorException if argument is invalid 
     *  @return postfix
     */ 
    private static void convertToPostfix(String infix) throws SyntaxErrorException 
    { 
    	infix = infix.replaceAll(" ", "");
    	//Queue queue = new LinkedList();
    	char[] ch = {};
    	for(int i = 0; i < infix.length(); i++)
    	{
    		ch[i] = infix.charAt(i);
    	}
    	for(int j = 0; j < ch.length; j++)
    	{
    		char firstChar = ch[j];
    		if (firstChar == '(' || Character.isLetter(firstChar) || Character.isDigit(firstChar)) 
            { 
                 queue.add(firstChar);  
            } 
            else if(isOperator(firstChar)) 
            { 
                processOperator(firstChar); 
            }
    		//ERRORS
            else if(firstChar == ')')
            {
            	throw new SyntaxErrorException("Mismatched Partheses");
            }
            else 
            { 
                throw new SyntaxErrorException("Unexpected Character Encountered: " + firstChar); 
            } 
    	}
    	
} 
    /** Method to process operators. 
        @param op The operator 
        @throws NoSuchElementException 
     */ 
    public static void processOperator(char op) 
    { 
    	if (queue.isEmpty() || op == '(') 
    	{ 
            queue.add(op); 
        }
    	else 
    	{ 
           char topOp = queue.peek(); 
           if (precedence(op) > precedence(topOp)) 
           { 
                 queue.add(op); 
           } 
           else 
           {  
             while (!queue.isEmpty() && precedence(op) <= precedence(topOp))
             { 
                    queue.poll(); 
                    if (topOp == '(') 
                    { 
                       break; 
                    } 
                    postfix.add(new Character(topOp).toString()); 
                   if (!queue.isEmpty()) 
                   {  
                   topOp = queue.peek(); 
                   } 
              } 
                   if (op != ')') 
                         operatorStack.push(op); 
           } 
          } 
    } 
  /** Determine whether a character is an operator. 
    *@param ch The character to be tested 
    *@return true or false 
  */ 
    private static boolean isOperator(char ch) 
    { 
    	return ch == '+' || ch == '-' || ch == '/' || ch == '*';
    }

/** Determine the precedence of an operator. 
    @param op & next 
    @return true or false 
 */ 
    private static int precedence(char op) 
    { 
    	char[] pre = {'/','*','+','-'};
    	int index = 0;
    	for(int i = 0; i < pre.length; i++)
    	{
    		if(op == pre[i])
    		{
    			index = i;
    		}
    	}
    	return index;
    } 
}