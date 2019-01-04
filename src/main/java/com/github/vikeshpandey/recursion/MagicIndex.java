package com.github.vikeshpandey.recursion;

public class MagicIndex {

    private static int hasMagicIndex(int[] arr) {
        return evaluate(arr, 0, arr.length - 1);
    }

    private static int evaluate(int[] arr, int start, int end) {
        if (end < start) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (arr[mid] > mid) {
            return evaluate(arr, mid + 1, end);
        } else if (arr[mid] < mid) {
            return evaluate(arr, start, mid - 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
        System.out.println(hasMagicIndex(arr));
    }


}
