package DoublyLinkedList;

public class Main {
	
	public static void main(String[] args) {
		DoublyLinkedList ddl = new DoublyLinkedList(2);
		
		ddl.append(4);
		ddl.append(6);
		
		ddl.printList();
		
		System.out.println("Remove last: " + ddl.removeLast().value);

		ddl.printList();
		
		System.out.println("Remove last: " + ddl.removeLast().value);
		ddl.printList();

		//Removing the last one
		System.out.println("Remove last: " + ddl.removeLast().value);
		ddl.printList();

		//Removing nothing, return null
		System.out.println("Remove last: " + ddl.removeLast());
		ddl.printList();


		
	}

}
