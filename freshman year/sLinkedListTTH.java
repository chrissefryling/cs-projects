public class sLinkedListTTH<S> implements MyLinkedList<S> {

	private class Node<S> {
		S item;
		Node<S> next;

		// default constructor
		public Node(S newItem) {
			item = newItem;
			next = null;
		}

		// non-default constructor
		public Node(S newItem, Node<S> nextNode) {
			item = newItem;
			next = nextNode;
		}
	}// end class node

	// here is the definition of the linked list class

	private Node<S> head; // link to first node in list
	private int currentSize; // represent # of values in list

	public sLinkedListTTH() {
		currentSize = 0;
		head = null;
	}// end constructor

	/**
	 * This method returns true if the current size of the list is zero.
	 *
	 * @author Camille Hayhurst
	 *
	 */
	public boolean isEmpty() {
		return (this.currentSize == 0);
	}// end isEmpty

	/**
	 * This method returns the current number of elements in the list.
	 *
	 * @author Camille Hayhurst
	 *
	 */
	public int size() {
		return this.currentSize;
	}// end size

	/**
	 * This method deletes all of the list's contents.
	 *
	 * @author Camille Hayhurst
	 *
	 */
	public void clear() {
		this.head = null;
		this.currentSize = 0;
	}// end clear

	/*
	 * This method inserts the value at the given position.
	 *
	 * @author Camille Hayhurst
	 * 
	 * @param position location where new value is to be inserted,
	 * 0<=position<=current size
	 * 
	 * @param value new value to be added to the list
	 *
	 */
	public void add(int position, S value) {
		
	}// end add

	/**
	 * This method inserts the value at the end of the list.
	 *
	 * @author Camille Hayhurst
	 * @param value
	 *            new value to be added to the list
	 *
	 */
	public void add(S value) {
	}

	/**
	 * This method removes and RETURNS the value at the location indicated by
	 * position.
	 *
	 * @author Camille Hayhurst
	 * @param position
	 *            location of value to remove from the list 0<=position<current size
	 * @return "element" at position is returned
	 *
	 */
	public S remove(int position) {
		S temp = null;

		return temp;
	}// end remove

	/**
	 * This method returns the value at a specific position in the list.
	 *
	 * @author Camille Hayhurst
	 * @param position:
	 *            location of element to return 0<=position<current size
	 *
	 */
	public S get(int position) {
		S temp = null;
		if (position < 0 || position >= this.currentSize) {
			throw new ListException("Invalid position given to get");
		}

		Node<S> current = head;
		for (int i = 0; i <= position; i++) {
			
		}

		return temp;
	}// end get

	/**
	 * This method searches the list for the specified value and returns the index
	 * number of the first element containing the value or -1 if the value is not
	 * found.
	 *
	 * @author Camille Hayhurst
	 * @param value:
	 *            the search value
	 * @return index of element containing value or -1
	 *
	 */
	public int find(S value) {
		int returnValue = -1;
		return returnValue;
	}
} // end sLinkedList