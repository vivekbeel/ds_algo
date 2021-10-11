package com.example.abc;

public class FirstNonReptingString {

	public static void firstNonRepting(String str) {
		char count[]=new char[256];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' '&&count[str.charAt(i)]==1) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstNonRepting("vivekI");
	}

}
