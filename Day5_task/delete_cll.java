package Day5;

public class delete_cll {
    public class CircularLinkedList {
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

        public CircularLinkedList() {
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

        
        public void deleteAtHead() {
            if (head == null) {
                System.out.println("List is empty. Nothing to delete.");
                return;
            }

            if (head == tail) {
                head = null;
                tail = null;
                System.out.println("Deleted the only node, list is now empty.");
                return;
            }

            head = head.next;   
            tail.next = head;  
            System.out.println("Deleted node at head.");
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
    }

    public static void main(String[] args) {
        delete_cll outerClass = new delete_cll();
        CircularLinkedList cll = outerClass.new CircularLinkedList(); 

        cll.insertAtTail(10);
        cll.insertAtTail(20);
        cll.insertAtTail(30);
        cll.insertAtTail(40);
        cll.display();

        cll.deleteAtHead();
        cll.display();

        cll.deleteAtHead();
        cll.display();

        cll.deleteAtHead();
        cll.display();

        cll.deleteAtHead();
        cll.display();

        cll.deleteAtHead(); 
    }
}
