package Recursion;

public class Main {

	
	public static void main(String[] args) {
		int myFatorial = fatorial(10);
		System.out.println(myFatorial);
		
	}
	
	public static int fatorial(int n) {
		if (n == 1) return 1;

		return n * fatorial(n - 1);
	}
}
