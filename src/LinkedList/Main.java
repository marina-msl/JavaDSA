package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(3);
		myLinkedList.append(8);
		myLinkedList.append(10);
		myLinkedList.append(12);

		System.out.println("Printing LinkedList ");
		myLinkedList.printList();
		
		myLinkedList.remove(0);
		
		System.out.println("Printing LinkedList ");
		myLinkedList.printList();
		
		System.out.println("Sucess removing new node: " + myLinkedList.remove(4).value);
		System.out.println("Printing LinkedList ");
		myLinkedList.printList();
		
		System.out.println("Sucess removing a node of the midle of the LinkedList " + myLinkedList.remove(1).value);
		System.out.println("Printing LinkedList ");
		myLinkedList.printList();
		
	}
}
