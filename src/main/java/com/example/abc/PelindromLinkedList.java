package com.example.abc;

public class PelindromLinkedList {

	static class Node{
		int data;
		Node next;
		Node(int x){
			this.data=x;
			next = null;
		}
	}
	
	public static boolean pelindromLL(Node root) {
		if(root==null||root.next==null)
			return true;
		Node curr=root,slow=root,fast=root;
		while(fast.next!=null&&fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		
		Node rev = reverse(slow.next);
		while(rev!=null) {
			if(curr.data!=rev.data)
				return false;
			curr=curr.next;
			rev=rev.next;
		}
		return true;
	}
	
	public static Node reverse(Node root) {
		Node curr=root;
		Node prev=null,next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		root=prev;
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node =new Node(10);
		node.next =new Node(20);
		node.next.next =new Node(10);
		System.out.println(pelindromLL(node));
	}

}
