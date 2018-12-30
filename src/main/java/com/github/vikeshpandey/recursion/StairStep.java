package com.github.vikeshpandey.recursion;

public class StairStep {

    private static int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }

    private static int countWaysWithMemorization(int n) {
        int result[] = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }
        return result[n];
    }

    public static void main(String[] args) {
        int countWays = countWays(4);
        System.out.println(countWays);
        int countWaysWithMemorization = countWaysWithMemorization(4);
        System.out.println(countWaysWithMemorization);
    }
}
