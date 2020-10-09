public class VHS extends Video
{
	//fields
	private String trailers[];
	private int numTrailers;
	//constructor
	public VHS(String title, String artist, double playingTime, int numPlays, String[] supportingActors, String director, int numActors, int rating, String[] trailers, int numTrailers) 
	{
		super(title, artist, playingTime, numPlays, supportingActors, director, numActors, rating);
		this.trailers = trailers;
		this.numTrailers = numTrailers;
	}
	//play media
	public void playMedia()
	{
		super.playMedia();
	}
	//toString
	public String toString()
	{
		String result = "";
		result += "Trailers: ";
		for(int i = 0; i < trailers.length; i++)
		{
			result += "\n" + trailers[i];
		}
		result += "Number of Trailers: " + numTrailers;
		return result;
	}

}
