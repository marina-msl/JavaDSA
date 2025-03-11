package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);

	
		System.out.println("Finding middle node of the LinkedList " + myLinkedList.findMiddleNode().value);
		
		LinkedList mySecondLinkedList = new LinkedList(1);
		mySecondLinkedList.append(2);
		mySecondLinkedList.append(3);
		mySecondLinkedList.append(4);
		mySecondLinkedList.append(5);
		mySecondLinkedList.append(6);

		System.out.println("Finding middle node of the LinkedList " + mySecondLinkedList.findMiddleNode().value);
		
	}
}
