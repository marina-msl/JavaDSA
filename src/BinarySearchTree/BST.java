package BinarySearchTree;

public class BST {
	
	Node root;
	
	class Node {
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	public boolean insert(int value) {
		Node newNode = new Node(value);
		
		if (root == null) {
			root = newNode;
			return true;
		}
		
		Node temp = root;
		
		while (true) {
			if (newNode.value == temp.value) return false;
			
			if (newNode.value < temp.value) {
				if (temp.left == null) {
					temp.left = newNode;
					return true;
				} 
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}
		}
	}
	
	
	public boolean contains(int value) {
		//It is not necessary if root is null, because if root is null, the temp in while it will be null
		// and it will return false in line 63
//		if (root == null) return false;

		Node temp = root;
		
		while(temp != null) {
			if (value < temp.value) {
				temp = temp.left;
			} else if (value > temp.value) {
				temp = temp.right;
			} else { //if it is equals
				return true;
			}
		}
		return false;
	}
	
	
}
