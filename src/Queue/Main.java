package Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue myQueue = new Queue(1);
		myQueue.enqueue(3);
		myQueue.enqueue(4);
		
		myQueue.printQueue();
		
		Queue mySecondQueue = new Queue(0);
		
		mySecondQueue.printQueue();
		
	}
}
