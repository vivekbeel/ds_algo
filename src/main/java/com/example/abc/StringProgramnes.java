package com.example.abc;

import java.util.HashMap;
import java.util.Map;

public class StringProgramnes {

	
	public static void firstNonRepeatingElement(String str) {
		int checer=256;
		char ch[]=new char[checer];
		for(int i=0;i<str.length();i++) {
			ch[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(ch[str.charAt(i)]==1)
			{
				System.out.println(str.charAt(i)+" "+i);
				break;
			}
		}
	}
	
	public static void longestSubString(String str) {
		char ch[]=str.toCharArray();
		int count=0,max=0;
		char c=' ';
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]==ch[i+1]) {
				count++;
			}
			else
				count=1;
			if(count>max) {
				max=count;
				c=ch[i];
			}
		}
		System.out.println(c+" "+max);
	}
	
	public static int decodeString(char ch[],int n) {
		if(ch[0]=='0')
			return 0;
		if(n==0||n==1)
			return 1;
		int count=0;
		if(ch[n-1]=='1')
			count=decodeString(ch, n-1);
		if(ch[n-2]=='1'||ch[n-2]=='2'&&ch[n-1]<'7')
			count+=decodeString(ch, n-2);
		return count;
	}
	
	public static boolean anagram(String str1,String str2) {
		int n=str1.length();
		int m=str2.length();
		int char1=256;
		if(n!=m)
			return false;
		char ch[]=new char[char1];
		for(int i=0;i<n;i++) {
			ch[str1.charAt(i)]++;
			ch[str2.charAt(i)]--;
		}
		for(int i=0;i<char1;i++)
			if(ch[i]!=0)
				return false;
		return true;
	}
	
	public static void reverse(char[] ch,int start,int end) {
		while(start<=end) {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
	}
	
	
	public static char[] reverseString(char[] ch) {
		int start=0;
		for(int end=0;end<ch.length;end++) {
			if(ch[end]==' ') {
				reverse(ch, start, end);
				start=end+1;
			}
		}
		reverse(ch, start, ch.length-1);
		reverse(ch, 0, ch.length-1);
		return ch;
	}
	
	public static int longestUniqueSubsttr(String str) {
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		int start=0,mexlength=0;
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				start=Math.max(start, map.get(str.charAt(i))+1);
			}
			map.put(str.charAt(i), i);
			mexlength=Math.max(mexlength, i-start+1);
		}
		return mexlength;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i like this program very much ";
		System.out.println(reverseString(str.toCharArray()));
		System.out.println(anagram("race", "care"));
		firstNonRepeatingElement("vivek");
		longestSubString("aabbbbeeccc");
		char ch[]= {'1','2','3','4'};
		System.out.println(decodeString(ch, ch.length));
		System.out.println(longestUniqueSubsttr("geeksforgeeks"));
	}

}
