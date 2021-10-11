package com.example.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PaypalInterview {

	public static int max(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	public static int secondMax(int arr[]) {
		int secondMax=Integer.MIN_VALUE;
		int max=max(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=max) {
				if(secondMax<arr[i])
					secondMax=arr[i];
			}
		}
		return secondMax;
	}
	
	public static void sum(int arr[],int sum) {
		HashSet<Integer> hashSet=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			int n=sum-arr[i];
			if(hashSet.contains(n))
				System.out.println(arr[i]+" "+n);
			else
				hashSet.add(arr[i]);
		}
	}
	
	public static int decodeWays(String str,int n) {
		if(str.length()==0)
			return 0;
		if(str.charAt(0)=='0')
			return 0;
		if(n==0||n==1)
			return 1;
		int count=0;
		if(str.charAt(n-1)>'0')
			count=decodeWays(str,n-1);
		if(str.charAt(n-2)=='1'&&str.charAt(n-2)=='2'||str.charAt(n-1)<'7')
			count+=decodeWays(str, n-2);
		return count;
	}
	
	public static int longestWithoutReaptingString(String str) {
		if(str.length()==0)
			return 0;
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		int start=0;
		int maxLength=0;
		int max=0;
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				start=Math.max(start,map.get(str.charAt(i))+1);
			}
			map.put(str.charAt(i), i);
			maxLength=Math.max(maxLength, i-start+1);
			if(maxLength>max) {
				max=maxLength;
				str1+=str.charAt(i);
			}
		}
		System.out.println(str1+" >> "+max);
		return maxLength;
	}
	
	public static int firstReeatingElement(int a[]) {
		HashSet<Integer> hashSet=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			if(hashSet.contains(a[i]))
				return a[i];
			else
			    hashSet.add(a[i]);
		}
		return -1;
	}
	
	public static boolean isFindSubArray(int a1[],int a2[]) {
		HashSet<Integer> hashSet=new HashSet<Integer>();
		for(int i=0;i<a1.length;i++)
			hashSet.add(a1[i]);
		int a1length=hashSet.size();
		for(int i=0;i<a2.length;i++)
			hashSet.add(a2[i]);
		if(hashSet.size()!=a1length)
			return false;
		return true;
	}
	
	public static void missingElement(int a[],int low,int high) {
		int n=a.length;
		HashSet<Integer> hashSet=new HashSet<Integer>();
		for(int i=0;i<n;i++) 
			hashSet.add(a[i]);
		for(int i=low;i<high;i++)
			if(!hashSet.contains(i))
				System.out.println(i);
			
	}
	
	public static boolean checkReverse(int a[]) {
		if(a.length==1)
			return true;
		int temp[]=new int[a.length];
		for(int i=0;i<a.length;i++)
			temp[i]=a[i];
		Arrays.sort(temp);
		int front=0;
		for(front=0;front<a.length;front++) {
			if(temp[front]!=a[front])
				break;
		}
		int back=0;
		for(back=a.length-1;back>0;back--) {
			if(temp[back]!=a[back])
				break;
		}
		if(front>=back)
			return true;
		do {
			front++;
			if(a[front-1]<a[front])
				return false;
		}while(front!=back);
		return true;
	}
	
	public static boolean checkReverse1(int a[]) {
		int n=a.length;
		if(n==1)
			return true;
		int i;//{1,2,5,4,3}
		for(i=1;a[i-1]<a[i]&&i<n;i++) {
			if(i==n)
				return true;
		}
		int j=i;
		while(j<n&&a[j]<a[j-1]) {
			
			if(i>1&&a[j]<a[i-2])
				return false;
			j++;
		}
		if(j==n)
			return true;
		int k=j;
		if(a[k]<a[i-1])
			return false;
		while(k>1&&a[k]<a[k-1]) {
			if(a[k]<a[k-1])
				return false;
			k++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,2,3,6,8,5,9};
		int arr1[]= {7,1,5,-1};
		int x=6;
		System.out.println(secondMax(arr));
		sum(arr1, x);
		System.out.println(decodeWays("226", 3));
		System.out.println(longestWithoutReaptingString("geeksforgeeks"));
		int arr2[] = {10, 5, 3, 4, 3, 5, 6,5};
		System.out.println(firstReeatingElement(arr2));
		int a1[]={ 11, 1, 13, 21, 3, 7 };
		int a2[]={ 11, 3, 7, 1 };
		System.out.println(isFindSubArray(a1, a2));
		int a[]={10, 12, 11, 15};
		missingElement(a,10,15);
		int a_1[]= {1,2,3,4,20,9,16,17};
		System.out.println(checkReverse1(a_1));
	}

}
