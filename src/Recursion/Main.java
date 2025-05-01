package Recursion;

public class Main {

	
	public static void main(String[] args) {
		System.out.println(fatorial(5));
		
		System.out.println(factorialWithLoop(5));
		
	}
	
	//Calculating factorial with recursion
	public static int fatorial(int n) {
		if (n == 1) return 1;

		return n * fatorial(n - 1);
	}
	
	//calculating factorial with 
	
	public static int factorialWithLoop(int n) {
		
		int factorial = 1;

		//factorial of 1 is always 1
		for (int i = 2 ; i <= n; i ++) {
			factorial  *= i;
		}
		
		return factorial;
	}
}
