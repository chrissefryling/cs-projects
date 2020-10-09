/**Yasmine Pourarian
 * CS 111-002
 * Assignment 1
**/
import java.util.*;
import java.io.*;

public class OnlineStore
{
    public static void main(String[] args)
    {
        Product sale = null;
        Product sale2 = null;
        Scanner userInput = new Scanner(System.in);
        Scanner read = null;
        File file = null;
        String name = "";

        System.out.println("Enter file name: ");
        name = userInput.nextLine();

        file = new File(name);
        try {
            read = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("This file doesn't exist.");
        }
        while (read.hasNextLine()) 
        {
            String product = read.nextLine();
            String listingprice = read.nextLine();
            String price = read.nextLine();
            String weight = read.nextLine();
            String description = read.nextLine();
            String stocked = read.nextLine();
            String product2 = read.nextLine();
            String listingprice2 = read.nextLine();
            String price2 = read.nextLine();
            String weight2 = read.nextLine();
            String description2 = read.nextLine();
            String stocked2 = read.nextLine();
            
            if (stocked.equals("true")){
            sale = new Product(product,listingprice,price,weight,description,stocked);
            System.out.println(sale);
            }
            else System.out.println("OUT OF STOCK");
            if(stocked2.equals("true")){
            sale2 = new Product(product2,listingprice2,price2,weight2,description2,stocked2);
            System.out.println(sale2);
            }
            else System.out.println("Product: " + product2  +"\nOUT OF STOCK");
            
            //testing review
            //Review iphone = new Review("Yasi","good",10);
           // System.out.println(iphone);
            
        }
        
       
    }
}


