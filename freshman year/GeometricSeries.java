import java.util.*;
public class GeometricSeries 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double a;
		double r;
		int n;
		System.out.println("What is a?");
		a = input.nextDouble();
		System.out.println("What is r?");
		r = input.nextDouble();
		System.out.println("What is n?");
		n = input.nextInt();
		System.out.println(calculateGeometricSeriesIterative(a,r,n));
		System.out.println(calculateGeometricSeriesRecursive(a,r,n)); 
		
		input.close();
	}
	
	public static double calculateGeometricSeriesIterative(double a, double r, int n)
	{
		double iter = 0;
		for(int i =0; i<=n;i++)
		{
			iter += a*(Math.pow(r,i));
		}
		return iter;
	}
	
	public static double calculateGeometricSeriesRecursive(double a, double r, int n)
	{
		if(n <= 0)
		{
			return a;
		}
			return a*(Math.pow(r, n)) + calculateGeometricSeriesRecursive(a,r,n-1);
	}
}
