package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);
	
		//findKthFromEnd return the k-th node from the end of the list
		System.out.println(myLinkedList.findKthFromEnd(3).value);
		
		
	}
}
