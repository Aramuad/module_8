package assignment_8;

public class Program0 {
	
	private int[] numbers = new int[5];
	
	Program0() {
	}
	
	public int [] getArray(int [] array) {
		return numbers;
	}
	public int[] makeArray() {
		for (int i = 0; i < 5; i++) {
			numbers[i] = (int)Math.floor(Math.random() * 50) + 1;
		}
		return numbers;
	}
	public int[] shuffle(int[] array) {
		for (int i = 0; i < numbers.length; i++) {
			while (numbers[i] != numbers[(int)Math.floor(Math.random() * 5)]) {
				numbers[i] = numbers[(int)Math.floor(Math.random() * 5)];				
			}
		}
		return numbers;
	}
}
