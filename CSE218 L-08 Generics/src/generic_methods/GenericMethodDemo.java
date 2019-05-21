package generic_methods;

public class GenericMethodDemo {

	public static void main(String[] args) {
		String[] names = {"Adam", "Bill", "Cathy"};
		displayArray(names);
		Integer[] numbers = {1, 2, 3, 4};
		displayArray(numbers);
	}

	private static <E> void displayArray(E[] n) {
		for(E e : n) {
			System.out.println(e);
		}
		System.out.println();
	}
	
	
	
//	private static void displayArray(Integer[] numbers) {
//		for(Integer i : numbers) {
//			System.out.println(i);
//		}
//		System.out.println();
//	}
//
//	private static void displayArray(String[] names) {
//		for (String name : names) {
//			System.out.println(name);
//		}
//		System.out.println();
//	}

}
