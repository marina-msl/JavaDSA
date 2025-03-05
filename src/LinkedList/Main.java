package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);

		System.out.println("Printing LinkedList 1");
		myLinkedList.printList();
		
		myLinkedList.reverse();
		
		System.out.println("Printing LinkedList 2 ");
		myLinkedList.printList();
		
		LinkedList mySecondLinkedList = new LinkedList(1);
		System.out.println("Printing second LinkedList ");
		mySecondLinkedList.printList();
		mySecondLinkedList.reverse();
		
		System.out.println("Printing second LinkedList ");
		mySecondLinkedList.printList();
		
		
		
		
		
	}
}
