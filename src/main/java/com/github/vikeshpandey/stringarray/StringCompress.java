package com.github.vikeshpandey.stringarray;

/**
 * this program gives the compressed version of a string for example:
 * aaabbaaccddd should give a3b2a2c2d3.
 * 
 * @author vikesh
 *
 */
public class StringCompress {

	public static String compress(String str) {
		StringBuilder compressedStringBuilder = new StringBuilder("");
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;

			/*
			 * If next character is different than current, append this char to
			 * result.
			 */
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedStringBuilder.append("");
				compressedStringBuilder.append(str.charAt(i));
				compressedStringBuilder.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressedStringBuilder.length() < str.length() ? compressedStringBuilder.toString() : str;
	}

	public static void main(String[] args) {
		String str = "aabcccccaaa";
		System.out.println("input string is: " + str);
		System.out.println("String after compression is: " + compress(str));
	}

}
