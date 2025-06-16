package add_DSA;

public class Post_Assignment_day6 {
    static class Node {
        int data; 
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        private Node top; 

        public Stack() {
            this.top = null; 
        }

        public void push(int value) {
            Node newNode = new Node(value); 
            newNode.next = top; 
            top = newNode;
            System.out.println("Pushed " + value + " onto the stack.");
        }

        public int pop() {
            if (top == null) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1; 
            }
            int value = top.data; 
            top = top.next;
            return value;
        }

        public int peek() {
            if (top == null) {
                System.out.println("Stack is empty. Cannot peek.");
                return -1; 
            }
            return top.data; 
        }

        public void display() {
            if (top == null) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.print("Stack contents: ");
            Node current = top; 
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next; 
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Stack stack = new Stack();

            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.display(); 
            System.out.println("Top element: " + stack.peek()); 

            System.out.println("Popped element: " + stack.pop()); 
            stack.display(); 

            System.out.println("Popped element: " + stack.pop()); 
            stack.display(); 

            System.out.println("Popped element: " + stack.pop()); 
            stack.display(); 

            System.out.println("Popped element: " + stack.pop()); 
        }
    }
}