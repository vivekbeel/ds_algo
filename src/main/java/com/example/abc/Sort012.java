package com.example.abc;

public class Sort012 {

	static void sort(int a[]) {
		int low=0,mid=0,high=a.length-1;
		while(mid<=high) {
			switch(a[mid]) {
				case 0:{
					a[low]=a[low]+a[mid];
					a[mid]=a[low]-a[mid];
					a[low]=a[low]-a[mid];
					low++;
					mid++;
					break;
				}
				case 1:{
					mid++;
					break;
				}
				case 2:{
					a[mid]=a[high]+a[mid];
					a[high]=a[mid]-a[high];
					a[mid]=a[mid]-a[high];
					high--;
					break;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,0,1,2,0,0,0,1,2,1,2};
		sort(a);
	}

}
