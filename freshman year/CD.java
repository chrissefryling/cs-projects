public class CD extends Audio
{
	private Audio tracks[];
	private int numTracks;
	
	public CD(String title, Artist artist, double playingTime, int numPlays, int numMembers, Artist[] groupMembers, Artist producer,Audio t[], int num)
	{
		super(title, artist, playingTime, numPlays, groupMembers, numMembers, producer);
		tracks = t;
		numTracks = num;
	}
	
	public void playMedia()
	{
		super.playMedia();
	}
	
	public String toString()
	{
		String r = "";
		r += "Songs: ";
		for(int i = 0; i < numTracks; i++)
		{
			r+= tracks[i] + "\n";
		}
		r+= "Number of songs: " + numTracks;
		r+= super.toString();
		return r;
	}

}
