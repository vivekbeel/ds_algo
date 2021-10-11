package com.example.array;

public class FindKthMinMax {

	public static int partition(int arr[], int l, int h) {
		int i=l;
		int pivot=arr[h];
		for(int j=l;j<h;j++) {
			if(pivot<=arr[j]) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
			}
		}
		int temp=arr[i];
		arr[i]=arr[h];
		arr[h]=temp;
		
		return i;
	}

	public static int findKthMinMax(int arr[], int k) {
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			int p=partition(arr, l, r);
			if(p==k-1)
				return arr[p];
			else if(p>k-1)
				r=p;
			else
				l=p;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 10, 4, 3, 20, 15 };
		int k = 3;
		System.out.println(findKthMinMax(arr, k));
	}

}
