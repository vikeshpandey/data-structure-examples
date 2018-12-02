package com.github.vikeshpandey.stringarray;

import java.util.HashMap;
import java.util.Map;

public class IsPermutationOfPalindrome {

    private static boolean isPermutationOfPalindrome(final String input) {
        if (input == null || input.trim().length() == 0) {
            return false;
        }
        final Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toLowerCase().toCharArray()) {
            charCountMap.merge(c, 1, (a, b) -> a + b);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> c : charCountMap.entrySet()) {
            if (c.getKey() == ' ') {
                continue;
            }
            if (c.getValue() == 1) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("Tact Coa"));
    }
}
