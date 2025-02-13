package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(4);
		myLinkedList.append(3);
		myLinkedList.append(8);

		LinkedList mySecondLinkedList = new LinkedList(0);
		
		myLinkedList.printList();
		
		
		mySecondLinkedList.printList();
	}
}
