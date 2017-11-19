package com.example.stringarray;

import java.util.Hashtable;
import java.util.Map;

public class StringOneEditAway {
	
	public boolean isEditAway(final String s1, final String s2){
		if(s1.equals(s2)){
			return true;
		}
		
		Hashtable<Character, Integer> ht = new Hashtable<>();
		
		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();
		
		for(int i=0;i<s1Arr.length;i++)
		{
			ht.put(s1Arr[i], 1);
		}

		for(int i = 0; i<s2Arr.length;i++)
		{
			if(ht.get(s2Arr[i]) != null)
			{
				ht.put(s2Arr[i], ht.get(s2Arr[i])+1);
			}
			else
				ht.put(s2Arr[i], 1);
		}

		int count =0;
		for(Map.Entry<Character, Integer> e : ht.entrySet())
		{
			if(e.getValue() == 1)
			{
				count++;
			}
		}

		if(count <= 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		

	public static void main(String[] args) {
		StringOneEditAway soea = new StringOneEditAway();
		System.out.println(soea.isEditAway("pale", "ple"));
		
		System.out.println(soea.isEditAway("pales", "pale"));
		
		System.out.println(soea.isEditAway("pale", "bale"));
		
		System.out.println(soea.isEditAway("pale", "bake"));
		// TODO Auto-generated method stub

	}

}
