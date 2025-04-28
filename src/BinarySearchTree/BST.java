package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
	
	
	//Implementing insert recursively
	private Node rInsert(Node currentNode, int value) {
		//this is the base case, if the currentNode is null, it means we reached where 
		//the new Node has to be inserted
		if (currentNode == null) return new Node(value);
		
		//due the nature of BST, if the value is less then the Node, you have to go left, if the value is greater
		//than the currentNode, you have to go to the right side.
		//here nothing to return, only to go traversal to the BST to find the correct place to inserted the new Node.
		if (value < currentNode.value) {
			currentNode.left = rInsert(currentNode.left, value);
		} else if (value > currentNode.value ) {
			currentNode.right = rInsert(currentNode.right, value);
		}
		//this line is crucial for maintaining the tree structure during recursive calls
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
	
	
	public void deleteNode(int value) {
		deleteNode(root, value);
	}

	public Node deleteNode(Node currentNode, int value) {
		if (currentNode == null)
			return null;

		if (value < currentNode.value) {
			currentNode.left = deleteNode(currentNode.left, value);
		} else if (value > currentNode.value) {
			currentNode.right = deleteNode(currentNode.right, value);
		} else {
			if (currentNode.left == null && currentNode.right == null) {
				return null;
			} else if (currentNode.left == null) {
				currentNode = currentNode.right;
			} else if (currentNode.right == null) {
				currentNode = currentNode.left;
			} else {
				int subTreeMin = minimumValue(currentNode.right);
				currentNode.value = subTreeMin;
				currentNode.right = deleteNode(currentNode.right, subTreeMin);
			}
		}
		return currentNode;
	}

	public int minimumValue(Node currentNode) {
		
		//Once binaries search tree always insert the smallest values on the left
		//so the search here, is while the current.left is null
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
		//if currentNode is null, it means the traversal has reached the end of the tree
		//without finding the value, so the method returns true 
		if (currentNode == null) return false;
		
		//if the currentNode's value is the same of value, the value contains in the BST
		if (currentNode.value == value) return true;
		
		//if the value is less then currenteNode.value, the method calls itself recursively on the left child
		if (value < currentNode.value) {
			return rContains(currentNode.left, value);
		//if the value if greater the currentNode.value, the method calls itself recursively on the right child	
		} else {
			return rContains(currentNode.right, value);
		}
	}
	
	public boolean rContains(int value) {
		return rContains(root, value);
	}
	
	
	//Breadth First Search method -> to traversal the binary tree!
	public ArrayList<Integer> BFS() {
		Node currentNode = root;
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		queue.add(currentNode);
		
		while (queue.size() > 0 ) {
			currentNode = queue.remove();
			result.add(currentNode.value);
			
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}	
		return result;
	}
	
	
	//Depth First Search - Pre-order
	public ArrayList<Integer> DFSPreOrder() {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		class Traverse {
			Traverse(Node currentNode) {
				result.add(currentNode.value);
				
				if (currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				
				if (currentNode.right != null) {
					new Traverse(currentNode.right);
				}
			}
		}
		new Traverse(root);
		return result;
	}
}
