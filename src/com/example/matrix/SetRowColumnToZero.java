package com.example.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * This program demonstrates the following:
 * if any element of the matrix is 0, the make its whole row values and column values to 0.
 * @author vikesh
 *
 */
public class SetRowColumnToZero {
	class Element {
		public int row;
		public int col;

		public Element(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	private List<Element> list = new ArrayList<Element>();

	public void setRowAndColumnToZero(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					list.add(new Element(i, j));
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			
				for (int col = 0; col < arr[0].length; col++) {
					arr[list.get(i).row][col] = 0;
				}
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			for (int row = 0; row < arr.length; row++) {
				arr[row][list.get(i).col] = 0;
			}
		
	}

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
		int[][] arr = { { 1, 2, 3,14 }, { 4, 0, 6,19 }, { 7, 8, 9,0 } };
		SetRowColumnToZero sm = new SetRowColumnToZero();
		System.out.println("original matrix: ");
		sm.printMatrix(arr);
		System.out.println("after setting to zero: ");
		sm.setRowAndColumnToZero(arr);
		sm.printMatrix(arr);
	}

}
