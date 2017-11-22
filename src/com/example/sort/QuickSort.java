package com.example.sort;


public class QuickSort {


    public static void main(String[] args) {
        int arr[] = {70, 1,2,7,4,11, 3, 45,5,59,6,79};
        System.out.println("array before sorting: ");
        printArray(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println("array after sorting: ");
        printArray(arr);
    }

    private static void quickSort(final int[] arr, final int l, final int r) {
        if(l<r){
            int mid = partition(arr, l, r);
            quickSort(arr, l,mid-1);
            quickSort(arr, mid+1,r);
        }
    }

    private static int partition(final int[] arr, final int l, final int r) {
        int pivot = arr[r];
        int i = l-1;
        for(int j=l ; j<r; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;
    }

    private static void printArray(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
    }
}
