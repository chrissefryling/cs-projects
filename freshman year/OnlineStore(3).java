import java.util.*;
import java.io.*;

public class OnlineStore {

	public static void main(String[] args) throws FileNotFoundException
	{
		//instance
		Product[] p = new Product[2];
		//variables
		String name = "";
		double listing = 0;
		double price = 0;
		double weight = 0;
		String des = "";
		String inStock = "";
		
		
		
		Scanner input = new Scanner(System.in); //scanner
		
		System.out.println("What is the name of the file?");
		String fileName = input.nextLine();
		File files = new File(fileName);
		Scanner fileInput =  new Scanner(fileName);

		
		while(fileInput.hasNextLine())
		{
			for(int i = 0; i < p.length; i++)
			{
			name = fileInput.next();
			listing = fileInput.nextDouble();
			price = fileInput.nextDouble();
			weight = fileInput.nextDouble();
			des = fileInput.next();
			inStock = fileInput.next();
			p[i] = new Product(name,listing,price,weight,des,inStock);
			fileInput.nextLine();
			}
		}
		System.out.println(p[0]);
		System.out.println(p[1]);
	}
}
