package com.example.interview;

public class glinterview {

	
	public static int fab(int n) {
		if(n<=1)
			return n;
		return fab(n-1)+fab(n-2);
	}
	
	
	public static void fabonacy(int n) {
		if(n<=1)
			return;
		int number1=0,number2=1;//0,1,1,2,3,5,8
		
		while(n>0)
		{
			System.out.println(number1);
			int number3=number1+number2;
			number1=number2;
			number2=number3;
			n--;
		}
		
	}
	int count;
	public  void printHellow() {
		
		while(count>=0)
		{
			synchronized (this) {
				System.out.println("hellow");
				try {
					wait(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				count--;
				notify();
			
			}
			
		}
	}
	
	public void printWorld() {
		while(count>=0)
		{
			synchronized (this) {
				System.out.println("world");
				try {
					wait(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				count--;
				notify();
			
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fabonacy(10);
		/*
		 * for(int i=0;i<10;i++) System.out.println(fab(i));
		 */
		  glinterview gl=new glinterview();
		  gl.count=10; 
		  Thread t1=new Thread(new Runnable() {
		  public void run() 
		  {
			  gl.printHellow();
		  } });
		  
		  Thread t2=new Thread(new Runnable() {
			  public void run() 
			  { 
				  gl.printWorld();
			  } 
			});
		  
		  t1.start(); 
		  t2.start();
		 
	}
}