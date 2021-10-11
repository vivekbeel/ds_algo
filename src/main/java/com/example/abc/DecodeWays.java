package com.example.abc;

public class DecodeWays {

	public static int decod(char arr[],int n) {
		if(arr[0]=='0')
			return 0;
		
		if(n==0||n==1)
			return 1;
		
		int count=0;
		if(arr[n-1]>'0')
			count=decod(arr, n-1);
		if(arr[n-2]=='1'||arr[n-2]=='2'&&arr[n-1]<'7')
			count+=decod(arr, n-2);
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'1','2','3','4'};
		System.out.println(decod(ch, ch.length));
	}

}
