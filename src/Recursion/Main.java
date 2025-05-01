package Recursion;

import java.math.BigInteger;

public class Main {

	
	public static void main(String[] args) {
		System.out.println(fatorial(BigInteger.valueOf(19)));
		
		System.out.println(factorialWithLoop(19));
		
	}
	
	//Calculating factorial with recursion
	public static BigInteger fatorial(BigInteger n) {
		if (n.equals(BigInteger.ONE)) return  BigInteger.ONE;

		return n.multiply(fatorial(n.subtract(BigInteger.ONE)));
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
