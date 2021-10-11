package com.example.array;

import java.util.Arrays;

public class CyclicRotedArrayByOne {

	public static void cyclicRotedArrayByOne(int arr[]) {
		int n=arr.length;
		if(n==0)
			return;
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
			arr[i-1]=arr[i];
		arr[n-1]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,2,1,5,7};
		cyclicRotedArrayByOne(arr);
		System.out.println(Arrays.toString(arr));
	}

}
