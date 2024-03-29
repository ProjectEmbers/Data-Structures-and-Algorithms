package binarySearchUsingRecursion;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = { 101, 105, 112, 132, 213, 231, 310, 312, 344 };
		System.out.println(binarySearch(numbers, 2, 6, 213));

	}

	private static int binarySearch(int[] numbers, int first, int last, int value) {
		int middle; // middle point of search
		if (first > last) { // base case
			return -1;
		}

		middle = (first + last) / 2;

		if (numbers[middle] == value) {
			return middle;
		} else if (numbers[middle] < value) {
			return binarySearch(numbers, middle + 1, last, value);
		} else {
			return binarySearch(numbers, first, middle - 1, value);
		}

	}

}
