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
}
