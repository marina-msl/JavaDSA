package Fibonacci;

public class Fibonacci {

	
	public static void main(String[] args) {
		//There are three ways of calculating Fibonacci
		//here is the most interesting way
		System.out.println(fibonacciCalculate(5));
	}

	private static int fibonacciCalculate(int n) {

		if (n == 0 || n == 1) return n;
		
		int beforePrevious = 0;
		int previous = 1;
		int number = 0;
		
		for (int i = 2; i <= n; i++) {
			number = beforePrevious + previous;
			beforePrevious = previous;
			previous = number;
		}
		return number;
	}
}
