package com.example.abc;


public class DetectLoop {
	Node head;
	static class Node {
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            next = null;
        }
    }
	
	
	void detectLoop()
    {
		Node slow=head,fast=head;
		int flag=0;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				System.out.println("loop find");
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("loop find");
		else
			System.out.println("loop not found");
    }
	
	static int countNodes( Node n) 
	{ 
		int res=0;
		Node temp=n;
		while(temp.next!=n) {
			res++;
			temp=temp.next;
		}
		return res;
	} 
	
	public int firstDetectLoop(Node node) {
		Node slow=node,fast=node;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next; fast=node.next.next;
			if(slow==fast)
				return countNodes(slow);
		}
		return 0;
	}
	
	static void detectRemoveLoop(Node head) 
    {   Node slow= head,fast = head; 
      
        while (fast!=null && fast.next!=null) { 
            slow = slow.next; 
            fast = fast.next.next; 
            if (slow == fast) { 
                break; 
            } 
        } 
        if(slow!=fast)
            return;
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;  
        Node curr=head;
        while(curr!=null) {
        	System.out.println(curr.data+" ");
        	curr=curr.next;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node llist = new Node(20);
		llist.next=new Node(4);
		llist.next.next=new Node(15);
		llist.next.next.next=new Node(10);
		llist.next.next.next.next=llist.next;
		detectRemoveLoop(llist);
	}

}
