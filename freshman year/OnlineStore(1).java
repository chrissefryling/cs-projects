/**
 * Christine Fryling
 * Lab 2
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class OnlineStore 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		String filename = null;
		File file = null;
		Scanner fileInput = null;
		String name = null;
		double listPrice = 0;
		int choice = 0;
		double price = 0;
		double weight = 0;
		String description = null;
		boolean inStock = false;
		Product product = null;
		ArrayList<Product> items = new ArrayList<>();
		ShoppingCart cart = new ShoppingCart();

		
		System.out.println("Enter a filename");
		filename = userInput.nextLine();
		
		file = new File(filename);
		
		try {
			fileInput = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file " + filename);
			System.exit(0);
		}
		
		while (fileInput.hasNextLine()) 
		{
			name = fileInput.nextLine();
			listPrice = fileInput.nextDouble();
			price = fileInput.nextDouble();
			weight = fileInput.nextDouble();
			fileInput.nextLine();
			description = fileInput.nextLine();
			inStock = fileInput.nextBoolean();
			fileInput.nextLine();
			
			product = new Product(name, listPrice, price, weight, description, inStock);
			items.add(product);
			System.out.println(product);
		}
		
		do{
		System.out.println("What would you like to do?");
        System.out.println("1. Add a product to cart");
        System.out.println("2. Remove a product from cart");
        System.out.println("3. Remove all products from cart");
        System.out.println("4. See all products in cart");
        System.out.println("5. Move item up");
        System.out.println("6. Move item down");
        System.out.println("7. Done");
        choice = userInput.nextInt();
        
        if(choice == 1)  	
        {
           System.out.println("Add item (#): ");
           int added = userInput.nextInt();
           cart.addItem(items.get(added-1));
        }
        else if(choice == 2)
        {
            System.out.println("Remove item (#): ");
            int remove = userInput.nextInt();
            System.out.println(cart.removeItem(remove-1).toString());
        }
        else if(choice == 3)
        {
            cart.clear();
        }
        else if(choice == 4)
        {
            System.out.println(cart.toString());
        }
        else if(choice == 5)
        {
           System.out.println("Item to be moved up:");
           int up = userInput.nextInt();
           cart.moveUp(up);
        }
        else if(choice == 6)
        {
        	System.out.println("Item to be moved down:");
            int down = userInput.nextInt();
            cart.moveDown(down);
        }
        else
        {
            System.out.println("Goodbye!");
        }
        
		}while(choice!= 7);
			
        userInput.close();
	}
}
