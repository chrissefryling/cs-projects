public class Cassette extends Audio 
{
	//fields
	private String[] songs;
	private int numSongs;
	//constructor
	public Cassette(String title, String artist, double playingTime, int numPlays, int numMembers, String[] groupMembers, String producer, int numSongs, String[] songs)
	{
		super(title, artist, playingTime, numPlays, numMembers, groupMembers, producer);
		this.numSongs = numSongs;
		this.songs = songs; 
	}
	//play media
	public void playMedia()
	{
		super.playMedia();
	}
	//toString method
	public String toString()
	{
		String result = "";
		for(int i = 0; i < songs.length; i++)
		{
			result += songs[i] + "\n";
		}
		result += "\nNumber of songs: " + numSongs;
		return result;
	}

}
