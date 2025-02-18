package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(4);
		myLinkedList.append(3);
		myLinkedList.append(8);
		

		System.out.println("Priting LinkedList ");
		myLinkedList.printList();
		
		myLinkedList.set(10, 1);

		System.out.println("Priting LinkedList ");
		myLinkedList.printList();

	}
}
