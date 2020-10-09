import java.util.*;

public class Product 
{
	private String name;
	private double listing;
	private double price;
	private double weight;
	private String description;
	private String inStock;

	public Product()
	{
		name = "";
		listing = 0;
		price = 0;
		weight = 0;
		description = "";
		inStock = "";
	}
	public Product(String name, double listing, double price)
	{
		this.name = name;
		this.listing = listing;
		this.price = price;
		weight = 0;
		description = "";
		inStock = "";;
	}
	public Product(String name, double listing, double price, double weight, String description, String inStock)
	{
		this.name = name;
		this.listing = listing;
		this.price = price;
		this.weight = weight;
		this.description = description;
		this.inStock = inStock;
	}
	public String toString()
	{
		String result;
		if(inStock.equals("True"))
		{
		double savings;
		savings = listing - price;
		result = "Product: " + name + "\nList Price: $"
				+ listing + "\nPrice: $" + price + "\nYou save: $"
				+ savings + "\nDescription: " + description + "\nShipping weight: "
				+ weight;
		return result;
		}
		else
		{
			result = "Product: " + name + "\n OUT OF STOCK";
			return result;
		}
	}

}
