import java.util.*;


public class LinkedList<E> implements List<E>
{
	private int size;
	private int nrItems;
	private E[] list = (E[]) new Object[size];
	
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList(10);
		l.add("3");
		l.add("4");
		System.out.println(l.toString());
		l.remove(0);
		System.out.println(l.toString());
	}
	public LinkedList()
	{
		size = 0;
		list = (E[]) new Object[size];
		nrItems = 0;
	}
	
	public LinkedList(int size)
	{
		this.size = size;
		list = (E[]) new Object[size];
		nrItems = 0;
	}
	
	public String toString()
	{
		String s = "";
		for(int i = 0; i < nrItems; i++)
		{
			s += list[i] + " ";
		}
		return s;
	}
	
	public boolean add(E e)
	{
		list[nrItems] = e;
		nrItems++;
		return list[nrItems - 1] == e;
	}
	
	public void add(int index, E element)
	{
		list[index] = element;
		nrItems++;
	}
	
	public void clear()
	{
		for(int i = 0; i < size; i++)
		{
			list[i] = null;
		}
	}
	
	public boolean contains(Object o)
	{
		for(int i = 0; i < size; i++)
		{
			if(list[i].equals(o))
			{
				return true;
			}
		}
		return false;
	}
	
	public E get(int index)
	{
		return list[index];
	}
	
	public int indexOf(Object o)
	{
		int temp = -1;
		for(int i = 0; i < size; i++)
		{
			if(list[i].equals(o))
			{
				i = temp;
				return temp;
			}
		}
		if(temp == -1)
		{
			System.out.println("Object " + o + " does not exist.");
		}
		return temp;
	}
	
	public boolean isEmpty()
	{
		return list[0] == null;
	}
	
	public E remove(int index)
	{
		E re = null;
		if(list[index] == null)
		{
			return null;
		}
		else
		{
			list[index] = re;
			list[index] = null;
			for(int i = index; i < nrItems; i++)
			{
				list[i] = list[i + 1];
			}
			nrItems--;
		}
		
		return re;
	}
	
	public int size()
	{
		return nrItems;
	}
}
