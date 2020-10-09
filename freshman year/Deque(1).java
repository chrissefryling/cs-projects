import java.util.*;

public class Deque<T> implements List<T>
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

        public Node(T data, Node<T> n) {
            item = data;
            next = n;
        }
    }
    
    private Node<T> head;
    private Node<T> tail;
    private int nrItems;
    private LinkedList<T> theDeque;

    public Deque()
    {
        nrItems = 0;
        head = null;
        tail = null;
    }

    public void addFirst(T item)
    {
        Node<T> newNode = new Node<T>(item);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        nrItems++;
    }

    public T removeFirst() throws EmptyDequeException
    {
        if(head == null)
        {
            throw new EmptyDequeException();
        }
        T result = head.next.item;
        if(head == tail){
            head = null;
            tail = null;
        }else {
            head.next = head.next.next;
        }
        nrItems--;
        return result;
    }

    public T getFirst() throws EmptyDequeException
    {
        if(head == null)
        {
            throw new EmptyDequeException();
        }else{
            return head.item;
        }
    }

    public void addLast(T item){
        Node<T> newNode = new Node<T>(item);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }else if(head == tail){
            tail = new Node<T>(item);
            head.next = tail;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        nrItems++;
    }

    public T removeLast() throws EmptyDequeException
    {
        if(tail == null)
        {
            throw new EmptyDequeException();
        }else{
            Node<T> current;
            for(current = head; current.next != null && current.next != tail; current = current.next);
            T result = tail.item;
            tail = current;
            current.next = null;
            nrItems--;
            return result;
        }
    }

    public T getLast() throws EmptyDequeException
    {
        if(tail == null)
        {
            throw new EmptyDequeException();
        }else
        {
            return tail.item;
        }
    }

    public int size(){
        return nrItems;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public String toString()
    {
    	String s = "";
        for(Node<T> current = head; current.next != null && current.next != tail; current = current.next)
        {
                s += current.item.toString();
                s += ", ";
        }
        return s;
    }

    public void clear()
    {
        head = null;
        tail = null;
    }

}

