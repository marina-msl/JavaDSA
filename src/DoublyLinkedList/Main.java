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

		long now = System.currentTimeMillis();
		System.out.println("Getting Node by index 0 : " + ddl.get(0).value + " value");
		long after = System.currentTimeMillis();
		System.out.println("Time execution " + (after - now));
		
		long now1 = System.currentTimeMillis();
		System.out.println("Getting Node by index 4 : " + ddl.get(4).value + " value");
		long after1 = System.currentTimeMillis();
		System.out.println("Time execution " + (after1 - now1));
		
		
		long now2 = System.currentTimeMillis();
		System.out.println("Getting Node by index 8 : " + ddl.get(8).value + " value");
		long after2 = System.currentTimeMillis();
		System.out.println("Time execution " + (after2 - now2));
		
	}
}
