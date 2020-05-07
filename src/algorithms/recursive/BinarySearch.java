package algorithms.recursive;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40 };
	}

	private static int binarySearch(int arr[], int left, int right, int searchingElement) {
		if (right >= left) {
			int mid = left + (right - left) / 2;

			// If the element is present at the middle itself
			if (arr[mid] == searchingElement)
				return mid;

			// If element is smaller than mid, then it can only
			// be present in left subarray
			if (arr[mid] > searchingElement)
				return binarySearch(arr, left, mid - 1, searchingElement);

			// Else the element can only be present in right
			// subarray
			return binarySearch(arr, mid + 1, right, searchingElement);
		}

		// We reach here when element is not present in array
		return -1;
	}

}
