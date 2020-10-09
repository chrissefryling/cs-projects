/**
 * Christine Fryling
 * Lab 2
 */
import java.util.*;
public class Product 
{
	private String name;
	private double listPrice;
	private double price;
	private double weight;
	private String description;
	private List<Review> reviews = new ArrayList<Review>();
	private boolean inStock;
	
	public Product() 
	{
		name = "";
	    listPrice = 0;
	    price = 0;
	    weight = 0;
	    description = "";
	    inStock = true;
	}
	
	public Product(String name, double listPrice, double price)
	{
		this.name = name;
		this.listPrice = listPrice;
		this.price = price;
	}
	
	public Product(String name, double listPrice, double price, double weight, String description, boolean inStock) {
		this.name = name;
		this.listPrice = listPrice;
		this.price = price;
		this.weight = weight;
		this.description = description;
		this.inStock = inStock;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getListPrice() {
		return listPrice;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}
	
	public void addReview(Review review)
	{
		reviews.add(review);
	}
	
	public double getAverageRating()
	{
		double aver = 0;
		double tot = 0;
		for(int i = 0; i < reviews.size(); i++)
		{
			tot += reviews.get(i).getRating();
		}
		aver = tot / reviews.size();
		return aver;
	}
	
	public String toString() 
	{
		String result = "Product: " + name + "\n";
		
		if (inStock) {
			result += "List Price: " + listPrice + "\n";
			result += "Price: " + price + "\n";
			result += "You save: " + "$" + (listPrice - price) + " (" + ((listPrice - price) / listPrice * 100) + "%)" + "\n";
			result += "Description: " + description + "\n";
			result += "Shipping Weight: " + weight + " lbs" + "\n";
			result += "Average Stars: " + getAverageRating() + "\n";
			result += "Reviews: " + reviews + "\n";
		} 
		else 
		{
			result += "This product is OUT OF STOCK." + "\n";
		}
		return result;
	}
}
