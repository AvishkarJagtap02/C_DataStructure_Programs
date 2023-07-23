//Queue implimentation using Collection Framework in java
	
import java.util.LinkedList;
import java.util.Queue;
class queue {
	public static void main(String args[]) {
			//Queue q = new Queue();
			//Queue<Integer> q = new LinkedList<>();
			Queue<Integer> q = new ArrayDequeue<>();
			q.add(1);
			q.add(2);
			q.add(3);
			q.add(4);
			q.add(5);
			while(!q.isEmpty()) {
				System.out.println(q.peek());
				q.remove();
			}
	}	
}
