package com.github.vikeshpandey.stringarray;

public class RotationOfString {

    private static boolean isRotation(final String s1, final String s2) {

        if (s1 == null || s2 == null || areStringsOfValidSize(s1.trim().length(), s2.trim().length())) {
            return false;
        }
        final String concatenated = s1 + s1;
        return isSubstring(concatenated, s2);
    }

    private static boolean areStringsOfValidSize(final int l1, final int l2) {
        return l1 == 0 || l2 == 0 || l1 != l2;
    }

    private static boolean isSubstring(final String concatenated, final String s2) {
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
    }
}
