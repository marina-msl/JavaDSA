package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(4);
		myLinkedList.prepend(3);
		myLinkedList.prepend(8);
		

		System.out.println("Priting LinkedList ");
		myLinkedList.printList();
		
	}
}
