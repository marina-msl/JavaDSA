package LinkedList;

public class LinkedList {
	
	private Node head;
	private Node tailf;
	private int lenght;
	
	class Node {
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
	}

	public LinkedList(int value) {
		Node newNode = new Node(value);
		this.head = newNode;
		this.tailf = newNode;
		lenght = 1;
	}
	
	public void printList() {
		Node temp = head;
		
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
//	public void append(int value) {}
//	public void prepend(int value) {}
//	public boolean insert(int value, int index) {}

}
