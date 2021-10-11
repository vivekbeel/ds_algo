package com.example.abc;

public class CountSetBit {

	public static int countBit(int n) {
		int res=0;
		while(n>0) {
			n=n&(n-1);
			//if(n%2!=0)
				res++;
			//n=n>>1;
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBit(4));
	}

}
