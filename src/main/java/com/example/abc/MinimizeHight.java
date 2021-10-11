package com.example.abc;

import java.util.Arrays;

public class MinimizeHight {

	static int getMinDiff(int arr[], int n, int k) 
    { 
        if (n == 1) 
        return 0; 
        Arrays.sort(arr); 
        int ans = arr[n-1] - arr[0]; 
        int small = arr[0] + k; 
        int big = arr[n-1] - k; 
        int temp = 0; 
        if (small > big) 
        { 
            temp = small; 
            small = big; 
            big = temp; 
        } 
        for (int i = 1; i < n-1; i ++) 
        { 
            int subtract = arr[i] - k; 
            int add = arr[i] + k; 
            if (subtract >= small || add <= big) 
                continue; 
            if (big - subtract <= add - small) 
                small = subtract; 
            else
                big = add; 
        } 
  
        return Integer.min(ans, big - small); 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 15, 10};
		System.out.println(getMinDiff(a,a.length,5));
	}

}
