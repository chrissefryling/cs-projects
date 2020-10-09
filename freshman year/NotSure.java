import java.io.*;
import java.util.*;

public class NotSure 
{
	char[] regions;
		
	public static void main(String[] args) throws FileNotFoundException 
	{
		///Users/Chrisse/Downloads/Europe.txt
		Scanner input = new Scanner(System.in);
		System.out.println("What is the filename?");
		String fileName = input.nextLine(); 
		System.out.println("How many regions are there?");
		int num = input.nextInt(); 
		int[] regions = new int[num];
	    NotSure colorMap = new NotSure(num);
			//colorMap.colored(num);
			colorMap.toString(num);

	}
		
	public NotSure(int nums)
	{
			regions = new char[nums];
			
			for(int i = 1; i < regions.length; i++)
			{
				regions[i] = 'e';
			}
			regions[0] = 'o';
	}
		
		public static int[][] ReadMap(String filename, int nrRegions) throws FileNotFoundException {
			File file = new File(filename);
			Scanner in  = new Scanner(file);
		//ADD A PROMPT FOR FILENAME
			int [][] array = new int[nrRegions][nrRegions];
			
			for(int i = 0; i < array.length; i++)
			{
				for(int j = 0; j < array.length; j++)
				{
					array[i][j] = in.nextInt();
				}
			}
			return array;
		}
		
		public boolean colored(int numRegion) throws FileNotFoundException{
			int tempregion1= 0;
			String e = null;
			boolean colored = true;
			String file = "/Users/Chrisse/Downloads/Europe.txt";
			int[][] map = ReadMap(file,9);
			
			
			char RED = 'r';
			char GREEN = 'g';
			char YELLOW = 'y';
			char BLUE = 'b';
			 //CHECK IF COLORED REGIONS IS ACCEPTABLE     
			   int color = 0;
			   
			   for(int s = 0; s< regions.length;s++)
			   {
				  for(int t = 0; t < regions.length; t++)
				  {
					  if(map[t][s] == 1) 
					     {
					    	 
						   if(regions[s] != 'e' && regions[s] == regions[t])
							   return false;
					     }
				  }
			   }
		
	// CHECKING FOR AN UNCOLORED REGION
			for( int t= 0; t< regions.length; t++)
			{
				
					if(regions[t]== 'e' | regions[t] == 'o')
					{
						tempregion1 = t;
				        colored = false;
				        break;
					}	
				
			}
			//CHECK IF ALL REGIONS ARE COLORED
		
			     if(colored)
				   return true;
			     
		 
					   
					 //COLOR REGION // do recursive call.... 
					  
							   do
							   {
								   
								   color++;
								   switch(color)
								   {
								   case 1: regions[tempregion1] = RED;
								   break;
								   case 2: regions[tempregion1] = GREEN;
								   break;
								   case 3: regions[tempregion1] = YELLOW;
								   break;
								   case 4: regions[tempregion1] = BLUE;
								   break;
								  
								   }
								   System.out.println("region " + tempregion1 + " " + regions[tempregion1]);
								   
								   if(colored(9))
								   {
									  
									   return true;
								   }
								   
							   }while(color <= 4);	
		        //else - undo move
	           regions[tempregion1] = 'e';
		  
		         return false;
		}
		
	public void  toString(int numRegion)
	{
		
		
		for(int s = 0; s< numRegion;s++ )
			{
		
		 char finalcolor = regions[s];
		switch(finalcolor)
				{
		case 'r':
			System.out.println("Region is " + s +  " and the color is RED ");
			break;
		case 'g':
			System.out.println("Region is " + s +  " and the color is GREEN ");
			break;
		case 'b':
			System.out.println("Region is " + s +  " and the color is BLUE ");
			break;
		case 'y':
			System.out.println("Region is " + s +  " and the color is YELLOW ");
			break;
				}
		
			}
		
		}
	public void printRegions(char[] array)
	
	{
		for(int i = 0; i < array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
	}

	}

			