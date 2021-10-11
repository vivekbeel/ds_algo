package com.example.abc;

import java.util.Arrays;

public class interview {
	public static int findCoin(int coins[],int sum,int end) {
		Arrays.parallelSort(coins);
		int res=sum;
		if(sum==0)
			return res;
			if(res!=0&&sum>=coins[end]) {
				res = sum - coins[end];
				if(res/coins[end]>=1) {
					findCoin(coins, res, end);
					System.out.println(coins[end]+" "+res/coins[end]+1);
				}
				else {
					findCoin(coins, res, end-1);
					System.out.println(coins[end]+" "+res/coins[end]+1);
				}
				
			}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[]= {1,2,5,10};
		int sum=37;
		findCoin(coins, sum,coins.length-1);
	}

}
