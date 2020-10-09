/**Yasmine Pourarian
 * Assignment 2
 * CS 111-002
 **/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
///Users/Yasi/Downloads/sample_input.txt//

public class OnlineStore 
{
    public static void main(String[] args) 
    {
        Scanner Scanner2 = new Scanner(System.in);
        Scanner Scanner1 = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        Product product = null;
        String filename1 = null;
        File file = null;
        Scanner Input = null;
        String name = null;
        double listPrice = 0;
        double price = 0;
        double weight = 0;
        String description = null;
        boolean inStock = false;
        ArrayList<Product> arrayList = new ArrayList<>();
        
        
        
        System.out.println("Enter a filename");
        filename1 = Scanner2.nextLine();
        
        file = new File(filename1);
       
        
        try {
            Input = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file " + filename1);
            System.exit(0);
        }
        
        while (Input.hasNextLine()) {
            
            name = Input.nextLine();
            listPrice = Input.nextDouble();
            price = Input.nextDouble();
            weight = Input.nextDouble();
            Input.nextLine();
            description = Input.nextLine();
            inStock = Input.nextBoolean();
            Input.nextLine();
            
            product = new Product(name, listPrice, price, weight, description, inStock);
            //System.out.println(product);
            arrayList.add(product);
        }
       // System.out.println(arrayList.get(0).toString());
        int choice=0;
        while (choice != 7){
        System.out.println("What would you like to do?");
        System.out.println("1. Add a product to cart");
        System.out.println("2. Remove a product from cart");
        System.out.println("3. Remove all products from cart");
        System.out.println("4. See all products in cart");
        System.out.println("5. Move item up");
        System.out.println("6. Move item down");
        System.out.println("7. Done");
        
        choice = Scanner1.nextInt();
        if(choice == 1)
        	
        {
           System.out.println("What item would you like to add? ");
           int iphone = Scanner1.nextInt();
            
            cart.addingItem(arrayList.get(iphone-1));
        }
        else if(choice == 2)
        {
            System.out.println("Which item number do you want to remove?");
            int user = Scanner1.nextInt();
            System.out.println(cart.removingItem(user-1).toString());
           
            
            //System.out.println("Item Removed:\n " + cart.removingItem(user).toString());
        }
        else if(choice == 3)
        {
            cart.clearing();
        }
        else if(choice == 4)
        {
            System.out.println(cart.toString());
        }
        else if(choice == 5)
        {
           System.out.println("Which item number do you want to move up?");
            int user = Scanner1.nextInt();
            cart.movingUp(user);
        }
        else if(choice == 6)
        {
        	System.out.println("Which item number do you want to move down?");
            int user = Scanner1.nextInt();
            cart.movingDown(user);
        }
        else if(choice == 7)
        {
            System.out.println("Done");
        }
        else
        	
        {
            System.out.println("Not applicable input.");
            
        }
        }
    }
}
