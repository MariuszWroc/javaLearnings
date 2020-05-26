package algorithms.sorting;

public class QuickSort {
	private static int iterationNumber = 0;

	public static void main(String args[]) {
		int sampleArray[] = { 5, -10, 5, 12, 10, 7, 8 };
		sort(sampleArray, 0, sampleArray.length - 1);
	}

	private static void sort(int[] array, int left, int right) {
		int i = left;
		int j = right;
		
		int pivot = array[left + (right - left) / 2];

		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}

			if (i <= j) {
				swapArray(array, i, j);
				i++;
				j--;
			}
		}

		if (left < j) {
			sort(array, left, j);
		}
		if (i < right) {
			sort(array, i, right);
		}

		printArray(array);
	}

	private static void swapArray(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void printArray(int array[]) {
		System.out.print("\nIteration nr: " + iterationNumber++);
		System.out.print(": ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}