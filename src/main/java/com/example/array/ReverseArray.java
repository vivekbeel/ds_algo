package com.example.array;

public class ReverseArray {

	public static void reverseArray(int arr[]) {
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,6,4,3,9,0,2};
		reverseArray(arr);
	}

}
