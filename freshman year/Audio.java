public abstract class Audio extends Media
{
	private Artist group[];
	private int numMembers;
	private Artist producer;
	
	
	public Audio(String title, Artist artist, double playingTime, int numPlays, Artist g[], int num, Artist pro)
	{
		super(title, artist, playingTime, numPlays);
		group = g;
		numMembers = num;
		producer = pro;
	}
	
	public void PlayMedia()
	{
		super.playMedia();
	}
	
	public String toString()
	{
		String r = "";
		r += "Group Members: ";
		for(int i = 0; i < numMembers; i++)
		{
			r += group[i] + " ";
		}
		r+= "\nNumber of Members: " + numMembers;
		r+= "\nProducer: " + producer;
		
		return r;
	}

}
