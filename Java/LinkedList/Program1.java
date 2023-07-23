import java.util.*;
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class LinkedList {
	static Node head = null;
		//1->2->3->4->5
	public static void addNode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data:  ");
		int val = sc.nextInt();
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
		}else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.next = null;
		}
	}
	public static void deleteNode() {
		
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	public static void addFirst() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data: ");
		int val = sc.nextInt();
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
			newnode.next = null;
		}else{
			newnode.next = head;
			head = newnode;
		}
	}
	public static void addAtPos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pos: ");
		int pos = sc.nextInt();
		System.out.println("Enter Data: ");
		int val = sc.nextInt();
		Node temp = head;
		Node newnode = new Node(val);
		while(pos!=0) {
			temp = temp.next;
			pos--;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	public static void countNodes() {
		int count = 0;
		Node temp  = head;
		while(temp!=null) {
		       temp = temp.next;
		       count++;
		}
		System.out.println("Count Of Nodes = "+ count);
	}
	public static void printLL() {
		
		Node temp = head;
		while(temp!=null) {
			System.out.print("|"+temp.data + "| ->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("1. addNode");
			System.out.println("2. deleteNode");
			System.out.println("3. addFirst");
			System.out.println("4. addAtPos");
			System.out.println("5. countNodes");
			System.out.println("6. printLL");

			int choice;
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();

			switch(choice) {
				case 1:
					addNode();
					break;
				case 2: 
				        deleteNode();
					break;
				case 3: 
					addFirst();
					break;
				case 4:
					addAtPos();
					break;
				case 5:
					countNodes();
					break;
				case 6:
					printLL();
					break;
				default:
					System.out.println("Invalid Choice");
					break;

			}
			System.out.println("Do You Wnat To Continue?");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch == 'Y');
	}
}
						
			

