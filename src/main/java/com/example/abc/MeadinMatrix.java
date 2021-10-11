package com.example.abc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MeadinMatrix {

	
	public static int meadin(int a[][]) {
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b.add(a[i][j]);
			}
		}
		System.out.println(b);
		Collections.sort(b);
		int mead=b.size()/2+1;
		int meadian= b.get(mead);
		System.out.println(meadian);
		return meadian;
	}
	
	public static int meadin1(int a[][]) {
		int r=3,c=3,min=a[0][0],max=a[0][c-1];
		for(int i=1;i<r;i++) {
			if(min>a[i][0])
				min=a[i][0];
			if(max<a[i][c-1])
				max=a[i][c-1];
		}
		
		int medPos=((c*r)+1)/2;
		while(min<max) {
			int mid=(min+max)/2, midPos=0;
			for(int i=0;i<r;i++) {
				int pos=Arrays.binarySearch(a[i], mid)+1;
				midPos+=Math.abs(pos);
			}
			if(midPos<medPos) 
				min=mid+1;
			else
				max=mid;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1, 3, 5},{2, 6, 9},{3, 6, 9}};
		System.out.println(meadin1(a));
	}

}
