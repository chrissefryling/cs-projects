import java.util.*;
//public class ListEmptyException 
//public class NotInListException 

public class DoublyLinkedListt<T extends Comparable> 
{
	private class Node
	 {
		private T data;
		private Node next;
		private Node prev;
		
		private Node (T d)
		{
		 
		}
		private Node (T d, Node pref, Node nref)
		{
		 
		}
	} 
	
	private Node head;
	private Node current;
	private int size;

	 public DoublyLinkedList()
	 {
		 
	 }
	 public DoublyLinkedList (DoublyLinkedList<T> l)
	 {
		 
	 }
	 //insert's the new value into its proper ordered position in the list
	 public void insert (T d)
	 {
		 
	 }
	 //removes an existing value from the list
	 public void remove (T d) throws ListEmptyException, NotInListException
	 {
		 
	 }
	 //positions the list at the beginning of the list
	 public void begin()
	 {
		 
	 }
	 //advances to the next element in the list
	 public void advance()
	 {
		 
	 }
	 //retreats to the previous item in the list
	 public void retreat()
	 {
		 
	 }
	 //returns the value at the current point of the list
	 public T current() throws ListEmptyException
	 {
		 
	 }
	 //determines if we are at the end of the list
	 public boolean end()
	 {
		 
	 }
	 //determines if empty
	 public boolean isEmpty()
	 {
		 
	 }
	 //returns the number of elements in the list
	 public int size()
	 {
		 
	 }
	 public String toString()
	 {
		 
	 }
}
