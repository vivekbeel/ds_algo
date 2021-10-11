package com.example.abc;

public class MinMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,1,5,2,67,12,5};
		int min=a[0];
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("max:: "+max+" min:: "+min);
	}

}
