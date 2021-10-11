package com.example.abc;

public class PositionOfSetBit {

	
	static int findPosition(int N) {
        // code here
        if(N==0)
           return -1;
         if(((N&(N-1))==0)){
             int pos=0;
             while(N>0){
                 N=N>>1;
                 pos++;
             }
             return pos;
         }
         else
             return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPosition(8));
	}

}
