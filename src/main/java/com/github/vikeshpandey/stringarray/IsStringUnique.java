package com.github.vikeshpandey.stringarray;

/**
 * this program checks if given string has all unique characters.
 *
 * @author vikesh
 */

public class IsStringUnique {

  private static boolean isUnique(final String input) {
    boolean charSet_arr[] = new boolean[128];
    for (int i = 0; i < input.length(); i++) {
      int value = input.charAt(i);
      if (charSet_arr[value]) {
        return false;
      }
      charSet_arr[value] = true;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("String has unique characters, should return true, actual result is: "
        + isUnique("abc"));

    System.out.println("String has non-unique characters, should return false, actual result is: "
        + isUnique("abca"));

  }

}
