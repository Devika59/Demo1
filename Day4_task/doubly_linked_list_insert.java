package add_DSA;

public class doubly_linked_list_insert {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    
    public void insertAtMiddle1(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prevNode = slow.prev;

        newNode.next = slow;
        newNode.prev = prevNode;
        slow.prev = newNode;

        if (prevNode != null) {
            prevNode.next = newNode;
        } else {
            head = newNode;
        }
    }

    
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doubly_linked_list_insert list = new doubly_linked_list_insert();

    
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);
        list.insertAtBegin(50);
        list.insertAtBegin(986);

        System.out.println("Linked List after inserting at beginning:");
        list.display();

      
        list.insertAtMiddle1(990);
        System.out.println("Linked List after inserting 99 at middle:");
        list.display();
    }
}
