package Sorts;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int numbers[] = {4, 2, 6, 5, 1, 3};
		
		selecionSort(numbers);
		
		System.out.println(Arrays.toString(numbers));
	}

	private static void selecionSort(int[] numbers) {

		int minIndex;
		
		for (int i = 0; i < numbers.length; i ++) {
			minIndex = i;
			for (int j = i + 1; j < numbers.length; j++) {
				
				if (numbers[j] < numbers[minIndex] ) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int aux = numbers[i];
				numbers[i] = numbers[minIndex];
				numbers[minIndex] = aux;
			}	
		}
		
	}

}
