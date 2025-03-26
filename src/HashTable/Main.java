package HashTable;

public class Main {

	public static void main(String[] args) {
		
		HashTable myHashTable = new HashTable();
		
		System.out.println("Printing HashTable");
		myHashTable.printTable();
		
		myHashTable.set("nails", 100);
		
		myHashTable.set("tile", 1900);
		myHashTable.set("lumber", 80);

		myHashTable.set("bolts", 200);
		myHashTable.set("screws", 140);
		
		System.out.println("Printing HashTable");
		myHashTable.printTable();
		
		System.out.println("Nails = " + myHashTable.get("nails"));
		
		myHashTable.keys();
		
		System.out.println(myHashTable.keys().toString());
		
	}
}
