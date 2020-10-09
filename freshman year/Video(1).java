public abstract class Video extends Media 
{
	//fields
	private String[] supportingActors;
	private String director;
	private int numActors;
	private double rating;
	//constructor
	public Video(String title, String artist, double playingTime, int numPlays, String[] supportingActors, String director, int numActors, double rating)
	{
		super(title, artist, playingTime, numPlays);
		this.supportingActors = supportingActors;
		this.director = director;
		this.numActors = numActors;
		this.rating = rating;
	}
	//play media
	public void playMedia()
	{
		System.out.println(title + " - " + playingTime + "\nStars: " + rating);
	}
	//toString method
	public String toString()
	{
		String result = "";
		result += "Supporting Actors: ";
		for(int i = 0;  i < supportingActors.length; i++ )
		{
			result += "\n" + supportingActors[i];
		}
		result += "Director: " + director + " Number of Actors: " + numActors + " Rating:" + rating;
		return result;
	}
}
