/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Assignment 8:	←		*/

package lab_14;

public class SimpleSort {
	
	SimpleSort() {
	}
	
	public int[] makeArray() {
		int[] arr = new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)Math.floor(Math.random() * 100) + 1;
		}
		return arr;
	}
	
	public int BubbleSort(int[] arr) {
		int counter = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int holder = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = holder;
					counter++;
				}
			}
		}
		return counter;
	}
	public int InsertionSort(int[] arr) {
		int counter = 0;
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
				counter++;
 			}
			arr[j + 1] = key;
		}
		return counter;
	}
	public int SelectionSort(int[] arr) {
		int counter = 0;
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int min_index = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[min_index])
					min_index = j;
			}
			counter++;
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
		return counter;
	}
}
