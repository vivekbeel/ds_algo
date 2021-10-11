package com.example.abc;

public class BitDiffrence {

	static int bitDiff(int a,int b) {
		int n=a^b;
		int count=0;
		while(n>0) {
			n=n&(n-1);
			System.out.println(n);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bitDiff(10, 20));
	}

}
