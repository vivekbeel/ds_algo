package com.example.abc;

import java.util.HashSet;

public class SumDiff {

	
	public static void sumDeff(int arr[],int sum) {
		HashSet<Integer> hashSet=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			int n=sum-arr[i];
			hashSet.add(arr[i]);
			if(hashSet.contains(n))
				System.out.println(arr[i]+" "+n);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,10,2};
		sumDeff(arr, 12);
	}

}
