package com.example.abc;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static List<String> powerSet(String s,int n) {
		System.out.println((1<<n));
		List<String>lists=new ArrayList<String>();
		char a[]=s.toCharArray();
		for(int i=0;i<(1<<n);i++)
		{
			String d="";
			for(int j=0;j<n;j++) {
				if ((i & (1 << j)) > 0) {
                    System.out.print(a[j] + " ");
                    d=d+a[j];
                    lists.add(d);
				}
			}
			System.out.println();
			
		}
		System.out.println(lists);
		return lists;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
		powerSet(a,a.length());
	}

}
