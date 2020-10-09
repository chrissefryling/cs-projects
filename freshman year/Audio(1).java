public abstract class Audio extends Media 
{
	//fields
	private String[] groupMembers;
	private int numMembers;
	private String producer;
	//constructor
	public Audio(String title, String artist, double playingTime, int numPlays, int numMembers, String[] groupMembers, String producer) 
	{
		super(title, artist, playingTime, numPlays);
		this.groupMembers = groupMembers;
		this.producer = producer;
		this.numMembers = numMembers;
	}
	//play media
	public void playMedia()
	{
		System.out.println(title + " - " + playingTime);
	}
	//toString method
	public String toString()
	{
		String result = "";
		for(int i = 0; i < groupMembers.length; i++)
		{
			result += groupMembers[i] + "\n";
		}
		result += "\nProducer: " + producer;
		result += "\nNumber of Members: " + numMembers;
		
		return result;
	}
}
