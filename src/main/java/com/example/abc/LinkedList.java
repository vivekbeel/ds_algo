package com.example.abc;

public class LinkedList {

	static class Node{
		int data;
		Node node;
		Node(int data){
			this.data=data;
			node=null;
		}
	}
	
	public static Node insertFirst(Node root,int x) {
		Node temp=new Node(x);
		temp.node=root;
		return temp;
	}
	
	public static Node insertLast(Node root,int x) {
		Node temp=new Node(x);
		Node curr=root;
		while(curr.node!=null) {
			curr=curr.node;
		}
		curr.node=temp;
		return root;
	}
	
	public static void print(Node node) {
		Node curr=node;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.node;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = null;
		node  = insertFirst(node, 20);
		node  = insertFirst(node, 23);
		node  = insertFirst(node, 24);
		node  = insertFirst(node, 21);
		node  = insertLast(node, 20);
		node  = insertLast(node, 23);
		node  = insertLast(node, 24);
		node  = insertLast(node, 21);
		print(node);
	}

}
