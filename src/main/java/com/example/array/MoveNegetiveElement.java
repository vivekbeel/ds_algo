package com.example.array;

public class MoveNegetiveElement {

	public static void moveNegetiveElement(int arr[]) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,-1,-3,12,34,-23,-9};
		moveNegetiveElement(arr);
	}

}
