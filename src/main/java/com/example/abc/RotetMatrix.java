package com.example.abc;

public class RotetMatrix {

	public static void rotedMatrix(int a[][]) {
		int N=a.length;
		for(int i=0;i<(N/2);i++) {
			for(int j=i;j<(N-i-1);j++) {
				 int temp = a[i][j];
		            a[i][j] = a[N - 1 - j][i];
		            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
		            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
		            a[j][N - 1 - i] = temp;
			}
			
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1, 2, 3},
                {4, 5, 6},
              {7, 8, 9}};
		rotedMatrix(a);
	}

}
