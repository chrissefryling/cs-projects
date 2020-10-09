import java.util.*;
public class Page233 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		String[] kidNames = {"Caryn","Debbie","Dustin","Elliot","Jacquie","Jonathan","Rich"};
		System.out.println("Type the name you want to search: ");
		String key = userInput.nextLine();
		
		//BinarySearch(kidNames,key);
		
		if(BinarySearch(kidNames,key) == -1)
		{
			System.out.println("The name does not exist.");
		}
		else
		{
			System.out.println("The index of the name is: " + BinarySearch(kidNames,key));
		}
		
	}	
	public static int BinarySearch(String[] names, String target)
	{
		int first = 0;
		int last = names.length-1;
		int middle = 0;
		
		while (first <= last) 
		{
	       middle = (first + last) / 2;
	       String found = names[middle];
	       
	       if(target.compareTo(found) == 0)
	       {
	    	   return middle;
	       }
	       else if(target.compareTo(found) < 0)
	       {
	    	   last = middle -1;
	       }
	       else
	       {
	    	   first = middle + 1;
	       }
	    }
		return -1; 
	}

}
