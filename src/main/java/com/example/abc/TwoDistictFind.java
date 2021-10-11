package com.example.abc;

public class TwoDistictFind {

	static void show(int arr[]) {
		int xor = 0,res1=0,res2=0;
		for(int i=0;i<arr.length;i++)
			xor=xor^arr[i];
		int sn=xor & ~(xor-1);
		for(int i=0;i<arr.length;i++)
		{
			if((sn&arr[i])==0)
				res1=res1^arr[i];
			else
				res2=res2^arr[i];
		}
		System.out.println(res1+"  "+res2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {18, 24, 24, 21, 10, 29, 8, 10, 29, 18};
		show(arr);
	}

}
