/**
 * @author Christine Fryling
 * @version 1
 * This class keeps data on different things in the user's
 * library.
 */
public abstract class Media 
{
	private String title;
	private Artist majorArtist;
	private double playingTime;
	private int numPlays;
	/*
	 * This is the constructor method
	 * @param t - title
	 * @param m - majorArtist
	 * @param time - playingTime
	 * @param n - numPlays
	 */
	public Media(String t, Artist m, double time, int n)
	{
		title = t;
		majorArtist = m;
		playingTime = time;
		numPlays = n;
	}
	
	/*
	 * plays the media, depending on the type
	 * @param
	 * @return 
	 */
	public void playMedia()
	{
		System.out.println("Now Playing: ");
		System.out.println("\n" + playingTime);
		numPlays ++;
	}
	
	/**
	 * This method returns the title
	 * @param 
	 * @return title - the media title
	 */
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * This method returns the number of plays
	 * @param 
	 * @return numPlays - how many times the media has played
	 */
	public int getNumPlays()
	{
		return numPlays;
	}
	
	/**
	 * This method returns the playing time
	 * @param 
	 * @return playingTime - the playing time
	 */
	public double getPlayingTime()
	{
		return playingTime;
	}
	
	/**
	 * This method returns the majorArtist
	 * @param 
	 * @return majorArist - the artist
	 */
	public Artist getMajorArtist()
	{
		return majorArtist;
	}
	
	/*
	 * ToString method
	 * @overrides toString
	 * @param
	 * @return r - string result of media
	 */
	public String toString()
	{
		return title + "\nArtist: " + majorArtist + "\nPlaying Time: " + playingTime + "Number of Times Played: " + numPlays;	
	}

}
