package Sorts;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int numbers[] = {4, 2, 6, 5, 1, 3};
//		int numbers[] = {4, 2, 6, 8, 5, 1, 3, 7};

		bubbleSort(numbers);
		
		System.out.println(Arrays.toString(numbers));

	}
	// here in the best scenario can run in O(n)
	private static void bubbleSort(int[] numbers) {

		boolean swap;		
		do{
			swap = false;
			for (int i = 0; i < numbers.length - 1; i++) {
			 
				if (numbers[i] > numbers[i + 1]) {
					int aux = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = aux;
					swap = true;
				}
			} 
		} while (swap);
	}
	
	// here doesn't matter the best case, always will be O(n^2)
//	private static void bubbleSort(int[] numbers) {
//
//		for (int i = numbers.length; i > 0; i--) {
//			for (int j = 0; j < numbers.length - 1; j++) {
//			 
//				if (numbers[j] > numbers[j + 1]) {
//					int aux = numbers[j];
//					numbers[j] = numbers[j + 1];
//					numbers[j + 1] = aux;
//				}
//			} 
//		} 
//	}

}
