package com.example.abc;

public class PowerOfTwo {

	
	static boolean powerOf2(int n) {
		if(n==0)
			return false;
		return (n&(n-1))==0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerOf2(14));
	}

}
