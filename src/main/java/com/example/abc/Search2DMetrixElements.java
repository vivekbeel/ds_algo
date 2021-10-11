package com.example.abc;

public class Search2DMetrixElements {

	public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target)
                    return true;
                
            }
        }
        return false;
    }
	
	public static boolean searchMatrix1(int[][] matrix, int target) {
        int i=0,r=3,c=4,j=c-1;
        System.out.println(matrix.length);
        while(i<r && j>=0) {
        	if(matrix[i][j]==target)
        		return true;
        	else if(matrix[i][j]>target)
        		j--;
        	else
        		i++;
        }
		
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(searchMatrix1(matrix,3));
	}

}
