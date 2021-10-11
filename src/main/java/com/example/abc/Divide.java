package com.example.abc;

public class Divide {

	
	public static int show(int x,int y) {
		int a=0;
		int sign = ((x < 0) ^  (y < 0)) ? -1 : 1;
		x = Math.abs(x);  
		y = Math.abs(y); 
		while(x>=y) {
			x=x-y;
			a++;
		}
		return sign*a;
	}
	
	public static int show1(int x,int y) {
		int sign = ((x < 0) ^  (y < 0)) ? -1 : 1;
		x = Math.abs(x);  
		y = Math.abs(y);
		int quotient = 0, temp = 0; 
		for (int i = 64; i >= 0; --i)  
		{  
		  
		    if (temp + (y << i) <= x)  
		    {  
		        temp += y << i;  
		        quotient |= 1 << i;  
		    }  
		} 
		return sign*quotient;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(show1(10, -3));
	}

}
