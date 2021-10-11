package com.example.abc;

public class SwepingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};
		for(int j=0;j<2;j++)
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i]+a[i-1];
			a[i-1]=a[i]-a[i-1];
			a[i]=a[i]-a[i-1];
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
