import java.util.*;

public class Recursive 
{
	public static void main(String args[])
    {
		Scanner input = new Scanner(System.in);
		//ask the user for input
		System.out.print("Base: ");
		int x = input.nextInt();
		System.out.print("\nPower: ");
        int n = input.nextInt();
        //display
        System.out.println("n to the xth power is: " + power(x,n));
    }
	
	public static int power(int x, int n)
    {
        if (n > 0) //postive power
        {
        	return (x * power(x,n-1));
        }
        else if(n < 0) //negative power
        {
         return 1 / (x * power(x,-n));
        }
        else 
        {
            return 1;
        }
    }
}