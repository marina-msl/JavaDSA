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

		@Override
		public String toString() {
			return "Node [value=" + value + "]";
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
		System.out.println("The head of the LinkedList is " + head);
	}
	
	public void getTail() {
		System.out.println("The tail of the LinkedList is " + tail);
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
		Node temp = head;
		head = head.next;
		
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
		int c = 0;
		
		while (temp.next != null) {
			if (c == index) {
				break;
			} else {
				temp = temp.next;
				c++;
			}
		}
		return temp;
	}
	
//	public void set(int value) {}
//	public void insert(Node node) {}
//	public void remove(Node node) {}
//	public void reverse() {}
	
}
