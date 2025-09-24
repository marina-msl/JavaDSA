package DoublyLinkedList;

public class Main {
	
	public static void main(String[] args) {
		DoublyLinkedList ddl = new DoublyLinkedList(2);
		ddl.append(1);
		ddl.append(2);
		
		System.out.println("Printing LinkedList");
		ddl.printList();

		System.out.println("Is a palindrome? " + ddl.isPalindrome());
	}
}
