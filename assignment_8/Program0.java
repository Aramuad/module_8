package assignment_8;

public class Program0 {
	
	private int[] numbers = new int[5];
	
	Program0() {
	}
	
	public int [] getArray() {
		return numbers;
	}
	public void makeArray() {
		for (int i = 0; i < 5; i++) {
			numbers[i] = (int)Math.floor(Math.random() * 50) + 1;
		}
	}
	public void shuffle(int[] array) {
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			int random = (int)Math.floor(Math.random() * 5);
			temp = numbers[random];
			numbers[random] = numbers[i];
			numbers[i] = temp;;	
			
		}
	}
}
