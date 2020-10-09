/**Yasmine Pourarian
 * CS 111-002
 * Assignment 1
**/
public class Review {

	private String username;
	private String text;
	private double rating;
	
	public Review(String username, String text, double rating){
		this.username = username;
		this.text = text;
		this.rating = rating;
		}
	 public String toString()
     {
     	String object;
     	object = "Username: " + username + "\nText: " + text + "\nRating: " + rating;
     			return object;
     }

	}


