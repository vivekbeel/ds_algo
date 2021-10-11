package com.example.abc;

public class LeanearSearch {

	static int show(int n[],int a) {
		for(int i=0;i<n.length;i++)
		{
			if(a==n[i]) {
				//System.out.println("char found at the chrector of;; "+i);
				return i;
			}
				
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,21,31,42,55,62,71,80};
		//show(n,2);
		System.out.println(show(n, 21));
	}

}
