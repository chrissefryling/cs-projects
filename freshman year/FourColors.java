import java.io.*;
	import java.util.*;
	public class FourColors 
	{
///Users/Yasi/Downloads/Europe.txt//

		
			char[] reg;
			public static void main(String[] args) throws FileNotFoundException {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Please input the file location: ");
				String filename = scanner.nextLine();
				Scanner user = new Scanner(System.in);
				System.out.println("What is the number of regions?");
				int region = user.nextInt();
				char[] reg = new char[region];
				FourColors colMap = new FourColors(region);
				colMap.toString(region);
				colMap.coloring(region);
				colMap.toString(region);
			}
			public FourColors(int num)
			{
				reg = new char[num];
				for(int i=1; i<reg.length; i++){
				reg[0] = 'o';
				reg[i] = 'e';
			}
			}
			public static int[][] MapReader(String filename, int numRegions) throws FileNotFoundException {
				File file = new File(filename);
				int [][] array = new int[numRegions][numRegions];
				Scanner scanner  = new Scanner(file);
				for(int i=0; i<array.length; i++)
				{
					for(int j=0; j < array.length; j++)
					{
						array[i][j] = scanner.nextInt();
					}
				}
				return array;
			}
			public boolean coloring(int numRegion) throws FileNotFoundException{
				int col = 0;
				int temp= 0;
				boolean color = true;
				String string = null;
				String file = "/Users/Yasi/Downloads/Europe.txt";
				int[][] map = MapReader(file,numRegion);
				char Red = 'r';
				char Green = 'g';
				char Yellow = 'y';
				char Blue = 'b';    
				   for(int i=0; i<reg.length;i++)
				   {
					  for(int j=0; j<reg.length; j++)
					  {
						  if(map[j][i] == 1){
							   if(reg[i] != 'e' && reg[i] == reg[j])
								   return false;}
					  }
				   }
				for(int k=0; k<reg.length; k++){
						if(reg[k]== 'e'|reg[k] == 'o'){
							color = false;
							temp = k;
					        break;
						}
				        }	
				     if(color)
					 return true;
					 do
					{
					 col++;
					 switch(col)
					 {
					case 1: reg[temp] = Red; break;
					case 2: reg[temp] = Green; break;
					case 3: reg[temp] = Yellow; break;
					case 4: reg[temp] = Blue; break;
					}
					 if(coloring(numRegion)){
					return true;
					}
				}while(col <= 4);	
		           reg[temp] = 'e';
			         return false;
			}	
		public void toString(int numRegion){
			for(int i=0; i<numRegion;i++ )
				{
			 char lastcol = reg[i];
			switch(lastcol)
					{
			case 'r':
				System.out.println("Region is " + i +  " and the color is RED "); break;
			case 'g':
				System.out.println("Region is " + i +  " and the color is GREEN "); break;
			case 'y':
				System.out.println("Region is " + i +  " and the color is YELLOW "); break;
			case 'b':
				System.out.println("Region is " + i +  " and the color is BLUE "); break;
					}
				}
			}
		public void printRegions(char[] array){
			for(int i=0; i<array.length;i++)
			{
				System.out.print(array[i] + " ");
			}
		}

		}