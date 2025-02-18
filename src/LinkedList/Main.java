package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(4);
		myLinkedList.append(3);
		myLinkedList.append(8);
		
		//Return 3 nodes
		myLinkedList.printList();
		
		System.out.println("Remove first: " + myLinkedList.removeFirst());
		
		//Return 2 nodes
		myLinkedList.printList();
		
		//Return number 2
		myLinkedList.getLenght();
		
		System.out.println("Remove first: " + myLinkedList.removeFirst().value);

		System.out.println("Remove first: " + myLinkedList.removeFirst().value);

		//Return 0
		myLinkedList.getLenght();

		//Return empty
		myLinkedList.printList();
		
		//Return null
		System.out.println("Remove first: " + myLinkedList.removeFirst());

	}
}
