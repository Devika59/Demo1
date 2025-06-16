package Day5;

public class insert_cll {
	
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

	    
	    public void insertAtTail(int data) {
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
	        Node current = head;
	        System.out.print("Circular Linked List: ");
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != head);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	insert_cll  cll = new insert_cll();
	        cll.insertAtTail(10);
	        cll.insertAtTail(20);
	        cll.insertAtTail(30);
	        cll.insertAtTail(40);
	        cll.display();
	    }
	}

	


