import java.util.*;

/**
 * @author Christine Fryling
 * This class is a linked list.
 */
public class DoublyLinkedList<T extends Comparable> 
{

    private class Node<T>
    {
        //FIELDS
        public T data;
        public Node<T> prev;
        public Node<T> next;
        //constructor
        public Node()
        {
        	data = null;
        	prev = null;
        	next = null;
        }
        //constructor
        public Node(T d)
        {
            data = d;
        }
        //constructor
        public Node(T d, Node<T> p, Node<T> n)
        {
            this(d);
            prev = p;
            next = n;
        }
    }
    
    //FIELDS
    private Node<T> head;
    private Node<T> current;
    private int size;


    /**
     * Constructor for DoubleLinkedList
     * @param 
     * @return 
     */
    public DoublyLinkedList()
    {
        head = new Node<T>(null);
        current = head;
        size = 0;
    }
    /**
     * Constructor for DoubleLinkedList
     * @param l
     * @return 
     */
    public DoublyLinkedList(DoublyLinkedList<T> l)
    {
       DoublyLinkedList list = l;
    }
    /**
     * insert's the new value into its proper ordered position in the list 
     * @param d
     * @return 
     */
    public void insert(T d)
    {
        Node<T> current = head;
        while(current.next.data.compareTo(d) < 0)
        {
            current = current.next;
        }
        Node<T> node = new Node<T>(d, current, current.next);
        size++;
    }
    /**
     * removes an existing value from the list
     * @param d
     * @throws ListEmptyException
     * @throws NotInListException
     * @return 
     */
    public void remove(T d) throws NotInListException, ListEmptyException
    {
        if(size != 0)
        {
            Node<T> current = head.next;
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
       return head == null;
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
    /**
     * to String method. returns textual object
     * @param
     * @return s - the string
     */
    public String toString()
    {
    	String s = "";
    	Node<T> current = head;
    	
        while(current.next != null)
        {
            current = current.next;
            s += current.data;
        }
    	return s;
    }
   
}

