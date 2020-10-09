import java.util.*;

public class Deque<T> 
{
	//NODE CLASS
	public class Node<T>
	{
		private T item;
		private Node next;
		
		public Node(T data)
		{
			item = data;
			next = null;
		}
		public Node(T data, Node<T> n)
		{
			item = data;
			next = n;
		}	
	}
	
	//MAIN CLASS
	private Node head;
	private Node tail;
	private int nrItems;
	LinkedList deque = new LinkedList();
	
	public static void main(String[] args)
	{
		Deque d = new Deque();
		//create object of deque and make it 20, 0-100
		Random rand = new Random();
	    for (int i = 0; i < 20; i++)
	    {
	      int randomInt = rand.nextInt(100);
	      d.deque.add(randomInt);
	    }
		System.out.println("Original Deque: " + d.deque);
		
		//user menu:
		System.out.println("User Menu:");
		System.out.println("1. Add at beginning.");
		System.out.println("2. Add at end.");
		System.out.println("3. Remove from beginning.");
		System.out.println("4. Remove from end.");
		System.out.println("5. Display beginning.");
		System.out.println("6. Display end.");
		System.out.println("7. Display deque.");
		System.out.println("8. Clear All.");
		System.out.println("9. Exit");
		Scanner input = new Scanner(System.in);
		int user = input.nextInt();
		
		//choices
		if(user == 1)
		{
			int added = 0;
			System.out.println("What would you like to add?");
		    added = input.nextInt();
			d.addFirst(added);
			
		}
		else if(user == 2)
		{
			int added = 0;
			System.out.println("What would you like to add?");
		    added = input.nextInt();
			d.addLast(added);
			
		}
		else if(user == 3)
		{
			d.removeFirst();
		}
		else if(user == 4)
		{
			d.removeLast();
		}
		else if(user == 5)
		{
			d.deque.getFirst();
		}
		else if(user == 6)
		{
			d.getLast();
		}
		else if(user == 7)
		{
			d.toString();
		}
		else if(user == 8)
		{
			d.clear();
		}
		else
		{
			System.out.println("Goodbye!");
		}
		
	}
	
	//DEQUE METHODS
	public Deque()
	{
		//create empty deque
		LinkedList deque = new LinkedList();
	}
	public void addFirst(T item)
	{
		//adds the head
		deque.addFirst(item);
	}
	public void removeFirst()
	{
		//removes first item
		deque.removeFirst();
	}
	public void addLast(T item)
	{
		//adds tail
		deque.addLast(item);
	}
	public void removeLast()
	{
		//removes last item
		deque.removeLast();
	}
	public void getLast()
	{
		//returns element at tail
		deque.getLast();
	}
	public int size()
	{
		//returns size
		int size = deque.size();
		return size;
	}
	public boolean isEmpty()
	{
		//is the deque empty ?
		if(deque == null)
		{
			return true;
		}
		else
			return false;
	}
	public String toString()
	{
		//to string 
		String result = deque;
		return result;
	}
	public void clear()
	{
		//empties deque
		deque.clear();
	}
	
}
