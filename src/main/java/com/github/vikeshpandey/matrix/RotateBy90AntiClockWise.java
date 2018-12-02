package com.github.vikeshpandey.matrix;

/**
 * This program demonstrates the way to rotate a matrix by 90 degree anti clockwise
 * @author vikesh
 *
 */
public class RotateBy90AntiClockWise {

	public void transpose(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = row; col < arr[0].length; col++) {
				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;
			}
		}
	}

	public void reverseColumn(int[][] arr) {
		for(int col = 0; col<arr.length;col++){
			for(int row = 0; row< arr[0].length/2; row++){
				int temp = arr[col][row];
				arr[col][row] = arr[col][arr[0].length-row-1];
				arr[col][arr[0].length-row-1] = temp;
			}
		}
	}

	public void rotate(int[][] arr) {
		transpose(arr);
		reverseColumn(arr);
	}

	public void printMatrix(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(" " + arr[row][col]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		RotateBy90AntiClockWise rmx = new RotateBy90AntiClockWise();
		System.out.println("before rotation: ");
		rmx.printMatrix(arr);
		System.out.println("after rotation by 90 degree on column: ");
		rmx.rotate(arr);
		rmx.printMatrix(arr);
	}

}
