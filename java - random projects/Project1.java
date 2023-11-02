/**
 * @author Christine Fryling
 * @version 1
 * This program reads an array of 0's and 1's, as a map. It then colors
 * the countries using only 4 colors.
 */

import java.io.*;
import java.util.*;

public class Project1 
{
	//fields
	private int[] regions;
	private static int[][] map;
		
	public static void main(String[] args) throws IOException 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the file name: ");
		String fileName = input.nextLine(); 
		System.out.println("Please enter the amount of countries: ");
		int count = input.nextInt(); 
		
		read(fileName,count);
	    Project1 colors = new Project1(count);
		colors.solve(count,map,fileName);
	    colors.toString(count);
	}
	
	public static int[][] read(String files, int c)throws IOException
	{
		File file = new File(files);
		Scanner read  = new Scanner(file);
		map = new int[c][c];
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map.length; j++)
			{
				map[i][j] = read.nextInt();
			}
		}
		return map;
	}
	
	/**
	 * Constructor method for class Project1
	 * @param number - the number of regions
	 */
	public Project1(int c)
	{
		regions = new int[c];
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
		int[][] countries = map;
	    int p = 0;
	    
	    for(int s = 0; s< regions.length;s++)
		   {
			  for(int t = 0; t < regions.length; t++)
			  {
				  if(countries[t][s] == 1) 
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
			if(p == 1)
			{
				regions[temp] = 1;
			}
			else if(p == 2)
			{
				regions[temp] = 2;
			}
			else if(p == 3)
			{
				regions[temp] = 3;
			}
			else
			{
				regions[temp] = 4;
			}
			if(solve(numRegion,map,fileName))
				return true;
								   
		}while(p <= 4);	
	         
		return false;

	}
		
	/**
	 * ToString method for class Project1
	 * @param numbers
	 * @return
	 */
	public String toString(int numbers)
	{
		for(int i = 0; i < numbers;)
			{
				i++;
		       int finalcolor = regions[i];
		       if(finalcolor == 1)
		       {
		    	   return "Country " + i +  " is purple.";
		       }
		       else if(finalcolor == 2)
		       {
		    	   return "Country " + i +  " is red. ";
		       }
		       else if(finalcolor == 3)
		       {
		    	   return "Country " + i +  " is blue. ";
		       }
		       else
		       {
		    	  return "Country " + i +  " is green. ";
		       }
			}
		return "";
	}
}
		