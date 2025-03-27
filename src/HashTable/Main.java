package HashTable;

import java.util.HashMap;

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
		
		
		int array1[] = {1,2,3,21,22,23,24,26,27,28,29,30, 5};
		int array[] = {7,6,4,11,12,13,14,16,17,18,19, 5};
		
		System.out.println("R: " + itensInCommon(array1, array));
	}
	
//	//chalenging -> Check if there are items in comum in both arrays
//	public static boolean itensInCommon(int[] array1, int[] array2) {
//		
//		for (int i = 0; i < array1.length; i++) {
//			for (int j = 0; j < array2.length; j++) {
//				if (array1[i] == array2[j]) return true;
//			}
//		}
//		return false;
//	}
	
	//More efficient code using HashMap
	//chalenging -> Check if there are items in comum in both arrays
	//this way the time complexity is O(n), the other way, the time complexity is O(n^2);
	public static boolean itensInCommon(int[] array1, int[] array2) {
		HashMap<Integer, Boolean> hashMap = new HashMap<>();
		
		for (int i : array1) {
			hashMap.put(i, true);
		}
		
		for (int j : array2) {
			if (hashMap.get(j) != null) return true;
		}
		
		return false;
	}
}
