package com.github.vikeshpandey.stringarray;

import java.util.HashMap;
import java.util.Map;

/**
 * this program check if given two string, both are just 1 or 0 edit away from
 * being a palindrome of each other: for example: "pale", "ple"
 *
 * @author vikesh
 */
public class StringOneEditAway {

    private static boolean isOneEditAway(final String first, final String second) {
        if (first == null || second == null) {
            return false;
        }
        final int firstStringLength = first.trim().length();
        final int secondStringLength = second.trim().length();
        if (firstStringLength == 0 || secondStringLength == 0 ||
                    isDifferenceGreaterThanOne(firstStringLength, secondStringLength)) {
            return false;
        }
        final Map<Character, Integer> map = new HashMap<>();
        for (char c : first.toCharArray()) {
            map.merge(c, 1, (a, b) -> a + b);
        }
        for (char c : second.toCharArray()) {
            map.merge(c, 1, (a, b) -> a + b);
        }

        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
                if (count > 2) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isDifferenceGreaterThanOne(final int firstStringLength, final int secondLength) {
        int difference = firstStringLength > secondLength ?
                                 firstStringLength - secondLength
                                 : secondLength - firstStringLength;
        return difference > 1;
    }

    public static void main(String[] args) {
        System.out.println("this should return true, actual result is : " + isOneEditAway("pale", "ple"));

        System.out.println("this should return true, actual result is : " + isOneEditAway("pales", "pale"));

        System.out.println("this should return true, actual result is : " + isOneEditAway("pale", "bale"));

        System.out.println("this should return false, actual result is : " + isOneEditAway("pale", "bake"));
    }

}
