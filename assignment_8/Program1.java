package assignment_8;

import java.util.Scanner;
public class Program1 {

	Program1() {
	}
	
	public int[][] makeArray() {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int input = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input;
			}
		}
		return arr;
	}
	public void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
				System.out.println();
			}
		}
	}
	public int[][] sortArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) { 
                for (int k = 0; k < arr[i].length - j - 1; k++) { 
                    if (arr[i][k] > arr[i][k + 1]) { 
                        int t = arr[i][k]; 
                        arr[i][k] = arr[i][k + 1]; 
                        arr[i][k + 1] = t; 
                    }
                }
            }
        }
        return arr;
	}
	public boolean isEquivalent(int[][] arr1, int[][] arr2) {
		boolean isEqual = false;
		for (int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j] == arr2[i][j]) {
					isEqual = true;
				} else {
					isEqual = false;
				}
			}
		}
		return isEqual;
	}
}
