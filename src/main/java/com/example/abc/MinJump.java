package com.example.abc;

public class MinJump {

	public static int jump(int a[],int length)
	{
		int jump[] = new int[length];
		if(length==0||a[0]==0)
			return Integer.MAX_VALUE;
		jump[0]=0;
		for (int i = 1; i < length; i++) {
            jump[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (i <= j + a[j] && jump[j] != Integer.MAX_VALUE) {
                    jump[i] = Math.min(jump[i], jump[j] + 1);
                    break;
                }
            }
        }
		
		return jump[length-1];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= { 1, 3, 6, 1, 0, 9 };
		System.out.println(jump(a, a.length));
	}

}
