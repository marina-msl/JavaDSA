package Sorts;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int numbers[] = { 4, 2, 6, 5, 1, 3 };
//		int numbers[] = {4, 2, 6, 8, 5, 1, 3, 7};

		insertionSort(numbers);

		System.out.println(Arrays.toString(numbers));

	}

	private static void insertionSort(int[] numbers) {

		for (int i = 1; i < numbers.length; i++) {
			int temp = numbers[i];
			int j = i - 1;
			
			while (j > -1 && temp < numbers[j]) {
				numbers[j+1] = numbers[j];
				numbers[j] =  temp;
				j--;
			}
		}
	}

}
