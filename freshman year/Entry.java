/**
 * This class creates an entry of a word. It keeps track of what the word is,
 * how many times it appears in the file, it can also compare word entries and
 * see if they are equal to one another.
 * 
 * @author Christine Fryling
 * @version November 5 2017
 */

package project3;

public class Entry implements Comparable<Entry> {

	private String word;
	private int numberOfOccurences;

	/*
	 * This is the constructor method for entry it creates a new word entry
	 * 
	 * @param aWord
	 * 
	 * @return
	 */
	public Entry(String aWord) {
		this.word = aWord;
		numberOfOccurences = 1;
	}

	/*
	 * This is a getter method for word
	 * 
	 * @param
	 * 
	 * @return word
	 */
	public String getWord() {
		return word;
	}

	/*
	 * This is a getter method for numberOfOccurences
	 * 
	 * @param
	 * 
	 * @return numberOfOccurences
	 */
	public int getNumber() {
		return numberOfOccurences;
	}

	/*
	 * This method increases the numberOfOccurences each time the word reappears in
	 * the file
	 * 
	 * @param
	 * 
	 * @return
	 */
	public void incrementNumber() {
		numberOfOccurences = numberOfOccurences + 1;
	}

	/*
	 * This method is an equals method, comparing if two entries are the same
	 * 
	 * @param Entry b
	 * 
	 * @return true or false
	 */
	public boolean equals(Entry b) {
		return b.word.equals(this.word);
	}

	/*
	 * This method compares two entries on their position in the alphabet
	 * 
	 * @param Entry b
	 * 
	 * @return 0,1,-1
	 * 
	 * @overrides compareTo (java.lang)
	 */
	@Override
	public int compareTo(Entry b) {
		return b.word.compareTo(this.word);
	}

	public String toString() {
		return "Word: " + word + " Freq: " + numberOfOccurences;
	}

}
