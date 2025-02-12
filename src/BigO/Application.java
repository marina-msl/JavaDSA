package BigO;

public class Application {


	
	public static void main(String[] args) {

		// time complexity of O(n^2) => O(n*n)
		//Remember: A classic example of an algorithm with a time complexity of O(n^2) is the 
		//selection sort algorithm, where the each element in a list is compared to every other element 
		//to find the minimum value => Loop within a loop
		int a = 9;
		int c = 0;
		for (int i = 1 ; i < a ; i ++) {
			for (int j = 1 ; j < a; j++ ) {
				c ++;
				System.out.println("line" + c+ "  = " + i + " " + j);
			}
		}
		
		// time complexity of O(n) => Proporcional 
		int b = 10;
		for (int i = 0 ; i < b ; i++) {
			System.out.println(i);
		}
	}
	
	// most eficient Big 0 = is CONSTANT time => O (1)
	private static int addNumber(int n ) {
		return n + n;
	}
	
	//Binary search = very efficient O(log n)
	//Divide and Conquer
}
