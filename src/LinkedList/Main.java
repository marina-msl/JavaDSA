package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(3);
		myLinkedList.append(8);
		myLinkedList.append(8);
		myLinkedList.append(10);
		myLinkedList.append(5);
		myLinkedList.append(3);
	
		
		myLinkedList.printList();
		myLinkedList.removeDuplicates();
		System.out.println("Removed");
		myLinkedList.printList();
	}
}
