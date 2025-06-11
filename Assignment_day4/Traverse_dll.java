package add_DSA;

public class Traverse_dll {
	
	    Node head;

	    class Node {
	        int data;
	        Node next;
	        Node prev;

	        Node(int val) {
	            data = val;
	            next = null;
	            prev = null;
	        }
	    }

	  
	    public void insert(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	            newNode.next = null;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	  
	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	   
	    public void displayReverse() {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        // Go to the last node
	        Node tail = head;
	        while (tail.next != null) {
	            tail = tail.next;
	        }

	        // Traverse backwards
	        Node current = tail;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }

	    
	    public static void main(String[] args) {
	    	Traverse_dll list = new Traverse_dll();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);
	        list.insert(50);

	        System.out.println("Linked List from front to end:");
	        list.display();

	        System.out.println("Linked List from end to front:");
	        list.displayReverse();
	    }
	}



