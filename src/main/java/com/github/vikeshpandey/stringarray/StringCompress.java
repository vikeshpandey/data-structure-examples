package com.github.vikeshpandey.stringarray;

/**
 * this program gives the compressed version of a string for example:
 * aaabbaaccddd should give a3b2a2c2d3.
 *
 * @author vikesh
 */
public class StringCompress {

    private static String compress(final String input) {
        if (input == null || input.trim().length() == 0) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                counter++;
            } else if (input.charAt(i) == input.charAt(i - 1)) {
                counter++;
            } else {
                sb.append(input.charAt(i - 1));
                sb.append(counter);
                counter = 1;
            }
            if (i == input.length() - 1) {
                sb.append(input.charAt(i));
                sb.append(counter);
            }
        }
        final String result = sb.toString();
        if (input.length() < result.length()) {
            return input;
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println("input string is: " + str);
        System.out.println("String after compression is: " + compress(str));
    }

}
