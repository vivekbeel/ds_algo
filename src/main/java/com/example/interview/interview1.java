package com.example.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lists=new ArrayList<Integer>();
		lists.add(0);
		lists.add(1);
		lists.add(0);
		lists.add(1);
		lists.add(0);
		lists.add(1);
		int a=(int) lists.stream().filter(i->i==0).count();
		int b=(int) lists.stream().filter(i->i==1).count();
		System.out.println(a+" "+b);
		
		List<Integer> lists1=new ArrayList<Integer>();
		lists1.add(1);
		lists1.add(2);
		lists1.add(3);
		lists1.add(5);
		lists1.add(8);
		HashSet<Integer> hashSet=new HashSet<Integer>(lists1);
		int n=lists1.get(lists1.size()-1);
				
		for(int i=1;i<n;i++) {
			if(!hashSet.contains(i))
				System.out.println(i+" ");		}
		
	}

}
