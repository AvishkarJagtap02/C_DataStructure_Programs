// Implimentation of Queue using linked list
import java.util.*;
class Node {
	int data;
	Node next;

	Node(int data) {
		
		this.data = data;
	        next = next;	
	}
}

class Queue {
	static Node front = null;
	static Node rear = null;
	static int flag = 1;
	public static int enqueue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data");
		int val = sc.nextInt();

		Node newnode = new Node(val);
		if(front == null || rear == null) {
			front = newnode;
			rear = newnode;
		}else {
			rear.next = newnode;
			rear = newnode;
		}
		return 0;
	}
	public static int dequeue() {

		if(front == null) {
			flag = 0;
			rear = front;
			return -1;
		}else {
			Node temp = front;
			int val = front.data;
			front = front.next;
			if(front == null) {
				rear = null;
			}
			return val;
		}
	}
	public static int Front() {
		if(front == null) {
			return -1;
		}else {
			return front.data;
		}
	}
	public static void printQueue() {
		if(front == null) {
			System.out.println("Queue is Empty!!!");
		}else {
			Node temp = front;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch;

		do {
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.Front");
			System.out.println("4.printQueue");

			int choice;
			System.out.println("Enter Your choice");
			choice = sc.nextInt();

			switch(choice) {
				case 1: 
					{
						int ret = enqueue();
						if(ret == -1) {
							System.out.println("Queue is Full");
						}
					}
					break;
				case 2:
					{
						int ret = dequeue();
						if(flag==0) {
							System.out.println("Queue is Empty!!!");
						}else {
							System.out.println(ret + "  Dequeued");
						}
					}
					break;
				case 3:
					{
						int ret = Front();
						if(ret == -1) {
							System.out.println("Queue underflow");
						}else {
							System.out.println("Front = " + ret);
						}
					}
					break;
				case 4:
					printQueue();
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
			System.out.println("\nDo You Want To Continue!!!");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}
			







