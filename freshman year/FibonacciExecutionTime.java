
public class FibonacciExecutionTime {
			public static void main(String[] args)
			{
				long startTime = System.currentTimeMillis();
				System.out.print(fibonacciRecursive(45));
				long endTime = System.currentTimeMillis();
				System.out.println("\n" + startTime);
				System.out.println(endTime-startTime);
				
			}
			public static int fibonacciRecursive(int n) {
				if (n <= 2) return 1;
				
				return fibonacciRecursive(n-2) + fibonacciRecursive(n-1);
			}
			
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
