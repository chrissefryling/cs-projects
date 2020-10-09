public class CD extends Audio
{
	//fields
	private String[] tracks;
	private int numTracks;
	//constructor
	public CD(String title, String artist, double playingTime, int numPlays, int numMembers, String[] groupMembers, String producer, int numTracks, String[] tracks) 
	{
		super(title, artist, playingTime, numPlays, numMembers, groupMembers, producer);
		this.numTracks = numTracks;
		this.tracks = tracks;
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
		for(int i = 0; i < tracks.length; i++)
		{
			result += tracks[i] + "\n";
		}
		result += "\nNumber of tracks: " + numTracks;
		return result;
	}

}