public class DVD extends Video 
{
	//fields
	private String[] specialFeatures;
	private int numFeatures;
	private String wideScreenFormat;
	private String TVFormat;
	private String[] soundOptions;
	private int numSoundOptions;
	//constructor
	public DVD(String title, String artist, double playingTime, int numPlays, String[] supportingActors, String director, int numActors, int rating, String[] specialFeatures, int numFeatures, String wideScreenFormat, String TVFormat, String[] soundOptions, int numSoundOptions) 
	{
		super(title, artist, playingTime, numPlays, supportingActors, director, numActors, rating);
		this.specialFeatures = specialFeatures;
		this.numFeatures = numFeatures;
		this.wideScreenFormat = wideScreenFormat;
		this.TVFormat = TVFormat;
		this.soundOptions = soundOptions;
		this.numSoundOptions = numSoundOptions;
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
		result += "Special Features: ";
		for(int i = 0; i < specialFeatures.length; i++)
		{
			result += "\n" + specialFeatures[i];
		}
		result += "\nSound Options: ";
		for(int z = 0; z < soundOptions.length; z++)
		{
			result += "\n" + soundOptions[z];
		}
		result += "Number of features: " + numFeatures + "\nWideScreen: " + wideScreenFormat + "\nTV Format: " + TVFormat + "\nNumber of Sound Options: " + numSoundOptions;
		return result;		
	}
}
