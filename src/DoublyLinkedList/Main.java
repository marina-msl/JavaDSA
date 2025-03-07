package DoublyLinkedList;

public class Main {
	
	public static void main(String[] args) {
		DoublyLinkedList ddl = new DoublyLinkedList(2);
		
		ddl.append(4);
		ddl.append(6);
		
		System.out.println("Printing LinkedList");
		ddl.printList();

		ddl.removeFirst();
		System.out.println("Printing LinkedList");
		ddl.printList();

		ddl.removeFirst();
		System.out.println("Printing LinkedList");
		ddl.printList();
		
		ddl.removeFirst();
		System.out.println("Printing LinkedList");
		ddl.printList();
		
	}

}
