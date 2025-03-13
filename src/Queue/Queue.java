package Queue;

public class Queue {

	class Node {
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node first;
	private Node last;
	private int length;
	
	public Queue(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length = 1;
	}
	
}
