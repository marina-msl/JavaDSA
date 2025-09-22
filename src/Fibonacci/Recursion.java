package Fibonacci;

public class Recursion {
	
	static int counter = 0 ;
	
	public static void main(String[] args) {
		
		System.out.println(fib(40));
		System.out.println(counter);
	}
	
	public static int fib(int n) {
		counter++;
		if (n == 0 || n == 1) return n;
		
		return fib(n - 1) + fib(n - 2);
	}

}
