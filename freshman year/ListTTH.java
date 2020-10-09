public class ListTTH<S> implements MyList<S> {
	// data members go here
	private int maxSize;
	private int currentSize;
	// need an array for storage
	Object[] elements;

	public ListTTH() {
		maxSize = 10;
		currentSize = 0;
		elements = new Object[maxSize];
	}

	public ListTTH(int max) {
		maxSize = max;
		currentSize = 0;
		elements = new Object[maxSize];
	}

	/**
	 * This method returns true if the current size of the list is zero.
	 *
	 * @author Camille Hayhurst
	 *
	 */
	public boolean isEmpty() {
		return (this.currentSize == 0);
	}

	/**
	 * This method returns true if the current size of the list equals the maximum
	 * size of the list.
	 *
	 * @author Camille Hayhurst
	 *
	 */
	public boolean isFull() {
		return (this.currentSize == this.maxSize);
	}

	/**
	 * This method returns the maximum number of elements the list can hold.
	 *
	 * @author Camille Hayhurst
	 *
	 */
	public int getMaxSize() {
		return this.maxSize;
	}

	/**
	 * This method returns the current number of elements in the list.
	 *
	 * @author Camille Hayhurst
	 *
	 */
	public int size() {
		return currentSize;
	}

	public void add(int position, S value) {
		// Precondition: 0<= position <= current # of elements
		// Precondition: list is not full.

		if (position < 0 || position > currentSize)
			throw new ListException(" Insert cancelled, Invalid position given");
		else {
			if (this.isFull())
				throw new ListException("Insert Cancelled, " + "List is full.");
			else {
				// this will also work for adding the first element
				// to an empty list
				if (position == currentSize)
					this.elements[position] = value;
				else {
					// shift elements to the left to make room for newValue.
					for (int i = currentSize - 1; i >= position; i--)
						this.elements[i + 1] = this.elements[i];

					this.elements[position] = value;
				} // adding in middle
			} // else adding at end

			currentSize++;
		} // valid position and list not full

	} // end insert

	/**
	 * This method adds a new value to the end of a list.
	 *
	 * @author Camille Hayhurst
	 * @param value
	 *            new value to be added to the list
	 *
	 */
	public void add(S value) {
		this.add(this.currentSize, value);
	}// end add

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
		// check that position is valid
		if (position < 0 || position >= this.currentSize)
			throw new ListException("invalid position in get");
		else {

			temp = (S) this.elements[position];
		}
		return temp;
	}// end get

	public S remove(int position) {
		// Precondition: The is list not empty.
		// Precondition: 0<= position <= current size-1 of list
		S tempValue;

		if (this.isEmpty() || position > currentSize - 1 || position < 0)
			throw new ListException(
					"This delete can not be performed " + "an element at position " + position + " does not exist ");

		// Store the value in the list to be deleted
		// NOTE: it must be cast to type S
		tempValue = (S) this.elements[position];

		// Shift existing elements down one position
		// The logical position, is translated to the physical location of
		// position -1
		for (int i = position; i < currentSize - 1; i++)
			this.elements[i] = this.elements[i + 1];

		// Reinitialize the �old� end element to null, and decrement element count
		this.elements[currentSize - 1] = null;
		currentSize--;

		return tempValue;
	} // end delete

	/**
	 * This method deletes all of the list's contents.
	 *
	 * @author Camille Hayhurst
	 *
	 */
	public void clear() {
		for (int i = 0; i < this.currentSize; i++)
			this.elements[i] = null;

		this.currentSize = 0;
	}

	public int find(S value) {

		// initialize the return value to not found
		int location = -1;

		// Begin searching at the first element, to the last
		for (int i = 0; i <= this.currentSize - 1; i++) {
			if (this.elements[i].equals(value)) {
				location = i;
				break; // if found exit loop
			}
		} // end for

		return location;
	}// end find

	/*
	 * This method begins the search for a value at a specific location.
	 * 
	 * @param value, location
	 * 
	 * @return found
	 */
	public int find(S value, int location) {
		int found = -1;

		for (int i = location; i < this.currentSize - 1; i++) {
			if (this.elements[i].equals(value)) {
				found = 1;
				break;
			}
		}
		return found;
	}

	/*
	 * This method removes all of the elements from a sub list.
	 * 
	 * @param list
	 * 
	 * @return numRemoved
	 */
	public int removeAll(MyList<? extends S> list) {
		int numRemoved = 0;

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < this.currentSize - 1; j++) {
				if (this.elements[j].equals(list.get(i))) {
					this.elements[j + 1] = this.elements[j];
					this.elements[j] = null;
					this.currentSize--;
				}
			}
		}

		return numRemoved;
	}

}// end listTTH