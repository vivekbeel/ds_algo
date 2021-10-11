package com.example.abc;

import java.util.Arrays;

public class KthValue {

	public static int show(int a[], int b) {
		Arrays.sort(a);

		return a[b - 1];
	}

	public static int partition(Integer[] arr, int l, int r) {
		int x = arr[r], i = l;
		for (int j = l; j < r ; j++) {
			if (arr[j] <= x) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
			}
		}

		int temp = arr[i];
		arr[i] = arr[r];
		arr[r] = temp;
		return i;
	}

	public static int kthSmallest(Integer[] arr, int l, int r, int k) {
		if (k > 0 && k <= r - l + 1) {
			int pos = partition(arr, l, r);
			if (pos-l == k - 1)
				return arr[pos];
			else if (pos - l > k - 1)
				return kthSmallest(arr, l, pos - 1, k);
			return kthSmallest(arr, pos + 1, r, k - (pos - l + 1));
		}
		return Integer.MAX_VALUE;
	}

	static int pert(int a[],int l,int h) {
		int par=a[h];
		int j=l;
		for(int i=l;i<h;i++) {
			if(a[i]>par) {
				a[i]=a[i]^a[j];
				a[j]=a[i]^a[j];
				a[i]=a[i]^a[j];
				j++;
			}
		}
		a[j]=a[h]^a[j];
		a[h]=a[h]^a[j];
		a[j]=a[h]^a[j];
		return j+1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
    { 
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 4, 19, 26,1 }; 
        int k = 3; 
        System.out.print("K'th smallest element is " + kthSmallest(arr, 0, arr.length - 1, k)); 
    } 

}
