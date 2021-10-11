package com.example.abc;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[i-1]) {
				a[i]=a[i]+a[i-1];
				a[i-1]=a[i]-a[i-1];
				a[i]=a[i]-a[i-1];
				i=0;
			}
			
		}
		int sum=0;
		int j=a.length-1;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i]*j;
			j--;
		}
		System.out.println(sum);
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
