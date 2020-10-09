import java.util.*;

public class LinkedList<E> implements List<E> 
{
	public Node<E> head;
	public Node<E> tail;
	public int size;
	
	public class Node<E>
	{
		private E element;
        private Node<E> next;

        public Node(E element)
        {
        	this.element = element;
        	next = null;
        }
        
        public Node(E element, Node<E> next) 
        {
            this.element = element;
            this.next = next;
        }
        
        public Node<E> getNext()
        {
        	return next;
        }
        
        public E getElement()
        {
        	return element;
        }
        
        public void setNext(Node<E> next)
		{
			this.next = next;
		}
        
        public void setElement(E element)
        {
        	this.element = element;
        }
	}
	
	public LinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean add(E e)
	{
		Node<E> n = new Node<E>(e);
		if(head == null)
		{
			n = head;
		}
		else
		{
			n = head.getNext();
		}
		
		return true;
	}
	
	public void add(int index, E element)
	{
		Node<E> n = new Node<E>(element);
		
	}
	
	public void clear()
	{
		head = null;
	}
	
	public boolean contains(Object o)
	{
		for(int i = 0; i < size; i++)
		{
			if(head == o)
			{
				return true;
			}
			else
			{
				head = head.getNext();
			}
		}
		return false;
	}
	
	public E get(int index)
	{
		Node<E> n = head;
		
		for(int i = 0; i < index; i++)
		{
			n = n.getNext();
		}
		
		E item = n.getElement();
		return item;
	}
	
	public int indexOf(Object o)
	{
		int index = 0;
		for(Node<E> i = head; i != null; i = head.getNext())
		{
			if(i == o)
			{
				return index;
			}
			else
			{
				index++;
			}
		}
		return index;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public E remove(int index)
	{
		Node<E> n = head;
		
		for(int i = 0; i < index; i++)
		{
			n = n.getNext();
		}
		
		n = n.getNext();
		size--;
		E item = n.getElement();
		return item;
	}
	
	public int size()
	{
		return size;
	}
	
}
