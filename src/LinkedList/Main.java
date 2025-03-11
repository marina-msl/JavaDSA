package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);
	
		//If there is a loop, something is wrong in the LinkedList implementation
		System.out.println("Is there a loop in the LinkedList " + myLinkedList.hasLoop());
	}
}
