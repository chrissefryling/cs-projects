
public class Review
{
	//ATTRIBUTES
	int rating;
	String text;
	String username;
	
	//default constructor 
	public Review(int rating, String text, String username)
	{
		this.rating = rating;
		this.text = text;
		this.username = username;
	}
	
	public String toString()
	{
		String result = "";
		result = "Username: " + username + "   Rating: " + rating;
		result += "\n" + text;
		return result;
	}
}
