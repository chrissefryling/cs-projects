public class DVD extends Video 
{
	
	private String[] specialFeatures;
	private int numFeatures;
	private String wideScreenFormat;
	private String TVFormat;
	private String[] soundOptions;
	private int numSoundOptions;
	
	public DVD(String[] sf, int n, String w, String TV, String[] sound, int ns, String title, Artist artist, double playingTime, int numPlays, Artist[] s, int num, Artist d, double rate) 
	{
		super(title, artist, playingTime, numPlays, s, num, d, rate);
		specialFeatures = sf;
		numFeatures = n;
		wideScreenFormat = w;
		TVFormat = TV;
		soundOptions = sound;
		numSoundOptions = ns;
	}
	
	public void playMedia()
	{
		super.playMedia();
	}
	
	public String toString()
	{
		String r = "";
		r += "Special Features: ";
		for(int i = 0; i < specialFeatures.length; i++)
		{
			r += "\n" + specialFeatures[i];
		}
		r += "\nSound Options: ";
		for(int z = 0; z < soundOptions.length; z++)
		{
			r += "\n" + soundOptions[z];
		}
		r += "Number of features: " + numFeatures + "\nWideScreen: " + wideScreenFormat + "\nTV Format: " + TVFormat + "\nNumber of Sound Options: " + numSoundOptions;
		return r;		
	}
}
