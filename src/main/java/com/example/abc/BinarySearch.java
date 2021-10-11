package com.example.abc;

public class BinarySearch {

	static int show(int a[],int low,int high,int n) {
		if (high >= low) {
			int mid=low+(high-low)/2;
			if(a[mid]==n)
				return mid;
			else if(a[mid]>n)
				return show(a,low,mid-1,n);
			
	            return show(a, mid+1,high,n);
		}
	
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,6,7,8,9,12,13};
		System.out.println(show(a,0,a.length-1,13));
	}

}
