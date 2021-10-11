package com.example.abc;

import java.util.LinkedList;
import java.util.Queue;



class search { 
    
	static class Node  
	{ 
	  int key; 
	  Node left; 
	  Node right; 
	  Node(int k){
	      key=k;
	      left=right=null;
	  }
	}

	
    public static void main(String args[]) 
    { 
    	Node node=new Node(5);
		node.left=new Node(1);
		node.right=new Node(6);
		node.left.left=new Node(7);
		node.left.right=new Node(8);
		node.left.right.right=new Node(9);
		preOrder(node);
    	System.out.println();
        printLeft(node);
    } 
    
    public static void printLeft(Node root){
        if(root==null)
            return;
        Queue<Node > q=new LinkedList<>();q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(i==0)
                    System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
    }

	
	public static void preOrder(Node root) {
		System.out.println(root.key);
		if(root.left!=null)
			preOrder(root.left);
		if(root.right!=null)
			preOrder(root.right);
	}
	
	

}
