package com.example.abc;

public class Pattern {

	
	public static void pattern(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=0;i<max;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==0)
					System.out.print(" ");
				else {
					System.out.print("*");
					arr[j]=arr[j]-1;
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,2,5,6,0,1};
		pattern(arr);
	}

}
