package com.example.abc;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minmmaxarr[]= {2,1,4,6,12,3,9,23,5};
		int min=minmmaxarr[0];
		int max=minmmaxarr[0];
		for(int a=0;a<minmmaxarr.length;a++) {
			if(min>minmmaxarr[a])
				min=minmmaxarr[a];
			if(max<minmmaxarr[a])
				max=minmmaxarr[a];
		}
		System.out.println(min+"         "+max);
	}

}
