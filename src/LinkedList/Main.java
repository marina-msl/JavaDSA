package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(3);
		myLinkedList.append(8);
		myLinkedList.append(5);
		myLinkedList.append(10);
		myLinkedList.append(2);
		myLinkedList.append(1);
	
		
		//		Output: 3 -> 2 -> 1 -> 8 -> 5 -> 10
		myLinkedList.partitionList(5);
		myLinkedList.printList();
	}
}
