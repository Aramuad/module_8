/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Assignment 8:	←		*/

package lab_14;
import java.util.Scanner;
public class LinearBinarySearch {
	
	LinearBinarySearch(){
	}
	
	public int[] makeArray(int length) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[length];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter element at index " + i + ": ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public int[] arrSort(int[] arr) {
		int holder;
		for(int j = 0; j < arr.length - 1; j++) {
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] > arr[i + 1]) {
					holder = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = holder;
				}
			}
		}
		return arr;
	}
	public void LinearSearch(int[] arr, int target) {
		int i;
		int result;
		for(i = 0; i < arr.length; i++) {
			if(i == arr.length - 1 && arr[i] != target) {
				System.out.println("Value not in array...");
			} else if(arr[i] == target) {
				result = i + 1;
				System.out.println("Linear search comparisons: " + result);
				break;
			}
		}
	}
	public int BinarySearch(int[] arr, int target) {
		arr = arrSort(arr);
		int[] arr1 = new int[2];
		int high = arr[arr.length - 1];
		int low = arr[0];
		int mid = (low + high) / 2;
		int count = 0;
			while(mid != target) {
				mid = (low + high) / 2;
				if(mid == target) {
					break;
				} else if(target > mid) {
					low = mid;
					count++;
				} else if (target < mid) {
					high = mid;
					count++;
				}
				arr1[0] = mid;
				arr1[1] = count;
			}
			return count;
		}
}
