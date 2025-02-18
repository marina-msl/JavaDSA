package LinkedList;

public class LinkedList {
	
	private Node head;
	private Node tail;
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
		this.tail = newNode;
		lenght ++;
	}
	
	public void printList() {
		Node temp = head;
		
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead() {
		System.out.println("The head of the LinkedList is " + head.value);
	}
	
	public void getTail() {
		System.out.println("The tail of the LinkedList is " + tail.value);
	}
	
	public void getLenght() {
		System.out.println("The lenght of the LinkedList is " + lenght);
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		
		if (lenght == 0 ) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		lenght++;
	}
   
	public void prepend(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	public Node removeFirst() {
		if (lenght == 0) return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		
		lenght--;
		
		if (lenght == 0) {
			tail = null;
		}
		
		return temp;
	}
	
	public Node removeLast() {
		if (lenght == 0 ) return null;
		
		Node temp = head;
		Node prev = head;
		
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		tail = prev;
		tail.next = null;
		
		if (lenght == 0 ) {
			tail = null;
			head = null;
		}
		
		return temp;
	}
	
	public Node get(int index) {
		if (index < 0 || index >= lenght) return null;

		Node temp = head;
		
		for (int i = 0 ; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean set(int value, int index) {
		
		Node temp = get(index);
		
		if(temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}
	
	
//	public void insert(Node node) {}
//	public void remove(Node node) {}
//	public void reverse() {}
	
}
