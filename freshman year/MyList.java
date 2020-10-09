public interface MyList<S>{

/**
*  This method returns true if the current
*  size of the list is zero.
*
*  @author  Camille Hayhurst
*
*/
   public boolean isEmpty();
   
/**
*  This method returns true if the current
*  size of the list equals the maximum size 
*  of the list.
*
*  @author  Camille Hayhurst
*
*/
   public boolean isFull();

/**
*  This method returns the maximum number
*  of elements the list can hold.
*
*  @author  Camille Hayhurst
*
*/   
   public int getMaxSize();

/**
*  This method returns the current number
*  of elements in the list.
*
*  @author  Camille Hayhurst
*
*/   
   public int size();

/**
*  This method searches the list for the
*  specified value and returns the index
*  number of the first element containing
*  the value or -1 if the value is
*  not found.
*
*  @author  Camille Hayhurst
*  @param   value:  the search value
*  @return  index of element containing value or -1
*
*/   
  public int find( S value);

/**
*  This method returns the value at a specific
*  position in the list.  
*
*  @author  Camille Hayhurst
*  @param   position: location of element to return 0<=position<current size
*
*/   
   public S get( int position);

/**
*  This method inserts the value at the given position.
*
*  @author  Camille Hayhurst
*  @param   position location where new value is to be inserted, 0<=position<=current size
*  @param   value new value to be added to the list
*
*/   
   public void add( int position, S value);

/**
*  This method adds a new value to the end of a list.
*
*  @author  Camille Hayhurst
*  @param   value new value to be added to the list
*
*/   
   public void add( S value);
   
/**
*  This method removes and RETURNS the value at the location
*  indicated by position.
*
*  @author  Camille Hayhurst
*  @param   position location of value to remove from the list 0<=position<current size
*  @return  "element" at position is returned
*
*/   
    public S remove(int position); 

   
/**
 * This method removes all elements in the list argument from the list
 * 
 * @autohr:  Camille Hayhurst
 * 
 * 
 * */
  // public boolean removeAll(MyList<? extends S> list);
 
/**
*  This method deletes all of the list's contents.
*
*  @author  Camille Hayhurst
*
*/  
  public void clear();
}