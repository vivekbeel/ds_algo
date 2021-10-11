package com.example.demo;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class menu {
	public static void main(String[] args) { 
		String s="Java";
		ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
	       
        map.put("Geeks",246);
        map.put("GeeksforGeeks",246);
        map.put("Java", 200);
        map.put("Java 8",200);
        map.put("Threads", 300);
        Set<String> hashSet = map.keySet();

		
		for(String a:hashSet) {
			if(s.equalsIgnoreCase(a)) {
				System.out.println(a);
				hashSet.remove(a);
			}
		}
		System.out.println(hashSet);
	}    
} 
