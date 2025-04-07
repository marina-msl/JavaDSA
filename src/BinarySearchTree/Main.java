package BinarySearchTree;

public class Main {

	
	public static void main(String[] args) {
		BST myBst = new BST();
		
		myBst.insert(47);
		myBst.insert(21);
		myBst.insert(76);
		myBst.insert(18);
		myBst.insert(27);
		myBst.insert(52);
		myBst.insert(82);
		
		System.out.println("Contains value 27? " + myBst.rContains(27));
		System.out.println("Contains value 17? " + myBst.rContains(17));
		
		BST mySecondBst = new BST();
		
		mySecondBst.rInsert(2);
		mySecondBst.rInsert(1);
		mySecondBst.rInsert(3);
		
		
		
		System.out.println("\nRoot: " + mySecondBst.root.value);
		System.out.println("\nRoot->left: " + mySecondBst.root.left.value);
		System.out.println("\nRoot->right: " + mySecondBst.root.right.value);
		
		mySecondBst.deleteNode(2);
		
		System.out.println("\nRoot: " + mySecondBst.root.value);
		System.out.println("\nRoot->left: " + mySecondBst.root.left.value);
		System.out.println("\nRoot->right: " + mySecondBst.root.right);
		

	}
}
