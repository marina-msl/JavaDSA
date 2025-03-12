package Stack;

public class Stack {
	
	class Node {
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}	
	
	private Node top;
	private int height;
		
	public Stack(int value) {
		top = new Node(value);
		height = 1;
	}
}
