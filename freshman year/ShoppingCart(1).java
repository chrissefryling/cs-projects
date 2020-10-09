/**Yasmine Pourarian
 * CS 111-002
 * Assignment 2
 **/
import java.util.*;
public class ShoppingCart
{
    private Product[] items;
    private int numberofItems;
    private double totalPrice;
    
    public ShoppingCart(){
        numberofItems = 0;
        totalPrice = 0;
        items = new Product[10];
    }
    public ShoppingCart(int number, Product[] newitems){
    	Product[] temp = new Product[newitems.length];
       for(int p = 0; p < newitems.length; p++)
       {
    	   temp[p] = newitems[p];
       }
       items = temp;
    }
    public void addingItem(Product addItem){
    	if
    	(numberofItems < items.length)
    	{
    		items[numberofItems] = addItem;
    		numberofItems++;
    	}
    	else
    	{
      Product[] temp = new Product[items.length*2];
      for ( int p = 0; p< items.length-1; p++ ){
    	 temp[p] = items[p];
    	 }
     	items = temp;
    	}
     }
    	 
      public Product removingItem(int p){
    	
    	  Product temp = items[p];
      		items[p] = null;
      		numberofItems--;
      		
      		return temp;
    }
    public void clearing(){
        for(int p = 0; p < items.length; p++)
        {
            items[p] = null;
        }
        numberofItems = 0;
    }
    public int getnumbofItems(){
        return numberofItems;
    }
    public void movingUp(int p){
    	Product temp;
    	temp = items[p-1];
    	items[p-1] = items[p];
    	items[p] = temp;
    }
    public void movingDown(int p){
    	Product temp;
    	temp = items[1-p];
    	items[1-p] = items[p];
    	items[p] = temp;
    }
    public double obtainTotal(){
        for(int p = 0; p < items.length; p++)
        {
            totalPrice += items[p].getPrice();
        }
        return totalPrice;
    }
    public String toString(){
    	String e = " ";
    	if(numberofItems == 0)
    	{
    		return "Empty Cart";
    	}
    	for (int p = 0; p < numberofItems; p++)
    	e += items[p] + "\n";
    	
    	return e;
    	
    }
}
