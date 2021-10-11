package com.example.interview;

import java.util.Arrays;

public class unicommerse {

	public static boolean anagram(String str1,String str2) {
		int n=str1.length();
		int m=str2.length();
		boolean res=false;
		if(n!=m)
			return false;
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		str1=new String(ch1);
		Arrays.sort(ch2);
		str2=new String(ch2);
		
		if(str1.equals(str2));
			res= true;
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="race";
		String str2="care";
		System.out.println(anagram(str1, str2));
	}

}
