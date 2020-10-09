public class Artist 
{
	//fields
	private String last;
	private String first;
	private String birthDate;
	private String twitterHandle;
	private String url;
	//constructor
	public Artist(String last, String first, String birthDate, String twitterHandle, String url)
	{
		this.last = last;
		this.first = first;
		this.birthDate = birthDate;
		this.twitterHandle = twitterHandle;
		this.url = url;
	}
	//toString
	public String toString()
	{
		return first + " " + last + " Birthdate: " + birthDate + "  Twitter Username: " + twitterHandle + " URL: " + url;
	}
}
