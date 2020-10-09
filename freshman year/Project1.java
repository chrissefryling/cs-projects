/**
 * This class colors a map. No region touching each other can be the
 * same color.
 * @author Christine Fryling
 * @version Sept 25 2016
 */
import java.io.*;
import java.util.*;

public class Project1 
{
	//fields
	private int[] regions;
	private static int[][] map;
		
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the filename?");
		String fileName = input.nextLine(); 
		System.out.println("How many regions are there?");
		int num = input.nextInt(); 
		File file = new File(fileName);
		Scanner read  = new Scanner(file);
		//read from the file
		map = new int[num][num];
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map.length; j++)
			{
				map[i][j] = read.nextInt();
			}
		}
	    Project1 map1 = new Project1(num);
		map1.solve(num,map,fileName);
	    map1.toString(num);

	}
	
	/**
	 * Constructor method for class Project1
	 * @param number - the number of regions
	 */
	public Project1(int number)
	{
		regions = new int[number];
		for(int i = 1; i < regions.length; i++)
			{
				regions[i] = 0;
			}
			regions[0] = 1;
	}
	
	/**
	 * This method solves the map.
	 * @param numRegion - number of regions
	 * @param map - the map array
	 * @param fileName - the name of the file
	 * @return
	 * @throws FileNotFoundException
	 */
	public boolean solve(int numRegion, int[][] map, String fileName) throws FileNotFoundException
	{
		int temp= 0;
		boolean fill = true;
		int[][] mapped = map;
	    int p = 0;
	    
	    for(int s = 0; s< regions.length;s++)
		   {
			  for(int t = 0; t < regions.length; t++)
			  {
				  if(mapped[t][s] == 1) 
				     {
					   if(regions[s] != 0  && regions[s] == regions[t])
						   return false;
				     }
			  }
		   }
					     
		for(int z = 0; z < regions.length; z++)
			{
					if(regions[z]== '0' | regions[z] == '1')
					{
						temp = z;
				        fill = false;
				        break;
					}		
			}
		if(fill) return true;
		do
		{
			p++;
			switch(p)
			{
				case 1: regions[temp] = 1;
				break;
				case 2: regions[temp] = 2;
				break;
				case 3: regions[temp] = 3;
				break;
				case 4: regions[temp] = 4;
				break;
			}
			if(solve(numRegion,map,fileName))
				return true;
								   
		}while(p < 5);	
	         
		return false;

	}
		
	/**
	 * ToString method for class Project1
	 * @param numbers
	 * @return
	 */
	public String toString(int numbers)
	{
		for(int i = 0; i < numbers; i++ )
			{
		       int finalcolor = regions[i];
		       switch(finalcolor)
				{
		          case 1:
			      return "Region " + i +  " is teal.";
		          case 2:
		          return "Region " + i +  " is purple. ";
		          case 3:
		          return "Region " + i +  " is yellow.";
		          case 4:
		          return "Region " + i +  " is blue.";
				}
			}
		return "";
	}
}
		