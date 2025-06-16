package Day5;
import java.util.Scanner;

public class Post_Assignment_Day5 {
	


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

	    public void CircularLinkedListMenu() {
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
	        System.out.println("Inserted " + data + " at tail.");
	    }

	    
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty. Nothing to delete.");
	            return;
	        }

	        if (position == 1) {
	            if (head == tail) { 
	                System.out.println("Deleted the only node (" + head.data + "), list is now empty.");
	                head = null;
	                tail = null;
	            } else {
	                System.out.println("Deleted node at position 1 (head): " + head.data);
	                head = head.next;
	                tail.next = head;
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
	            System.out.println("Position " + position + " is invalid. No node deleted.");
	            return;
	        }

	        if (current == tail) {
	            prev.next = head;
	            tail = prev;
	            System.out.println("Deleted node at position " + position + " (tail): " + current.data);
	        } else {
	            prev.next = current.next;
	            System.out.println("Deleted node at position " + position + ": " + current.data);
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
	    	 Post_Assignment_Day5  cll = new  Post_Assignment_Day5 ();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Insert at Tail");
	            System.out.println("2. Delete at Position");
	            System.out.println("3. Display");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice (1-4): ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert: ");
	                    int data = scanner.nextInt();
	                    cll.insertAtTail(data);
	                    break;
	                case 2:
	                    System.out.print("Enter position to delete: ");
	                    int pos = scanner.nextInt();
	                    cll.deleteAtPosition(pos);
	                    break;
	                case 3:
	                    cll.display();
	                    break;
	                case 4:
	                    System.out.println("Exiting program.");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	            }
	        }
	    }
	}

	


