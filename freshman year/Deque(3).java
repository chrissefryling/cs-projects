import java.util.*;

public class Deque<T> {
    public class Node<T> {
        private T item;
        private Node<T> next;

        public Node(T data) {
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

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int randomInt = rand.nextInt(100);
            deque.addFirst(randomInt);
        }
        System.out.println("Original Deque:");
        System.out.println(deque);
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
        if (user == 1) {
            System.out.println("What would you like to add?");
            public void addFirst(T item){
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


        } else if (user == 2) {
            System.out.println("What would you like to add?");

        } else if (user == 3) {

        } else if (user == 4) {

        } else if (user == 5) {

        } else if (user == 6) {

        } else if (user == 7) {

        } else if (user == 8) {

        } else {
            System.out.println("Goodbye!");
        }

    }

    public Deque(){
        nrItems = 0;
        head = null;
        tail = null;
    }

    public void addFirst(T item){
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

    public T removeFirst(){
        if(head == null){
            return null;
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

    public T getFirst(){
        if(head == null){
            return null;
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

    public T removeLast(){
        if(tail == null){
            return null;
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

    public T getLast(){
        if(tail == null){
            return null;
        }else{
            return tail.item;
        }
    }

    public int size(){
        return nrItems;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public String toString(){
        if(head == null){
            return "{}";
        }else{
            String out = "{";
            for(Node<T> current = head; current.next != null && current.next != tail; current = current.next){
                out += current.item.toString();
                out += ", ";
            }
            out += "}";
            return out;
        }
    }

    public void clear(){
        head = null;
        tail = null;
    }

}

