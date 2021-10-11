package com.example.array;

public class FindMaxMinElement {

	public static void findMinMax(int arr[]) {
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
			
		}
		System.out.println(min+"   "+max);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,1,4,5,34,7,2,3};
		findMinMax(arr);
	}

}
