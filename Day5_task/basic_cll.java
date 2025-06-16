package Day5;

public class basic_cll {
	
	   
	    static class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node head; 
	    private Node tail; 

	  
	    public void CircularLinkedList() {
	        head = null;
	        tail = null;
	    }

	    
	    public void add(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	           
	            head = newNode;
	            tail = newNode;
	            tail.next = head;
	        } else {
	            tail.next = newNode;
	            tail = newNode; 
	            tail.next = head; 
	        }
	    }

	   
	    public void display() {
	        if (head == null) {
	            System.out.println("Circular linked list is empty.");
	            return;
	        }
	        System.out.print("Circular Linked List: ");
	        Node current = head;
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != head);
	        System.out.println();
	    }

	  
	    public static void main(String[] args) {
	    	 basic_cll cll = new  basic_cll();
	        cll.add(10);
	        cll.add(20);
	        cll.add(30);
	        cll.add(40);
	        cll.display();
	    }
	}



