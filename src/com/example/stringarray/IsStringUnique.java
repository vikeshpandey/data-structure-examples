package com.example.stringarray;

/**
 * this program checks if given string has all unique characters.
 * 
 * @author vikesh
 *
 */

public class IsStringUnique {

	public boolean isStringUnique(String s) {
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			for (int j = s.indexOf(c) + 1; j < s.length(); j++) {
				if (c == s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		IsStringUnique isStringUnique = new IsStringUnique();
		System.out.println("String has unique characters, should return true, actual result is: "
				+ isStringUnique.isStringUnique("abc"));
		
		System.out.println("String has non-unique characters, should return false, actual result is: "
				+ isStringUnique.isStringUnique("abca"));

	}

}
