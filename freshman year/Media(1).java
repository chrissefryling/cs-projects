public abstract class Media 
{
	//fields
	private String title;
	private String majorArtist;
	private double playingTime;
	private int numPlays;
	//play media
	public Media(String title, String artist, double time, int plays)
	{
		this.title = title;
		majorArtist = artist;
		playingTime = time;
		numPlays = plays;
	}
	public String playMedia()
	{
		String song = "";
		song = title + " - " + majorArtist + "\n" + playingTime;
		numPlays++;
		return song;
	}
	//get number of plays
	public int getNumberPlays()
	{
		return numPlays;
	}
	//get playing time
	public double getPlayingTime()
	{
		return playingTime;
	}
	//get major artist
	public String getMajorArtist()
	{
		return majorArtist;
	}
	//to string method
	public String toString()
	{
		String result = "";
		result = title + "\n" + majorArtist + "\n" + playingTime + "\n" 
				+ numPlays;
		return result;
	}
	
}
