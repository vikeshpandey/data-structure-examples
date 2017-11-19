package com.example.stringarray;

import java.util.Arrays;
import java.util.Hashtable;

public class AreStringsPermutations {

	public boolean isPermutationByHashtable(String s1, String s2) {
		Hashtable<Character, Integer> ht = new Hashtable<>(s1.length());
		if (s1.length() != s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {
			ht.put(s1.charAt(i), 1);
		}

		for (int i = 0; i < s2.length(); i++) {
			if (ht.get(s2.charAt(i)) == null) {
				return false;
			}
		}

		return true;
	}

	public boolean isPermutationBySorting(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		return sortString(s1).equals(sortString(s2));
	}

	private String sortString(String s) {
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

	public static void main(String[] args) {
		AreStringsPermutations asp = new AreStringsPermutations();
		System.out.println("same strings should return---> " + asp.isPermutationByHashtable("apple", "ppale"));
		System.out.println("different strings should return---> " + asp.isPermutationByHashtable("apple", "ppble"));
		
		System.out.println("same strings should return---> " + asp.isPermutationBySorting("apple", "ppale"));
		System.out.println("different strings should return---> " + asp.isPermutationBySorting("apple", "ppble"));

	}

}
