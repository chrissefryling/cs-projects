import java.util.*;

public class ArrayPractice 
{
	public static void main(String[] args)
	{
		int[] randomNum = new int[10];//array
		Random num = new Random();//random number
		int total = 0; //array total
		int average = 0; //array average
		
		for(int i = 0; i < randomNum.length; i++)//populate array
		{
		  int rand = num.nextInt(100);
		  randomNum[i] = rand;
		  System.out.print(randomNum[i]+ " ");	  
		}
		
		System.out.println(" ");
		
		//print out all even indexes
		for(int z = 0; z < randomNum.length; z++)
		{
			if(z % 2 == 0)
			{
				System.out.print(randomNum[z] + " ");
			}
		}
		
		System.out.println(" ");
		
		//print every even element
		for(int p = 0; p < randomNum.length; p++)
		{
			if(randomNum[p] % 2 == 0)
			{
				System.out.print(randomNum[p] + " ");
			}
		}
		
		System.out.println(" ");
		
		//print elements in reverse order
		for(int n = 9; n > -1; n--)
		{
			System.out.print(randomNum[n] + " ");
		}
		
		System.out.println("");
		
		//the average of the elements
		for(int x = 0; x < randomNum.length; x++)
		{
			total += randomNum[x];
		}
		average = total/10;
		System.out.println(average);
	}
}
