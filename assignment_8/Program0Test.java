package assignment_8;

public class Program0Test {

	public static void main(String[] args) {
		Program0 P0 = new Program0();
		int[] array = P0.makeArray();
		while(array[0] < array[1] && array[1] < array[2] && array[2] < array[3] && array[3] < array[4] && array[4] < array[5] || array[0] > array[1] && array[1] > array[2] && array[2] > array[3] && array[3] > array[4] && array[4] > array[5]) {
			P0.shuffle(array);
			for (int i = 0; i < array.length; i++) {
				System.out.println("|" + array[i]);
				System.out.print("|");
			}
		}
	}
}
