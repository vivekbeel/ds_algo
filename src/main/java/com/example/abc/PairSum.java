package com.example.abc;

import java.util.HashSet;

public class PairSum {

	static boolean show(int a[],int x) {
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==x)
					return true;
			}
		return false;
	}
	
	static void pairSum(int a[],int sum) {
		HashSet<Integer> set =new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			int temp=sum-a[i];
			if(set.contains(temp)) {
				System.out.println(temp+" "+a[i]);
			}
			set.add(a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11, 15, 6, 8, 9, 10};
		System.out.println(show(a, 11));
		pairSum(a, 14);
	}

}
