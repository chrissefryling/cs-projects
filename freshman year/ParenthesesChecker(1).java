import java.util.Scanner;
import java.util.Stack;
public class ParenthesesChecker {

    public static void main(String[] args) {
    	 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input an expression: ");
        String string = scanner.nextLine();
        boolean balance = isBalanced(string);
        if(balance){
            System.out.println("Valid expression.");
        }
        else
        	System.out.println("Invalid expression.");
    }
public static boolean isBalanced(String expression){
	Stack stack = new Stack();
	if(expression.length() <= 0)
	{
		return false;
	}
	for (int i=0; i<expression.length(); i++){
		if(expression.charAt(i) == '(')
			stack.push('(');
		if(expression.charAt(i) == '{')
			stack.push('{');
		if(expression.charAt(i) == '[')
			stack.push('[');
		
		if(expression.charAt(i) == ')'){
			if(!stack.empty() && stack.peek().equals('('))
				stack.pop();
			else
				return false;
		}	
		if(!stack.empty() && expression.charAt(i) == '}'){
			if(stack.peek().equals('{'))
				stack.pop();
			else
				return false;
		}
		if(!stack.empty() && expression.charAt(i) == ']'){
			if(stack.peek().equals('['))
				stack.pop();
			else
				return false;
		}
	}
		if(stack.isEmpty()){
			return true;
		}
		else
			return false;
}
}

