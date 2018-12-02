package com.github.vikeshpandey.stack;

import java.util.Stack;

/**
 * Program to demonstrate splitting of array into 3 stacks
 */
public class SplitArrayIn3Stacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    Stack<Integer> s3 = new Stack<>();

    public void splitArrayIn3Stacks(int[] arr) {
        int stackSize = arr.length / 3;
        int k = stackSize + stackSize;
        for (int i = 0, j = stackSize, l = 0; l < stackSize; i++, j++, k++, l++) {
            s1.push(arr[i]);
            s2.push(arr[j]);
            s3.push(arr[k]);
        }

        if (arr.length % 3 != 0) {
            while (k < arr.length) {
                s3.push(arr[k]);
                k++;
            }
        }
    }

    public static void main(String arg[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        SplitArrayIn3Stacks sa = new SplitArrayIn3Stacks();
        sa.splitArrayIn3Stacks(arr);
        System.out.println(sa.s1);
        System.out.println(sa.s2);
        System.out.println(sa.s3);
    }
}
