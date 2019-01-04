package com.github.vikeshpandey.recursion;

public class TowerOfHanoi {
    private static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Moving disk 1 from: " + from + " to " + to);
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Moving disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
