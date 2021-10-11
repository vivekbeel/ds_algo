package com.example.abc;

public class LargestSum {

	public static void largestSum3(int a[],int b) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<b;j++) {
				int currentSum=0;
				for(int k=i;k<=b;k++) {
					currentSum+=a[k];
				}
				if(max<currentSum)
					max=currentSum;
			}
		}
		System.out.println(max);
	}
	
	public static void largestSum2(int a[],int b) {
		int max=Integer.MIN_VALUE;
		int sum[]=new int[a.length];
		sum[0]=a[0];
		for(int i=1;i<a.length;i++)
			sum[i]=sum[i-1]+a[i];
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<b;j++) {
				int currentSum=0;
				currentSum=sum[j]-sum[i]+a[i];
				if(max<currentSum)
					max=currentSum;
			}
		}
		System.out.println(max);
	}
	
	public static void largestSum1(int a[],int b) {
		int max=Integer.MIN_VALUE;
		int currentSum=0;
		for(int i=0;i<b;i++) {
			currentSum+=a[i];
			if(max<currentSum)
				max=currentSum;
			if(currentSum<0)
				currentSum=0;
		}
		System.out.println(max);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-1,1,4,-2,4,-1,3,5,-6};
		largestSum2(a, 3);
	}

}
