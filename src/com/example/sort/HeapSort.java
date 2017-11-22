package com.example.sort;


public class HeapSort {

    public static void main(String[] args) {
        int arr[] = {70, 1,2,7,4,11, 3, 45,5,59,6,79};
        System.out.println("array before sorting: ");
        printArray(arr);
        heapSort(arr);
        System.out.println("array after sorting: ");
        printArray(arr);
    }

    private static void printArray(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
    }

    private static void heapSort(final int[] arr) {

        int length = arr.length;
        for(int i = length/2 -1; i>=0; i--){
            heapify(arr, length, i);
        }


        for(int i=length-1;i>=0;i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(final int[] arr, final int length, final int i) {

        int largest = i;
        int leftChildPosition = (i*2)+1;
        int rightChildPosition = (i*2)+2;

        if(leftChildPosition<length && arr[leftChildPosition]>arr[largest]){
            largest = leftChildPosition;
        }

        if(rightChildPosition<length && arr[rightChildPosition]>arr[largest]){
            largest = rightChildPosition;
        }

        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, length, largest);
        }
    }
}
