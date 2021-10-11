package com.example.abc;

public class DevesibleByK {
	
	public static int countKdivPairs(int a[],int n,int k ) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]%k==0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 2, 2, 1, 7, 5, 3 };
        int n = 6;
        int K = 4;
        System.out.println(countKdivPairs(A, n, K));
	}

}
