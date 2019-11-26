/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Assignment 8:	←		*/

package lab_14;

import java.util.Scanner;

public class SimpleSortTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleSort SS = new SimpleSort();
		System.out.print("Enter array lengths: ");
		int[] arr = SS.makeArray();
		int[] arr1 = SS.makeArray();
		int[] arr2 = SS.makeArray();
		System.out.println();
		System.out.print("Bubble sorted values: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.println("Bubble Sorted swaps: " + SS.BubbleSort(arr));
		System.out.println();
		System.out.print("Insertion Sorted values: ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}
		System.out.println();
		System.out.print("Insertion Sorted swaps: " + SS.InsertionSort(arr1));
		System.out.println();
		System.out.println();
		System.out.print("Selection Sorted values: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}
		System.out.println();
		System.out.print("Selection Sorted swaps: " + SS.SelectionSort(arr2));
		System.out.println();
		sc.close();
	}
}
