public class Artist 
{
	private String last;
	private String first;
	private String birthdate;
	private String twitter;
	private String url;
	
	public Artist(String l, String f, String day, String t, String u)
	{
		last = l;
		first = f;
		birthdate = day;
		twitter = t;
		url = u;
	}
	
	public String toString()
	{
		return first + " " + last + "\nBirthday: " + birthdate + "\nTwitter: @" + twitter + "\nURL: " + url;
	}

}
