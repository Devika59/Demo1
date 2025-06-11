package add_DSA;



public class basic_dll {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node  prev;
		Node(int val){
			data=val;
			next=null;
			prev=null;
		}
	}
	public void insert(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
			newNode.next=null;
		}
		else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		
	}
		
		 public void display() {
		       
		        Node current = head;
		        while (current != null) {
		            System.out.print(current.data+ " ");
		            current = current.next;
		           
		        }
		        System.out.println();
		    }
public static void main(String[] args) {
	basic_dll list = new basic_dll();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);
    System.out.println("Linked List after inserting at beginning:");
    list.display();
}
}





