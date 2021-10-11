package com.example.abc;

import java.util.HashMap;
import java.util.Map;

public class NByKValue {
	public static int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer
        if(k<1)
            return -1;
        if(k==1)
            return arr.length;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i]))
            map.put(arr[i],1);
        else
            map.put(arr[i],map.get(arr[i])+1);
        
    }
    for (Map.Entry m : map.entrySet()){
        Integer temp = (Integer)m.getValue();
        if(temp>=n/k)
            return (int) m.getKey();
    }
    return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,2,3,3};
		System.out.println(countOccurence(arr, arr.length, 3));
	}

}
