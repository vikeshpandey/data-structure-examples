package com.example.sort;


public class MergeSort {


        static void doMerge(int arr[], int begin, int mid, int end){
            int n1 = mid-begin+1;
            int n2 = end-mid;

            int arrLeft[] = new int[n1];
            int arrRight[] = new int[n2];

            for(int i =0; i<n1; i++){
                arrLeft[i] = arr[begin+i];
            }

            for (int j=0;j<n2;j++){
                arrRight[j] = arr[mid+1+j];
            }
            int i= 0,j=0, k = begin;

            while(i<n1 && j<n2){
                if(arrLeft[i] <= arrRight[j]){
                    arr[k] = arrLeft[i];
                    i++;
                }else{
                    arr[k] = arrRight[j];
                    j++;
                }
                k++;
            }

            while(i<n1){
                arr[k] = arrLeft[i];
                k++;
                i++;
            }

            while(j<n2){
                arr[k] = arrRight[j];
                j++;
                k++;
            }
        }



       static void sort(int arr[], int begin, int end){
        if(begin<end){
            int mid = (begin+end)/2;
            sort(arr, begin, mid);
            sort(arr, mid+1, end);
            doMerge(arr, begin, mid, end);
        }
        }



    public static void main(String[] args) {
        int arr[] = {70, 1,2,7,4,11, 3, 45,5,59,6,79};
        System.out.println("array before sorting: ");
        printArray(arr);
        sort(arr,0,arr.length-1);
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
