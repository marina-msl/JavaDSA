package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(3);
		myLinkedList.append(8);
		myLinkedList.append(10);
		myLinkedList.append(12);

		System.out.println("Priting LinkedList ");
		myLinkedList.printList();
		
		myLinkedList.insert(1, 2);
		
		System.out.println("Priting LinkedList ");
		myLinkedList.printList();
		
		boolean sucess = myLinkedList.insert(6, 13);
		System.out.println("Sucess insert new node: " + sucess);
		System.out.println("Priting LinkedList ");
		myLinkedList.printList();
		
	}
}
