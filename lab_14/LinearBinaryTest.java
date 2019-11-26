/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Assignment 8:	←		*/

package lab_14;

import java.util.Scanner;

public class LinearBinaryTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the length of the array: ");
		int length = sc.nextInt();
		System.out.println();
		System.out.print("Enter the value you wish to search for: ");
		int target = sc.nextInt();
		LinearBinarySearch LBS = new LinearBinarySearch();
		int[] arr = LBS.makeArray(length);
		System.out.println();
		System.out.print("Array Values: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		System.out.println("Target Value: " + target);
		System.out.println();
		LBS.LinearSearch(arr, target);
		int binarySearch = LBS.BinarySearch(arr, target);
		System.out.println("Binary search comparisons: " + binarySearch);
		System.out.println();
		sc.close();
	}
}
