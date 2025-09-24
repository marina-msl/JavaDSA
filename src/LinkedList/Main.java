package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(1);
		myLinkedList.append(1);
		myLinkedList.append(1);
	
		
		myLinkedList.printList();
		System.out.println("Decimal = " + myLinkedList.binaryToDecimal());
	}
}
