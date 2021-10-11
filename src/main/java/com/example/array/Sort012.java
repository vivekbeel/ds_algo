package com.example.array;

public class Sort012 {

	public static void sort012(int arr[]) {
		int low=0,temp=0,high=arr.length-1;
		int mid=0;
		while(high>=mid) {
			switch(arr[mid]){
			case 0:{
				temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low++;
				mid++;
				break;
			}
			case 1:{
				mid++;
				break;
			}
			case 2:{
				temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
				break;
			}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+", ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,0,0,0,2,2,2,1,0};
		sort012(arr);
	}

}
