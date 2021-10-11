package com.example.abc;

import java.util.HashMap;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is vivek and vivek is a software engineer";
		String str1[]=str.split(" ");
		HashMap<String,Integer>hashMap=new HashMap<String, Integer>();
		for(int i=0;i<str1.length;i++) {
			if(hashMap.containsKey(str1[i])) {
				hashMap.put(str1[i], hashMap.get(str1[i])+1);
			}
			else {
				hashMap.put(str1[i], 1);
			}
		}
		
		System.out.println(hashMap);
		
	}

}
