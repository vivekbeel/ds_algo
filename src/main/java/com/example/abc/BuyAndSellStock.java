package com.example.abc;

public class BuyAndSellStock {

	public static int buyAndSellSock(int a[]) {
		int n = a.length;
        int cost = 0;
        int maxCost = 0;
 
        if (n == 0) {
            return 0;
        }
        int min_price = a[0];
		for(int i=0;i<a.length;i++) {
            min_price = Math.min(min_price, a[i]);
            cost = a[i] - min_price;
            maxCost = Math.max(maxCost, cost);
		}
		return maxCost;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,1,5,3,6,4};
		System.out.println(buyAndSellSock(a));
	}

}
