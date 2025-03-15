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
		if (lenght == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		lenght ++;
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
	
	
	public boolean insert(int index, int value) {
		if (index < 0 || index > lenght) return false;

		if (index == 0 ) {
			prepend(value);
			return true;
		} 
		
		if (index == lenght) {
			append(value);
			return true;
		}
		
		Node newNode = new Node(value);
		Node temp = get(index - 1);
		
		newNode.next = temp.next;
		temp.next = newNode;
		lenght++;
		return true;
	}
	
	public Node remove(int index) {
		if (index < 0 || index > lenght) return null;

		if (index == 0) return removeFirst();
		
		if (index == lenght) return removeLast();
		
		//get the previous node of the one to be removed
		Node prev = get(index - 1);
		
		// get the node to be removed
		//Method get is a time complexity of O(n)
		//Node temp = get(index);
		//Faster way to grab the node to be removed instead of get
		Node temp = prev.next; 
		
		prev.next = temp.next;
		temp.next = null;
		lenght--;
		return temp;
	}
	
	public void reverse() {
		
		Node temp = head;
		Node next = temp.next;
		Node prev = temp;
		head = tail;
		tail = temp;
		
		while (next != null) {
			temp = next;
			next = temp.next;
			temp.next = prev;
			prev = temp;
		}
		
		tail.next = null;
	}
	
	//If the list has an even number of nodes, the method should return the second middle node.
    //Note: this LinkedList implementation does not have a length member variable.
	//Challenging of findMiddleNode using slow and fast pointer technique
	//also known as Floyd's Tortoise and Haire Algorithm
	public Node findMiddleNode() {
		Node fast = head;
		Node slow = head;
		
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return slow;
	}
	
	public boolean hasLoop() {
		Node fast = head;
		Node slow = head;
		
		boolean hasLoop = false;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if (slow == fast) {
				hasLoop = true;
			}
		}
		
		return hasLoop;
	}
	
	

	/** Challenging Implement a method called findKthFromEnd that 
	 * returns the k-th node from the end of the list.
	 */
	public Node findKthFromEnd(int k) {
		
		Node slow = head;
		Node fast = head;
		
		//moving fast pointer untill reacher the k 
		for (int i = 0; i < k; i++) {
			
			//if fast is null, the list has fewer than K nodes
			if (fast == null) return null;
			fast = fast.next;
		}
		
		//moving both points untill fast reaches the end
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;	
	}
}
