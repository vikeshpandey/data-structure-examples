package com.example.stringarray;

/**
 * this program converts a string into a url using %20.
 * it also assumes that the string has sufficient space to perform this operation in-space
 * @author vikesh
 *
 */
public class UrlifyString {


	public String urlify(String s, int trueLength){
			char[] arr = s.toCharArray();
			
			for(int i=trueLength-1,j=arr.length-1;i>=0;i--,j--){
				if(arr[i]!=' '){
					arr[j] = arr[i];
				}
				else{
					arr[j--] = '0';
					arr[j--] = '2';
					arr[j] = '%';
				}
			}
			return new String(arr);
	}
	
	public static void main(String[] args) {
		UrlifyString us = new UrlifyString();
		System.out.println(us.urlify("Mr John Smith is good guy          ", 25));
	}

}
