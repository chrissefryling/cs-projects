import java.util.Scanner;
import java.util.Stack;

public class ReverseSentence {
    public static void main(String[] args)
    {
    	Stack stack = new Stack();
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Please input a sentence: ");
    
    	String input = scanner.nextLine();
    	String[] phrase = input.split("\\s+");

for(int k = 0; k<phrase.length; k++){
    stack.push(new String (phrase[k]));
}
while(!stack.isEmpty()){
    System.out.print(stack.pop() + " ");
		}
    }
}
