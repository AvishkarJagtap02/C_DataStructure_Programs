// Queue Implimentation using array in java 
import java.util.*;
class Queue {
	static int size = 0, front = -1, rear = -1,flag = 1;
	public static int enqueue(int arr[]) {				// Function for adding elements in queue
		Scanner sc = new Scanner(System.in);
		if(rear == size-1) {					// if rear == size -1 then queue is full
			return -1;
		}else {
			if(front ==-1 || rear == -1)  {
				front++;
			}
			rear++;
			System.out.println("Enter Data ");
			arr[rear] = sc.nextInt();
			return 0;
		}		
	}
	public static int dequeue(int arr[]) {				//Function to delete elements from the queue
		
		if(rear==-1 || front > rear) {				// condition to check that if queue is empty or all elements are dequeued
			flag = 0; 
			return -1;
		}else if(rear == front) {				//condition to check that queue has only one element
			int val = arr[front];
			rear = -1;
			front = -1;
			return val;
		}else {
			flag = 1;
			return arr[front++];				
		}
	}
	public static int Front(int arr[]) {
		
		if(front == -1) {					// condition to check that queue is empty or not
			return -1;
		}
		return arr[front];					//return first element of the queue
	}

	public static void printQueue(int arr[]) {
		if(front == -1) {					// checks if queue is empty or not 
			System.out.println("Queue is Empty!!");
		}else {
			for(int i = front; i<=rear; i++) {		// prints the queue
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		size = sc.nextInt();
		int arr[] = new int[size];
		char choice;
		do {
			System.out.println("1.Enqueue");
                	System.out.println("2.dequeue");
                	System.out.println("3.front");
                	System.out.println("4.Print queue");

                	int ch;
                	System.out.println("Enter choice");
			ch = sc.nextInt();

			switch(ch) {
				case 1: 
					{
						int ret = enqueue(arr);
						if(ret == -1) {
							System.out.println("Queue is OverFlow!!");
						}else {
							System.out.println("Sucessfully Added to the queue");
						}
					}
					break;
				case 2:
					{
						int ret = dequeue(arr);
						if(flag == 0) {
							System.out.println("Queue is UnderFlow!!!");
						}else {
							System.out.println(ret + " dequeued !!!");
						}
					}
					break;
				case 3:
					{
						int ret = Front(arr);
						if(ret == -1) {
							System.out.println("Queue is Empty!!!");
						}else {
							System.out.println("Front = " + ret);
						}
					}
					break;
				case 4:
					{
						printQueue(arr);
					}
					break;
				default:
					System.out.println("Invalid Choice!!!");
					break;
			}
			System.out.println("Do you wnat to continue??");
			choice = sc.next().charAt(0);
		}while(choice == 'y' || choice == 'Y');
	}
}
			



