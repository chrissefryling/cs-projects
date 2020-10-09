/**
 * @author Christine Fryling
 * @version 1
 * 
 */
public abstract class Media
{
	//fields
	private String title;
	private String majorArtist;
	private double playingTime;
	private int numPlays;
    /**
     *Crates a new media with the following parameters
     * @param title
     * @param artist
     * @param playingTime
     * @param numPlays
     * @return  
     */
public Media(String title, String artist, double playingTime, int numPlays)
{
	this.title = title;
	this.majorArtist = artist;
	this.playingTime = playingTime;
	this.numPlays = numPlays;
}
/**
 * counts the number of plays
 * @param
 * @return 
 */
public void playMedia()
{
numPlays++;
}
    /**
     * gets the number of plays
     * @param
     * @return numPlays
     */
public int getNumberPlays()
{
	return numPlays;
}
    /**
     * gets the playing time
     * @param 
     * @return playingTime
     */
public double getPlayingTime()
{
	return playingTime;
}
    /**
     * toString method, overrides originial toString method
     * @param
     * @return media info
     */
public String toString()
{
	return "Title: " + title + " Major Artist: " + majorArtist + " Playing Time: " + playingTime + " Number of Plays: " + numPlays;
}
}