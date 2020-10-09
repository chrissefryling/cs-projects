
public class Product 
{
	//ATTRIBUTES
	String name;
	int list;
	int price;
	int weight;
	String des;
	boolean stock;
	
	//default constructor
	public Product()
	{
		name = "";
		list = 0;
		price = 0;
		weight = 0;
		des = "";
		stock = true;
	}
	//constructor 2
	public Product(String name, int list, int price)
	{
		this.name = name;
		this.list = list;
		this.price = price;
		weight = 0;
		des = "";
		stock = true;
	}
	//constructor 3
	public Product(String name, int list, int price, int weight, String des, boolean stock )
	{
		this.name = name;
		this.list = list;
		this.price = price;
		this.weight = weight;
		this.des = des;
		this.stock = stock;
	}
	public double getPrice()
	{
		return price;
	}
	public double getList()
	{
		return list;
	}
	public void setPrice(int p)
	{
		price = p;
	}
	public void setList(int l)
	{
		list = l;
	}
	public double save()
	{
		double saved = 0;
		saved = list - price;
		return saved;
	}
	public double percent()
	{
		double percent = 0;
		percent = (price * 100) / list;
		return percent;
	}
	public String toString()
	{
		double saved = save();
		double per = percent();
		String result = "";
		
		if(stock == true) //if in stock
		{
			result = "Product: " + name;
			result += "\nList Price: $" + list;
			result += "\nPrice: $" + price;
			result += "\nYou Save: $" + saved + "(" + per + "%)";
			result += "\nDescription: " + des;
			result += "\nShipping weight: " + weight + "lbs.";
		}
		
		else //if out of stock
		{
			result = "Product: " + name;
			result += "\nOUT OF STOCK.";
		}
		return result;
	}
	
}
