import java.util.*;

public class ArrayListPractice 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> randomNum = new ArrayList<Integer>();
		Random num = new Random();//random number
		int total = 0; //array total
		int average = 0; //array average
		
		for(int i = 0; i < 10; i++)//populate array
		{
		  int rand = num.nextInt(100);
		  randomNum.add(rand);
		  System.out.print(randomNum.get(i)+ " ");	  
		}
		
		System.out.println(" ");
		
		//print out all even indexes
		for(int z = 0; z < randomNum.size(); z++)
		{
			if(z % 2 == 0)
			{
				System.out.print(randomNum.get(z) + " ");
			}
		}
		
		System.out.println(" ");
		
		//print every even element
		for(int p = 0; p < randomNum.size(); p++)
		{
			if(randomNum.get(p) % 2 == 0)
			{
				System.out.print(randomNum.get(p) + " ");
			}
		}
		
		System.out.println(" ");
		
		//print elements in reverse order
		for(int n = 9; n > -1; n--)
		{
			System.out.print(randomNum.get(n) + " ");
		}
		
		System.out.println("");
		
		//the average of the elements
		for(int x = 0; x < randomNum.size(); x++)
		{
			total += randomNum.get(x);
		}
		average = total/10;
		System.out.println(average);
	}
	
	

}
