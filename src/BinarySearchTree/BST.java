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
	
	
	//Implementing insert recursevily
	private Node rInsert(Node currentNode, int value) {
		
		if (currentNode == null) return new Node(value);
		
		if (value < currentNode.value) {
			currentNode.left = rInsert(currentNode.left, value);
		} else if (value > currentNode.value ) {
			currentNode.right = rInsert(currentNode.right, value);
		}
		 return currentNode;
	}
	
	public void rInsert(int value) {
		if (root == null) root = new Node(value);
		rInsert(root, value);
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
	
//	private Node deleteNode() {
//		
//	}
//	
//	public void delete(int value) {
//		deleteNode(root, value);
//	}
	
	public int minimumValue(Node currentNode) {
		while (currentNode.left != null) {
			currentNode = currentNode.left;
		}
		
		return currentNode.value;
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
	
	//Implementing contains recursively
	private boolean rContains(Node currentNode, int value) {
		
		if (currentNode == null) return false;
		
		if (currentNode.value == value) return true;
		
		if (value < currentNode.value) {
			return rContains(currentNode.left, value);
		} else {
			return rContains(currentNode.right, value);
		}
	}
	
	public boolean rContains(int value) {
		return rContains(root, value);
	}
}
