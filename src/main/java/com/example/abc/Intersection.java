package com.example.abc;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

	public static void printIntersection(int arr1[],int arr2[],int m,int n) {
		int i=0;
		Set<Integer> s1 = new HashSet<Integer>();
		for(i=0;i<arr1.length;i++)
			s1.add(arr1[i]);
		Set<Integer> s2 = new HashSet<Integer>();
		for(i=0;i<arr2.length;i++)
			s2.add(arr2[i]);
		s1.retainAll(s2);
		System.out.println(s1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 9, 1, 9, 1, 9, 1, 0 }; 
        int arr2[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 }; 
        int m = arr1.length; 
        int n = arr2.length; 
        printIntersection(arr1, arr2, m, n); 
	}

}
