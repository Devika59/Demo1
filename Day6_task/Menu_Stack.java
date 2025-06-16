package add_DSA;
import java.util.Scanner;

public class Menu_Stack {
	

	
	    private int maxSize; 
	    private int[] stackArray; 
	    private int top; 

	   
	    public void Stack(int size) {
	        this.maxSize = size;
	        this.stackArray = new int[maxSize];
	        this.top = -1; 
	    }

	    
	    public void push(int value) {
	        if (top < maxSize - 1) {
	            stackArray[++top] = value;
	            System.out.println("Pushed " + value + " onto the stack.");
	        } else {
	            System.out.println("Stack is full. Cannot push " + value);
	        }
	    }

	   
	    public int pop() {
	        if (top >= 0) {
	            return stackArray[top--];
	        } else {
	            System.out.println("Stack is empty. Cannot pop.");
	            return -1; 
	        }
	    }

	   
	    public int peek() {
	        if (top >= 0) {
	            return stackArray[top];
	        } else {
	            System.out.println("Stack is empty. Cannot peek.");
	            return -1; 
	        }
	    }

	    
	    public void display() {
	        if (top >= 0) {
	            System.out.print("Stack contents: ");
	            for (int i = 0; i <= top; i++) {
	                System.out.print(stackArray[i] + " ");
	            }
	            System.out.println();
	        } else {
	            System.out.println("Stack is empty.");
	        }
	    }

	  
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the stack: ");
	        int size = scanner.nextInt();
	        Menu_Stack stack = new Menu_Stack();

	        int choice;
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to push: ");
	                    int value = scanner.nextInt();
	                    stack.push(value);
	                    break;
	                case 2:
	                    int poppedValue = stack.pop();
	                    if (poppedValue != -1) {
	                        System.out.println("Popped value: " + poppedValue);
	                    }
	                    break;
	                case 3:
	                    int topValue = stack.peek();
	                    if (topValue != -1) {
	                        System.out.println("Top value: " + topValue);
	                    }
	                    break;
	                case 4:
	                    stack.display();
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



