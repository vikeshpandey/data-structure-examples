package com.example.sort;


public class BubbleSort {

    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {70, 1, 2, 7, 4, 11, 3, 45, 5, 59, 6, 79};
        System.out.println("array before sorting: ");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("array after sorting: ");
        printArray(arr);
    }

    private static void printArray(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
    }
}
