package com.example.abc;

import java.util.Stack;

public class InfixToPostfix {

	
	static int prev(char ch) {
		switch(ch) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;	
		}
		return -1;
	}
	
	public static String printPostFix(String str) {
		String result="";
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLetterOrDigit(ch))
				result+=ch;
			else if(ch=='(')
				stack.push(ch);
			else if(ch==')'){
				while (!stack.isEmpty()&&stack.peek()!='(') {
					result+=stack.pop();
				}
				stack.pop();
				 
			}
			else {
				while(!stack.isEmpty()&&prev(ch)<=prev(stack.peek()))
					result+=stack.pop();
				stack.push(ch);
			}
			
		}
		while (!stack.isEmpty()) {
			if(stack.peek()=='(')
				return "Invelid String";
			result+=stack.pop();
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(printPostFix("a+b*(c^d-e)^(f+g*h)-i"));
	}

}
