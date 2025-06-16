package Day5;

public class Main_Assignment_day5 {
	
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

	   
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty. Nothing to delete.");
	            return;
	        }

	        if (position == 1) {
	            if (head == tail) { 
	                head = null;
	                tail = null;
	                System.out.println("Deleted the only node, list is now empty.");
	            } else {
	                head = head.next;
	                tail.next = head;
	                System.out.println("Deleted node at position 1 (head).");
	            }
	            return;
	        }

	       	        Node current = head;
	        Node prev = null;
	        int count = 1;
	        while (count < position && current.next != head) {
	            prev = current;
	            current = current.next;
	            count++;
	        }

	        if (count != position) {
	            System.out.println("Position " + position + " exceeds list length. No node deleted.");
	            return;
	        }

	        if (current == tail) {
	            prev.next = head;
	            tail = prev;
	            System.out.println("Deleted node at position " + position + " (tail).");
	        } else {
	       
	            prev.next = current.next;
	            System.out.println("Deleted node at position " + position + ".");
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

	
	    public int length() {
	        if (head == null) {
	            return 0;
	        }
	        int len = 0;
	        Node current = head;
	        do {
	            len++;
	            current = current.next;
	        } while (current != head);
	        return len;
	    }

	    public static void main(String[] args) {
	    	Main_Assignment_day5  cll = new Main_Assignment_day5 ();
	        cll.insertAtTail(10);
	        cll.insertAtTail(20);
	        cll.insertAtTail(30);
	        cll.insertAtTail(40);
	        cll.insertAtTail(50);

	        cll.display();

	        cll.deleteAtPosition(1); 
	        cll.display();

	        cll.deleteAtPosition(3); 
	        cll.display();

	        cll.deleteAtPosition(2); 
	        cll.display();

	        cll.deleteAtPosition(10); 
	        cll.display();
	    }
	}

	


