package com.github.vikeshpandey.recursion;

public class RobotInGrid {

    private static int findPath(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }
        return findPath(row - 1, column) + findPath(row, column - 1);
    }

    private static int findPathWithMemorization(int row, int column) {
        int[][] result = new int[row][column];
        result[0][0] = 1;

        //paths to reach any cell in first column is always 1
        for (int i = 0; i < row; i++) {
            result[i][0] = 1;
        }

        //paths to reach any cell in first row is always 1
        for (int j = 0; j < column; j++) {
            result[0][j] = 1;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }
        return result[row - 1][column - 1];
    }

    public static void main(String[] args) {
        System.out.println(findPath(2, 2));
        System.out.println(findPathWithMemorization(2, 2));
    }
}
