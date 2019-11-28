package assignment_8;

public class Program1Test {

	public static void main(String[] args) {
		Program1 P1 = new Program1();
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		arr1 = P1.makeArray();
		arr2 = P1.makeArray();
		System.out.println();
		System.out.print("Array A:");
		P1.printArray(arr1);
		System.out.println();
		System.out.print("Array B:");
		P1.printArray(arr2);
		P1.sortArray(arr1);
		P1.sortArray(arr2);
		System.out.println();
		boolean compare = P1.isEquivalent(arr1, arr2);
		String judge = "";
		if (compare == true) {
			judge = "The arrays are equivalent.";
		} else {
			judge = "The arrays are not equivalent.";
		}
		System.out.println("Judgement: " + judge);
		System.out.println();
	}
}
