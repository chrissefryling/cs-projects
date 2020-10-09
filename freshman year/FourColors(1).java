/**
 * @version 1 
 * This class reads in a map and colors it using only 4 colors. 
 */

import java.io.*;
import java.util.*;
	public class FourColors 
	{
		int[] countries;
		public static void main(String[] args) throws FileNotFoundException 
		{
				Scanner user = new Scanner(System.in);
				System.out.println("Please input the file location: ");
				String filename = user.nextLine();
				System.out.println("What is the number of countries?");
				int c = user.nextInt();
				FourColors map1 = new FourColors(c);
				read(filename,c);
				map1.solve(c,filename);
				map1.toString(c);
			}
		/**
		 * Constructor method for class FourColors
		 * @param num - number of countries
		 * @return 
		 */
			public FourColors(int num)
			{
				countries = new int[num];
				for(int i=1; i<countries.length; i++)
				{
					countries[0] = 0;
					countries[i] = 1;
			    }
			}
			
			/**
			 * This method reads from the file
			 * @param filename
			 * @param numRegions
			 * @return
			 * @throws FileNotFoundException
			 */
			public static int[][] read(String filename, int numRegions) throws FileNotFoundException {
				File file = new File(filename);
				int [][] map = new int[numRegions][numRegions];
				Scanner scanner  = new Scanner(file);
				for(int i=0; i<map.length; i++)
				{
					for(int j=0; j < map.length; j++)
					{
						map[i][j] = scanner.nextInt();
					}
				}
				return map;
			}
			
			/**
			 * This method solves the map using 4 colors
			 * @param numRegion
			 * @param file
			 * @return
			 * @throws FileNotFoundException
			 */
			public boolean solve(int c,String file) throws FileNotFoundException
			{
				int temp= 0;
				boolean fill = true;
				String filename = file;
				int[][] map = read(file,c); 
				
				
			    for(int s = 0; s< countries.length;s++)
				   {
					  for(int t = 0; t < countries.length; t++)
					  {
						  if(map[t][s] == 1) 
						     {
							   if(countries[s] != 0  && countries[s] == countries[t])
								   return false;
						     }
					  }
				   }
							     
				for(int z = 0; z < countries.length; z++)
					{
							if(countries[z]== '0' | countries[z] == '1')
							{
								temp = z;
						        fill = false;
						        break;
							}		
					}
				if(fill) return true;
				int p = 0;
				do
				{
					p++;
					if(p == 1)
					{
						countries[temp] = 1;
					}
					else if(p == 2)
					{
						countries[temp] = 2;
					}
					else if(p == 3)
					{
						countries[temp] = 3;
					}
					else
					{
						countries[temp] = 4;
					}
					if(solve(c,filename))
						return true;
										   
				}while(p <= 4);	
			         
				return false;
			}
			
			/**
			 * This method prints out the regions
			 * @param n
			 */
		public String toString(int n)
		{
			String result = "";
			for(int i=0; i<n;i++ )
				{
				int colr = countries[i];
				switch(colr)
					{
					case 1:
						result += "Country " + i +  " is yellow "; break;
					case 2:
						result += "Country " + i +  " is green "; break;
					case 3:
						result += "Country " + i +  " is purple "; break;
					case 4:
						result += "Country " + i +  " is blue "; break;
					}
				}
			return result;
			}
	}