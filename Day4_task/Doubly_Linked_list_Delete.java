package add_DSA;
public class Doubly_Linked_list_Delete {
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

 
    public void deleteAtMiddle() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prevNode = slow.prev;
        Node nextNode = slow.next;

        if (prevNode != null) {
            prevNode.next = nextNode;
        } else {
            head = nextNode;
        }

        if (nextNode != null) {
            nextNode.prev = prevNode;
        }

        slow.next = null;
        slow.prev = null;
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
        Doubly_Linked_list_Delete list = new Doubly_Linked_list_Delete();

        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);
        list.insertAtBegin(50);

        System.out.println("List after insertions:");
        list.display();

       
        System.out.println("Deleting middle node");
        list.deleteAtMiddle();
        list.display();
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
}
