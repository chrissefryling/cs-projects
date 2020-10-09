import java.util.*;
import java.io.*;

public class OnlineStore 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//ATTRIBUTES
		Product[] p = new Product[2];
		String name = "";
		int listing = 0;
		int price = 0;
		int weight = 0;
		String des = "";
		boolean inStock = true;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("File:");
		String fileName = input.nextLine();
		File file = new File(fileName);
		Scanner fileInput =  new Scanner(file);
		
		while (fileInput.hasNextLine()) 
		{
			for(int i = 0; i < 2; i++)
			{
			  name = fileInput.nextLine();
			  listing = fileInput.nextInt();
			  price = fileInput.nextInt();
			  weight = fileInput.nextInt();
			  fileInput.nextLine();
			  des = fileInput.nextLine();
			  inStock = fileInput.nextBoolean();
			  fileInput.nextLine();
			  p[i] = new Product(name,listing,price,weight,des,inStock);
			}
		}



		System.out.println(p[0]);
		System.out.println(p[1]);
		
		input.close();
		fileInput.close();
	}
}
