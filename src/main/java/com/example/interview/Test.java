package com.example.interview;


public class Test{

	public static int diffHrMin(int hour,int min) {
		int h = (hour * 360) / 12 + (min * 360) / (12 * 60);
		int m = (min * 360) / (60);
		int angle = Math.abs(h - m);
		if(angle>180)
			angle=360-angle;
		return angle;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		FInterface f=()->0;
		int x=f.add();
		int y=f.addt1();
		System.out.println(x+" "+y);
		System.out.println(diffHrMin(9, 0));
	}

}
