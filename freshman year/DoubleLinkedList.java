import java.lang.*;
import java.util.*;

/**
 * @author Christine Fryling
 * @version nov 29 
 
 */
public class DoubleLinkedList<T extends Comparable>
{
	/**
	 * node class
	 *
	 */
    //node class
    private class Node
    {
        //FIELDS
        public T data;
        public Node prev;
        public Node next;
        //constructor
        public Node()
        {
        	data = null;
        }
        //constructor
        public Node(T d)
        {
            data = d;
        }
        //constructor
        public Node(T d, Node pref, Node nref)
        {
            this(d);
            prev = pref;
            next = nref;
        }
    }
    
    //FIELDS
    private Node head;
    private Node current;
    private int size;

    /**
     * Constructor for DoubleLinkedList
     * @param 
     * @return 
     */
    public DoubleLinkedList()
    {
        head = new Node(null);
        current = head;
        size = 0;
    }
    /**
     * Constructor for DoubleLinkedList
     * @param l
     * @return 
     */
    public DoubleLinkedList(DoubleLinkedList<T> l)
    {
       this.DoubleLinkedList = l;
    }
    /**
     * insert's the new value into its proper ordered position in the list 
     * @param d
     * @return 
     */
    public void insert(T d)
    {
        Node current = head;
        while(current.next.data.compareTo(d) < 0)
        {
            current = current.next;
        }
        Node node = new Node(d, current, current.next);
        size++;
    }
    /**
     * removes an existing value from the list
     * @param d
     * @throws ListEmptyException
     * @throws NotInListException
     * @return 
     */
    public void remove(T d) throws ListEmptyException, NotInListException
    {
        if(size != 0)
        {
            Node current = head.next;
            while(current != head)
            {
                if(current.data.compareTo(d) == 0)
                {
                    size--;
                    return;
                }
                else if(current.data.compareTo(d) > 0)
                {
                    throw new NotInListException(d.toString() + " is not in the list.");
                }
                current = current.next;
            }
        }
        else
        {
        	throw new ListEmptyException("List is empty.");
        }
    }
    /**
     * positions the list at the beginning of the list 
     * @param
     * @return
     */
    public void begin()
    {
        current = head.next;
    }
    /**
     * advances to the next element in the list 
     * @param
     * @return
     */
    public void advance()
    {
        current = current.next;
        if(current == head)
        {
            current = current.next;
        }
    }
    /**
     * retreats to the previous item in the list 
     * @param
     * @return
     */
    public void retreat()
    {
        this.current = current.prev;
        if(current == head)
        {
            current = current.prev;
        }
    }
    /**
     * returns the value at the current point of the list 
     * @param
     * @return current
     * @throws ListEmptyException
     */
    public T current() throws ListEmptyException
    {
        if(size != 0)
        {
            if(current == head)
            {
                current = current.next;
            }
            return current.data;
        }
        else
        {
        	throw new ListEmptyException("The list is empty."); 
        }
    }
    /**
     * determines if we are at the end of the list
     * @param
     * @return true or false
     */
    public boolean end()
    {
        return current == head.prev;
    }
    /**
     * determines if empty 
     * @param
     * @return true or false
     */
    public boolean isEmpty()
    {
        if(head == null)
        {
        	return true;
        }
        else
        	return false;
    }
    /**
     * returns the number of elements in the list
     * @param
     * @return size
     */
    public int size()
    {
        return size;
    }
    
}

