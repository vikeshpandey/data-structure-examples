package com.github.vikeshpandey.search;

public class BinarySearch {

    static int binarySearch(int arr[], int begin, int end, int element){
        if(arr.length==0){
            return -1;
        }

        int mid = (begin+end)/2;

        if(arr[mid] == element){
            return mid;
        }

        if(end>=1){
            if(element<arr[mid]){
                end = mid-1;
                return binarySearch(arr, begin, end, element);
            }else{
                begin = mid+1;
                return binarySearch(arr, begin, end, element);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,11,45,59,70,79};
	System.out.println("element found at index:  "+binarySearch(arr, 0,11, 4));
    }
}
