package com.example.abc;

public class CountTotalSetBit {

	static int totalCountBit(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			count+=countSetBitsUtil(i);
				//count++;
		}
		return count;
	}
	
	static int countSetBitsUtil(int x) {
		if(x<=0)
			return 0;
		return (x%2==0?0:1)+countSetBitsUtil(x/2);
		
	}
	public static int countSetBits(int n){
        int two = 2,ans = 0; 
        int N = n; 
        while(N>0){ 
            ans += (n/two)*(two>>1); 
            if((n&(two-1)) > (two>>1)-1) 
            	ans += (n&(two-1)) - (two>>1)+1; 
            two = two<< 1; 
            N = N >> 1; 
        } 
        return ans; 	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSetBits(17));
	}

}
