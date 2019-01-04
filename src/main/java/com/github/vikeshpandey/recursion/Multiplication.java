package com.github.vikeshpandey.recursion;

public class Multiplication {

    /* function to multiply two numbers x and y*/
    static int multiply(int x, int y) {

        /* 0 multiplied with anything gives 0 */
        if (y == 0)
            return 0;

        /* Add x one by one */
        if (y > 0) {
            System.out.println("y is :"+y);
            return (x + multiply(x, y - 1));
        }

        /* the case where y is negative */
        if (y < 0)
            return -multiply(x, -y);

        return -1;
    }

    // Driver code
    public static void main(String[] args) {

        System.out.print("\n" + multiply(5, 3));
    }
}
