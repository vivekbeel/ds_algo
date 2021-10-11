package com.example.abc;

public class CopySetBits {

	
	public static int show(int x,int y,int l,int r) {
		if (l < 1 || r > 32) 
		      return -1; 
		for (int i=l; i<=r; i++) 
		{
			int mask = 1 << (i-1);
			//if ((y&mask)) 
		    x = x | mask;
	    }
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(show(8, 13, 1, 2));
	}

}
