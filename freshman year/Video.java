public abstract class Video extends Media
{
	private Artist support[];
	private int numActors;
	private Artist director;
	private double rating;

	public Video(String title, Artist artist, double playingTime, int numPlays, Artist[] s, int num, Artist d, double rate) 
	{
		super(title, artist, playingTime, numPlays);
		support = s;
		numActors = num;
		director = d;
		rating = rate;
	}

	public void playMedia()
	{
		super.playMedia();
	}
	
	public double getRate()
	{
		return rating;
	}
	
	public String toString()
	{
		String r = "";
		r+= "Actors: ";
		for(int i = 0; i < numActors; i++)
		{
			r += support[i] + " ";
		}
		r+= "\nNumber of Actors: " + numActors;
		r+= "\nDirector: " + director;
		r+= "\nRating: " + rating;
		return r;
	}

}
