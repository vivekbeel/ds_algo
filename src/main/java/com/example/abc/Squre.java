package com.example.abc;

public class Squre {

	
	public static int squre(int n) {
		int res=0;
		if (n < 0)
            n = -n;
		for(int i=0;i<n;i++)
		{
			res+=n;
		}
		return res;
	}
	
	public static int squre1(int n) {
		if (n < 0)
            n = -n;
		if(n==0)
			return 0;
		int x=n>>1;
		if(n%2!=0) 
			return ((squre1(x) << 2) + (x << 2) + 1);//(2n+1)^2 = (2*x+1)^2 = 4x^2+2x+1   or  4*square(floor(n/2)) + 4*floor(n/2) + 1 
		
		else
			return (squre1(x) << 2);//(2n)^2 = (2*x)^2 = 4x^2  or   square(n) = 4*square(n/2) 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squre1(12));
	}

}
