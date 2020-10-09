/**Yasmine Pourarian
 * Assignment 2
 * CS 111-002
 **/
import java.util.*;
public class Product {
	private String name;
	private double listPrice;
	private double price;
	private double weight;
	private String description;
	private boolean inStock;
	private ArrayList <Review> reviews;
	private double averageReview;
	
	public Product() 
	{
	    name = "";
	    listPrice = 0;
	    price = 0;
	    weight = 0;
	    description = "";
	    inStock = false;
	    List<Review> reviews = new ArrayList<Review>();
	}
	
	public Product(String name, double listPrice, double price) {
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
	
	public String toString() {
		String result = "Product: " + name + "\n";
		
		if (inStock) {
			result += "List Price: " + listPrice + "\n";
			result += "Price: " + price + "\n";
			result += "You save: " + "$" + (listPrice - price) + " (" + ((listPrice - price) / listPrice * 100) + "%)" + "\n";
			result += "Description: " + description + "\n";
			result += "Weight: " + weight + " lbs" + "\n";
			result += "AverageUsers/Yasi/Downloads/sample_input.txt Review: " + averageReview + "\n";
			result += "Reviews: " + reviews + "\n";
		} else {
			result += "This proiduct is OUT OF STOCK." + "\n";
		}
		return result;
	}
	
	public void addReview(Review review)
	{
	    reviews.add(review);
	}
	
}
