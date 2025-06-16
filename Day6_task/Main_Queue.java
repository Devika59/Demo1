package add_DSA;

import java.util.Arrays;

public class Main_Queue {
	int[]arr=new int[5];
	int rear;
	int front;
	public Main_Queue() {
		rear=-1;
		front=-1;
	}
	public void enqueue(int num) {
		if(rear==4) {
			System.out.println("Queue spreadout");
		}
		else {
			arr[++rear]=num;
		}
		}
		public void dequeue() {
			if(front==4) {
				System.out.println("Empty ");
			}
			else {
				arr[++front]=0;
			}
			
		}
		public void display() {
			System.out.println(Arrays.toString(arr));
		}
	
public static void main(String[]args) {
	
	Main_Queue m=new Main_Queue();
	m.enqueue(2);
	m.enqueue(5);
	m.enqueue(7);
	m.enqueue(9);
	m.enqueue(9);
	m.enqueue(6);
	m.dequeue();
	m.dequeue();
	m.display();
	
}
}
