package DoublyLinkedList;

public class Main {
	
	public static void main(String[] args) {
		DoublyLinkedList ddl = new DoublyLinkedList(2);
		ddl.append(4);
		ddl.append(6);
		ddl.append(8);
		ddl.append(10);
		ddl.append(12);
		ddl.append(14);
		ddl.append(16);
		ddl.append(18);
		ddl.append(20);
		
		System.out.println("Printing LinkedList");
		ddl.printList();

		ddl.swapFirstLast();
		System.out.println("Printing LinkedList");
		ddl.printList();
	}
}
