import java.util.*;

public class Deque<T> 
{
    public class Node<T> 
    {
        private T item;
        private Node<T> next;

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
    
    private Node<T> head;
    private Node<T> tail;
    private int nrItems;

    public static void main(String[] args)
    {
        Deque d = new Deque();
        int c = 0;
        Scanner sc = new Scanner(System.in);
        
        Random rand = new Random();
        for (int i = 0; i < 20; i++) 
        {
            int r = rand.nextInt(100);
            d.addFirst(r);
        }
        
        System.out.println("Original Deque:");
        System.out.println(d);
        
        do{
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
	        c = sc.nextInt();
	        if (c == 1) 
	        {
	            System.out.println("What would you like to add?");
	            //int add = sc.nextInt();
	            //d.addFirst(add); 
	           // System.out.println(d);
	        } 
	        else if (c == 2) 
	        {
	            System.out.println("What would you like to add?");
	            //int add = sc.nextInt();
	            //d.addLast(add);
	            //System.out.println(d);
	        } 
	        else if (c == 3) 
	        {
	        	d.removeFirst();
	        	System.out.println(d);
	        } 
	        else if (c == 4) 
	        {
	        	d.removeLast();
	        	System.out.println(d);
	        } 
	        else if (c == 5) 
	        {
	        	System.out.println(d.getFirst());
	        } 
	        else if (c == 6) 
	        {
	        	System.out.println(d.getLast());
	        } 
	        else if (c == 7) 
	        {
	        	System.out.println(d);
	        } 
	        else if (c == 8) 
	        {
	        	d.clear();
	        	System.out.println(d);
	        }
        }while(c != 9);
        
        sc.close();
    }

    public Deque()
    {
        head = null;
        tail = null;
        nrItems = 0;
    }

    public void addFirst(T item)
    {
        Node<T> n = new Node<T>(item);
        if(isEmpty())
        {
            n.next = head;
            head = n;
        }
        else
        {
            head = n;
            tail = n;
        }
        nrItems++;
    }

    public T removeFirst()
    {
    	T removed = head.next.item;
        if(head == tail)
        {
            head = null;
            tail = null;
        }
        else 
        {
           head.next = head.next.next;
        }
        nrItems--;
        return removed;
    }

    public T getFirst()
    {
        return head.item;
    }

    public void addLast(T item)
    {
        Node<T> n = new Node<T>(item);
        
        if(tail == null)
        {
            head = n;
            tail = n;
        }
        else if(head == tail)
        {
            tail = new Node<T>(item);
            head.next = tail;
        }
        else
        {
            tail.next = n;
            tail = n;
        }
        nrItems++;
    }

    public T removeLast()
    {
    	T removed = null;
        for(Node<T> n = head; n.next != tail; n = n.next)
        {
            removed = tail.item;
            tail = n;
            n.next = null;
            nrItems--;
        }
            return removed;
    }

    public T getLast()
    {
       return tail.item;
    }

    public int size()
    {
        return nrItems;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

   public String toString()
   {
	   String s = "";
		for(Node<T> n = head; n.next != tail; n = n.next)
           {
				s += n.item;
				s += " ";
           }
		return s;
   }

    public void clear()
    {
    	head = null;
    	tail = null;
    }

}

