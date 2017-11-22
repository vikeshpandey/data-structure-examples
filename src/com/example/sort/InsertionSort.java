package com.example.sort;


public class InsertionSort {

    static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {70, 1, 2, 7, 4, 11, 3, 45, 5, 59, 6, 79};
        System.out.println("array before sorting: ");
        printArr(arr);
        insertionSort(arr);
        System.out.println("array after sorting: ");
        printArr(arr);
    }

    private static void printArr(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
    }
}
