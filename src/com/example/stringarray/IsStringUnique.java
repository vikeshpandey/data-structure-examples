package com.example.stringarray;

public class IsStringUnique {
	
	public boolean isStringUnique(String s){
		for(int i=0;i<s.length();i++){
			
			char c = s.charAt(i);
			
			for(int j= s.indexOf(c)+1;j<s.length();j++){
				if(c == s.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		IsStringUnique isStringUnique = new IsStringUnique();
		System.out.println(isStringUnique.isStringUnique("abc"));

	}

}
