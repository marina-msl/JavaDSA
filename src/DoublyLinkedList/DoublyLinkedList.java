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
		
		Node temp = tail;
		
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
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
		
		Node temp = head;
		
		if (length == 1) {
			head = null;
			tail = null;
			
		} else {	
			head  = head.next;
			head.prev = null;
			temp.next = null;
		}
		
		length --;
		return temp;
	}
	
	public Node get(int index) {
		if (index < 0 || index >= length ) return null;
		
		Node temp = head;
		if (index < length/2) {
			for(int i = 0 ; i < index; i ++) {
				temp = temp.next;
			}
		} else {
			temp = tail;
			for (int i = length - 1; i > index; i--) {
				temp = temp.prev;
			}
		}
		return temp;
	}
	
	
	public boolean set(int index, int value) {
		Node temp = get (index);
		
		if (temp != null) {
			temp.value = value;
			return true;
		} 
		return false;
		
		
	}
	
	
	public boolean insert(int index, int value) {
		if (index < 0 || index > length) return false;
		
		if (index == 0 ) {
			prepend(value);
			return true;
		}
		
		if (index == length)  {
			append(value);
			return true;
		}
		
		Node newNode = new Node(value);
				
		Node prev = get(index - 1);
		Node next = prev.next;
		
		newNode.prev = prev;
		newNode.next = next;
		
		prev.next = newNode;
		next.prev = newNode;
		length++;
		return true;
	}
	
	public Node remove(int index) {
		if (index < 0 || index > length - 1) return null;
		
		if (index == 0) return removeFirst();
		
		if (index == length - 1) return removeLast();
		
		Node temp = get(index);
		Node prev = temp.prev;
		Node next = temp.next;
		
		prev.next = next;
		next.prev = prev;
		
		temp.next = null;
		temp.prev = null;
		
		length --;
		
		return temp;
		
	}
	
	
	/** Challenge interview:Swap First and Last Node Values in a Doubly Linked List.
	 *  Given a DoublyLinkedList, lets swap the values frist and last nodes in the list.
	 *  Input: 1 <-> 2 <-> 3 <-> 4 <-> 5
	 *	Output: 5 <-> 2 <-> 3 <-> 4 <-> 1
	 */
	
	public void swapFirstLast() {
		
		if (length < 2) return;
//		
//		Node tempHead = head;
//		
//		head.next.prev = tail;
//		tail.prev.next = head;
//		
//		head.prev = tail.prev;
//		tail.next = head.next;
//		head.next = null;
//		tail.prev = null;
//		
//		head = tail;
//		tail = tempHead;
//		
		
	   int temp = head.value;
		
		head.value = tail.value;
		tail.value = temp;
		
	}
}
