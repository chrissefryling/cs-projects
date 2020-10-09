/**
 * Christine Fryling
 * Lab 2
 */
public class ShoppingCart 
{
	private Product[] items;
    private int nrItems;
    
    public ShoppingCart()
    {
        nrItems = 0;
        items = new Product[10];
    }
    
    public void addItem(Product item)
    {
    	if(nrItems < items.length)
    	{
    		items[nrItems] = item;
    		nrItems++;
    	}
    	else
    	{
    		Product[] temp = new Product[items.length*2];
    		for ( int p = 0; p< items.length-1; p++ )
    		{
    			temp[p] = items[p];
    		}
    		items = temp;
    	}
     } 
      public Product removeItem(int i)
      {
    	  Product remove = items[i];
    	  items[i] = null;
      	  nrItems--;
      	  return remove;
      }
    public void clear()
    {
        for(int i = 0; i < items.length; i++)
        {
            items[i] = null;
        }
        nrItems = 0;
    }
    public int getNrItems()
    {
        return nrItems;
    }
    public void moveUp(int i)
    {
    	Product up;
    	up = items[i-1];
    	items[i-1] = items[i];
    	items[i] = up;
    }
    public void moveDown(int i)
    {
    	Product down;
    	down = items[1-i];
    	items[1-i] = items[i];
    	items[i] = down;
    }
    public double getTotal()
    {
    	double total = 0;
        for(int i = 0; i < items.length; i++)
        {
            total += items[i].getPrice();
        }
        return total;
    }
    public String toString()
    {
    	String result = "";
    	if(nrItems == 0)
    	{
    		return "Your cart is empty.";
    	}
    	for(int i = 0; i < nrItems; i++)
    	{
    		result += items[i] + "\n";
    	} 	
    	return result;
    }
}
