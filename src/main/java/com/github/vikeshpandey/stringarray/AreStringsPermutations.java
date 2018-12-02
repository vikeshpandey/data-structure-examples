package com.github.vikeshpandey.stringarray;

import java.util.Arrays;
import java.util.HashMap;

/**
 * this program checks if two string are permutations of each other.
 *
 * @author vikesh
 */
public class AreStringsPermutations {

  private static boolean isPermutationByHashMap(final String s1, final String s2) {
    final HashMap<Character, Integer> map = new HashMap<>();
    if (s1 == null || s2 == null) {
      return false;
    }
    if (s1.trim().length() != s2.trim().length()) {
      return false;
    }

    for (int i = 0; i < s1.length(); i++) {
      final char c = s1.charAt(i);
      Integer newValue = 1;
      final Integer originalValue = map.get(c);
      if(originalValue != null){
        newValue=originalValue+1;
      }
      map.put(c, newValue);
    }
    for (int i = 0; i < s2.length(); i++) {
      if (map.get(s2.charAt(i)) == null) {
        return false;
      }
    }
    return true;
  }



  private static boolean isPermutationBySorting(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    return sortString(s1).equals(sortString(s2));
  }

  private static String sortString(String s) {
    char[] charArray = s.toCharArray();
    Arrays.sort(charArray);
    return new String(charArray);
  }

  public static void main(String[] args) {
    System.out.println("same strings should return---> " + isPermutationByHashMap("apple", "apple"));
    System.out.println("different strings should return---> " + isPermutationByHashMap("apple", "ppble"));

    System.out.println("same strings should return---> " + isPermutationBySorting("apple", "ppale"));
    System.out.println("different strings should return---> " + isPermutationBySorting("apple", "ppble"));

  }

}
