package com.github.vikeshpandey.recursion;

public class PaintFill {

    private static void paintFill(int[][] screen, int x, int y, int prevColor, int newColor) {
        if (x >= screen.length || x < 0) {
            return;
        }
        if (y >= screen[0].length || y < 0) {
            return;
        }
        if (prevColor != screen[x][y]) {
            return;
        }
        screen[x][y] = newColor;
        paintFill(screen, x + 1, y, prevColor, newColor);
        paintFill(screen, x - 1, y, prevColor, newColor);
        paintFill(screen, x, y + 1, prevColor, newColor);
        paintFill(screen, x, y - 1, prevColor, newColor);
    }

    public static void main(String[] args) {
        int screen[][] = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };
        paintFill(screen, 4, 4, screen[4][4], 3);
        for (final int[] row : screen) {
            for (final int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
