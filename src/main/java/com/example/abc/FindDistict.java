package com.example.abc;

public class FindDistict {

	static void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			int count =0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j])
					count++;
			}
				if(count==1) {
					System.out.println(a[i]);
					//System.out.println(a[i+1]);
					//break;
				}
			
		}
		
	}
	
	static void show1(int a[]) {
		int xor=0;
		for(int i=0;i<a.length;i++)
			xor=xor^a[i];
		System.out.println(xor+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 3, 2, 1, 4,5};
		FindDistict.show1(a);
	}

}
