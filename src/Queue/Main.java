package Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue myQueue = new Queue(1);
		myQueue.enqueue(3);
		myQueue.enqueue(4);
		
		System.out.println("Printing Queue");
		myQueue.printQueue();
		
		System.out.println(myQueue.queue().value);
		
		System.out.println("Printing Queue");
		myQueue.printQueue();
	}
}
