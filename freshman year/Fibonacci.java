/**
 * @author Nikola Janevski
 * 
 * Contains methods for calculating the Fibonacci numbers 
 * iteratively and recursively. The Fibonacci numbers are declared as:
 * F(1) = 1 
 * F(2) = 1
 * F(n) = F(n-1) + F(n-2), n > 2
 */
public class Fibonacci {
	
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		System.out.print(fibonacciRecursive(25));
		long endTime = System.currentTimeMillis();
		System.out.println(startTime);
		long totalTime = (endTime - startTime);
		System.out.println(totalTime);
		
	}
	
	/**
	 * Recursive method for calculating the n-th Fibonacci number.
	 * @param n - the Fibonacci number to be calculated
	 * @return the n-th Fibonacci number
	 */
	public static int fibonacciRecursive(int n) {
		if (n <= 2) return 1;
		
		return fibonacciRecursive(n-2) + fibonacciRecursive(n-1);
	}
	
	/**
	 * Iterative method for calculating the n-th Fibonacci number.
	 * @param n - the Fibonacci number to be calculated
	 * @return the n-th Fibonacci number
	 */
	public static int fibonacciIterative(int n) {
		int previous = 1;
		int next = 1;
		int current = 1;
		
		for (int i = 3; i <= n; i++) {
			next = current + previous;
			previous = current;
			current = next;
		}
		return next;
	}
}
