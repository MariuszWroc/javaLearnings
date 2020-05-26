package algorithms.sorting;

public class BubbleSort {

	public static void main(String args[]) {
		int sampleArray[] = { 5, -10, 5, 12, 10, 7, 8};
		sort(sampleArray);
	}

	private static void sort(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			System.out.print("\nIteration nr: " + i);
			printArray(array);
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swapArray(array, j);
				}
			}
		}
	}

	private static void swapArray(int[] array, int j) {
		int temp = array[j];
		array[j] = array[j + 1];
		array[j + 1] = temp;
	}

	private static void printArray(int array[]) {
		System.out.print(": ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
