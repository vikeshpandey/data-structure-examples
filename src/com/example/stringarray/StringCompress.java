package com.example.stringarray;

public class StringCompress {
//
//	public String compress(String s) {
//
//		Hashtable<Character, Integer> ht = new Hashtable<>();
//		char[] arr = s.toCharArray();
//
//		for (int i = 0; i < arr.length; i++) {
//			if(i>0){
//				if (ht.containsKey(arr[i])) {
//					if(arr[i] == arr[i-1]){
//						ht.put(arr[i], ht.get(arr[i]) + 1);
//					}else{
//						ht.put(arr[i], 1);
//					}
//				}else {
//				ht.put(arr[i], 1);
//				}
//			}else {
//				ht.put(arr[i], 1);
//			}
//		}
//
//		StringBuilder sb = new StringBuilder();
//
//		for (Map.Entry<Character, Integer> e : ht.entrySet()) {
//			sb.append(e.getKey());
//			sb.append(e.getValue());
//		}
//
//		if (s.length() == sb.length()) {
//			return s;
//		} else {
//			return sb.toString();
//		}
//	}

//	public static void main(String[] args) {
//		StringCompress sc = new StringCompress();
//		System.out.println("expected output is: a2b1c5a3, actual is: " + sc.compress("aabcccccaaa"));
//
//	}

public static String compressBad(String str) {
	String compressedString = "";
	int countConsecutive = 0;
	for (int i = 0; i < str.length(); i++) {
		countConsecutive++;
		
		/* If next character is different than current, append this char to result.*/
		if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
			compressedString = compressedString +"" + str.charAt(i) + countConsecutive;
			countConsecutive = 0;
		}
	}
	return compressedString.length() < str.length() ? compressedString : str;
}

public static void main(String[] args) {
	String str = "aabcccccaaa";
	System.out.println(str);
	System.out.println(compressBad(str));
}

}
