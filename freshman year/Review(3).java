/**
 * Christine Fryling
 * Lab 2
 */
public class Review 
{
	private int rating;
	private String text;
	private String username;
	
	public Review(int rating, String text, String username) 
	{
		this.rating = rating;
		this.text = text;
		this.username = username;
	}
	
	public String toString() 
	{
		String result = "";
		result += "Rating : " + rating + "\n";
		result += "Text : " + text + "\n";
		result += "Username : " + username + "\n";
		return result;
	}
	
	public int getRating() 
	{
	  return rating;
	}
}
