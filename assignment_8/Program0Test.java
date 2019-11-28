package assignment_8;

public class Program0Test {

	public static void main(String[] args) {
		Program0 P0 = new Program0();
		P0.makeArray();
		int counter = 0;
		String order = "";
		int[] array = P0.getArray();
		boolean condition = false;
		while(condition == false) {
			P0.shuffle(array);
			counter++;
			for (int i = 0; i < array.length; i++) {
				System.out.print("|" + array[i]);
			}
			System.out.print("|");
			System.out.println();
			if (array[0] <= array[1] && array[1] <= array[2] && array[2] <= array[3] && array[3] <= array[4]) {
				condition = true;
				order = "Ascending";
			} else if (array[0] >= array[1] && array[1] >= array[2] && array[2] >= array[3] && array[3] >= array[4]) {
				condition = true;
				order = "Descending";
			}
		}
		System.out.println("Times shuffled: " + counter);
		System.out.println("Order: " + order);
	}
}
