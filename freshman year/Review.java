import java.util.*;

public class Review 
{
	private double rating;
	private String text;
	private String username;
	
	public Review(double rating, String text, String username)
	{
		this.rating = rating;
		this.text = text;
		this.username = username;
	}
	public String toString()
	{
		String result = "";
		result = "Username: " + username + "\n" + text
				+ "\nRating: " + rating;
		return result;
	}
	
}