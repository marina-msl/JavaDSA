package HashTable;

import java.util.ArrayList;
import java.util.List;

public class HashTable {
	
	private int size = 7;
	private Node[] dataMap;
	
	public class Node {
		
		private String key;
		private int value;
		private Node next;
		
		public Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public HashTable() {
		dataMap = new Node[size];
	}
	
	public void printTable() {
		for (int i = 0; i < dataMap.length; i ++) {
			System.out.println(i + ":");
			Node temp = dataMap[i];
			while (temp != null ) {
				System.out.println(" {" + temp.key + " = " + temp.value + " }");
				temp = temp.next;
			}
		}
	}
	
	private int hash(String key) {
		int hash = 0;
		char [] keyChars = key.toCharArray();
		for (int i = 0; i < keyChars.length; i++ ) {
			int asciiValue = keyChars[i];
			hash = (hash + asciiValue * 23 ) % dataMap.length; 
		}
		return hash;
	}
	
	public void set(String key, int value) {
		int index = hash(key);
		Node newNode = new Node(key, value);
		
		if (dataMap[index] == null) {
			dataMap[index] = newNode;
		} else {
			Node temp = dataMap[index];
			
			//checking if the node's key is the same, if it is, this is for updating the value 
			if (temp.key.equals(key)) {
				temp.value += value;
				return;
			}
			
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public int get(String key) {
		int index = hash(key);
		
		Node temp = dataMap[index];

		while (temp.next != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			} else {
				temp = temp.next;
			}
		}
		
	return 0;	
	}
	
	public ArrayList<String> keys() {
//		Node temp = dataMap[0];
		ArrayList<String> keys = new ArrayList<>();
		
		for (int i = 0 ; i < dataMap.length; i++) {
			Node temp = dataMap[i];
			while(temp != null) {
				keys.add(temp.key);
				
				temp = temp.next;
			}
		}
		return keys;
	}
}
