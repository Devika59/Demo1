package add_DSA;
import java.util.Scanner;


public class Main_Assignment_day6 {
	
	
	    private int maxSize; 
	    private int[] queueArray; 
	    private int front; 
	    private int rear; 
	    private int currentSize; 

	    
	    public void Queue(int size) {
	        this.maxSize = size;
	        this.queueArray = new int[maxSize];
	        this.front = 0;
	        this.rear = -1;
	        this.currentSize = 0; 
	    }

	 
	    public void enqueue(int value) {
	        if (currentSize < maxSize) {
	            rear = (rear + 1) % maxSize; 
	            queueArray[rear] = value;
	            currentSize++;
	            System.out.println("Enqueued " + value + " to the queue.");
	        } else {
	            System.out.println("Queue is full. Cannot enqueue " + value);
	        }
	    }
 
	   
	    public int dequeue() {
	        if (currentSize > 0) {
	            int value = queueArray[front];
	            front = (front + 1) % maxSize; 
	            currentSize--;
	            return value;
	        } else {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1;
	        }
	    }

	   
	    public int peek() {
	        if (currentSize > 0) {
	            return queueArray[front];
	        } else {
	            System.out.println("Queue is empty. Cannot peek.");
	            return -1; 	        }
	    }

	  
	    public void display() {
	        if (currentSize > 0) {
	            System.out.print("Queue contents: ");
	            for (int i = 0; i < currentSize; i++) {
	                System.out.print(queueArray[(front + i) % maxSize] + " ");
	            }
	            System.out.println();
	        } else {
	            System.out.println("Queue is empty.");
	        }
	    }

	   
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the queue: ");
	        int size = scanner.nextInt();
	        Main_Assignment_day6 queue = new Main_Assignment_day6();

	        int choice;
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Enqueue");
	            System.out.println("2. Dequeue");
	            System.out.println("3. Peek");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to enqueue: ");
	                    int value = scanner.nextInt();
	                    queue.enqueue(value);
	                    break;
	                case 2:
	                    int dequeuedValue = queue.dequeue();
	                    if (dequeuedValue != -1) {
	                        System.out.println("Dequeued value: " + dequeuedValue);
	                    }
	                    break;
	                case 3:
	                    int frontValue = queue.peek();
	                    if (frontValue != -1) {
	                        System.out.println("Front value: " + frontValue);
	                    }
	                    break;
	                case 4:
	                    queue.display();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	        scanner.close();
	    }
	}


