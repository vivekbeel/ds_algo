package com.example.abc;

public class SpirallyTraversing {

	
	public static void spirallyTraversing1(int a[][],int c,int r) {
		int top=0,left=0,bottom=r-1,right=c-1;
		while(top<=bottom&&left<=right) {
			for(int i=left;i<=right;i++)
				System.out.print(a[left][i]+" ");
			top++;
			for(int i=top;i<=bottom;i++)
				System.out.print(a[i][right]+" ");
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--)
					System.out.print(a[bottom][i]+" ");
				bottom--;
			}
			if(left<=right) {
				for(int i=bottom;i>=top;i--)
					System.out.print(a[i][left]+" ");
				left++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1, 2, 3, 4},
				   {5, 6, 7, 8},
				   {9, 10, 11, 12},
				   {13, 14, 15, 16}};

		spirallyTraversing1(a, 4, 4);
	}

}
