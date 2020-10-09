
/**
 * This class creates a dictionary, a collection of entries from the file.
 * It can insert new words into the collection, get the top 10 most used words,
 * and print the dictionary.
 * @author Christine Fryling
 * @version November 5 2017
 */

package project3;

import java.util.*;

public class Dictionary {

	private ArrayList<LinkedList<Entry>> wordList;
	private int total;

	/*
	 * Constructor method
	 * 
	 * @param
	 * 
	 * @return
	 */
	public Dictionary() {
		total = 0;
		wordList = new ArrayList<LinkedList<Entry>>(26);
		for (int i = 0; i < 26; i++) {
			wordList.add(new LinkedList<Entry>());
		}

	}

	/*
	 * This method insets a word into the dictionary
	 * 
	 * @param word
	 * 
	 * @return
	 */
	public void insert(String word) {
		// Find which char the word belongs to
		int alpha = word.charAt(0) - 97;
		LinkedList<Entry> list = wordList.get(alpha);
		int index = 0;
		boolean added = false;

		// If there are no words in the entry
		if (total == 0) {
			list.add(new Entry(word));
			added = true;
		}

		// Create a new entry and compare entries
		for (int i = 0; i < list.size() && added != true; i++) {
			if (word.equals(list.get(i).getWord())) {
				list.get(i).incrementNumber();
				added = true;
			} else if (list.get(i).compareTo(new Entry(word)) > 0) {
				if (i == list.size() - 1) {
					list.addLast(new Entry(word));
					added = true;
				}
				index = i;
			}
		}

		// If the entry has not been added
		if (added == false) {
			list.add(index, new Entry(word));
		}

		// Increase total
		total++;
	}

	/*
	 * This method returns a string array of the top words, however many words the
	 * user wants (num)
	 * 
	 * @param num
	 * 
	 * @return topWords
	 */
	public String[] getTopWords(int num) {

		// Set topWords to null
		Entry[] topWords = new Entry[num];
		int index = 0;
		for (int z = 0; z < num; z++) {
			topWords[z] = new Entry(null);
		}

		// Enter the words
		for (int i = 0; i < wordList.size(); i++) {
			for (int j = 0; j < wordList.get(i).size(); j++) {
				LinkedList<Entry> l = wordList.get(i);
				int count = 0;

				// if its inserting in the front
				if (topWords[0].getNumber() < l.get(j).getNumber()) {
					index = 0;
				}

				// if its not inserting in the front
				else {
					while (count < num && l.get(j).getNumber() < topWords[count].getNumber()) {
						index = ++count;
					}
				}

				// If its not out of bounds
				if (index != topWords.length) {
					for (int q = topWords.length - 1; q > index; q--) {
						topWords[q] = topWords[q - 1];
					}
					topWords[index] = l.get(j);
				}

			}
		}

		// Turn it into a string
		String[] topWords1 = new String[num];
		for (int i = 0; i < num; i++) {
			topWords1[i] = topWords[i].toString();
		}

		return topWords1;
	}

	/*
	 * This method prints the dictionary for the user
	 * 
	 * @param
	 * 
	 * @return
	 */
	public void printDictionary() {
		for (int i = 0; i < wordList.size(); i++) {
			LinkedList<Entry> l = wordList.get(i);
			for (int j = 0; j < l.size(); j++) {
				System.out.print(l.get(j).toString() + " ");
			}
			System.out.println("");
		}
	}

}
