package BinarySearchTree;

public class Main {

	
	public static void main(String[] args) {
		BST myBst = new BST();
		
		myBst.insert(47);
		myBst.insert(21);
		myBst.insert(76);
		myBst.insert(18);
		myBst.insert(52);
		myBst.insert(82);
		
		myBst.insert(27);
		
		System.out.println(myBst.root.left.right.value);
		
		System.out.println("Contains? " + myBst.contains(27));
		System.out.println("Contains? " + myBst.contains(97));
		System.out.println("Contains? " + myBst.contains(52));


	}
}
