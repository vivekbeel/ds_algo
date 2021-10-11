package com.example.abc;

public class DiameterBinaryTree {
	
	static class Node{
		int key;
		Node left;
		Node right;
		Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	static int res=0;
	public static int diameter(Node root) {
		if(root==null)
			return 0;
		int lh=diameter(root.left);
		int rh=diameter(root.right);
		res=Math.max(res, 1+rh+lh);
		return 1+Math.max(lh, rh);
	}
	
	public static int isBST(Node root) {
		if(root==null)
			return -1;
		int lh=isBST(root.left);
		if(lh==-1)
			return -1;
		int rh=isBST(root.right);
		if(rh==-1)
			return -1;
		if((Math.abs(lh-rh))>1)
			return -1;
		else return Math.max(lh, rh)+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(60);
	    root.right.left.left=new Node(50);
	    root.right.right.right=new Node(70);
	    System.out.println("Height: "+diameter(root));
    	System.out.println("Diameter: "+res);
    	System.out.println(isBST(root));
	}

}
