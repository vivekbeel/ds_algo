package com.example.abc;

public class NegetiveFirst {

	public static void show(int arr[]) {
		int j = 0,n=arr.length, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-3,1,-2,4,7,-2,-4,-9,3,5,-5};
		show(a);
	}

}
