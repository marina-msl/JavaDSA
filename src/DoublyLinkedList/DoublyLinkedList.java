package DoublyLinkedList;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	class Node {
		int value;
		Node prev;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void printList() {
		Node temp = head;
		
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead() {
		System.out.println("Head: " + head.value);
	}
	
	public void getTail() {
		System.out.println("Tail: " + tail.value);
	}
	
	public void getLength() {
		System.out.println("Length: " + length);
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		
		if (length == 0 ) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}
	
	public Node removeLast() {
		if (length == 0) return null;
		
		Node temp;
		if (length == 1) {
			temp = head;
			head = null;
			tail = null;
		} else {
			temp = tail;
			tail = tail.prev;
			tail.next = null;
		}
		length --;
		return temp;
	}
	
	public void prepend(int value) {
		Node newNode = new Node(value);
		
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		length++;
	}
	
	public Node removeFirst() {
		if (length == 0) return null;
		
		Node temp;
		
		if (length == 1) {
			temp = head;
			head = null;
			tail = null;
			
		} else {	
			temp = head;
			head  = head.next;
			head.prev = null;
		}
		
		length --;
		return temp;
	}
}
