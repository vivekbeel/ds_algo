package com.example.interview;

public class VFirstInterview {
	static int n=10;
	int counter=1;
	public void evenThread() {
		while(counter<n) {
			synchronized (this) {
				while((n&1)==0) {
					try {
						wait(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}
				System.out.println(counter);
				notify();
				counter++;
			}
			
		}
	}
	
	public void oddThread() {
		while(counter<n) {
			synchronized (this) {
				while((n&1)==1) {
					try {
						wait(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}
				System.out.println(counter);
				notify();
				counter++;
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VFirstInterview vFirstInterview=new VFirstInterview();
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				vFirstInterview.evenThread();
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				vFirstInterview.oddThread();
				
			}
		});
		t1.start();
		t2.start();
	}
	

}
