package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(4);
		myLinkedList.append(3);
		myLinkedList.append(8);
		myLinkedList.append(2);
		myLinkedList.append(12);
		
		myLinkedList.printList();
		
		
		myLinkedList.getLenght();
		
		System.out.println(myLinkedList.get(3));
		
	}
}
