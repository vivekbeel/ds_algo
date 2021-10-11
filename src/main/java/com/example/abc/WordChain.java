package com.example.abc;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class WordChain {

	

static int shortestChainLen(String start, String target, Set<String> wordSet) 
{ 
    if (!wordSet.contains(target)) 
        return 0; 
    int level = 0, wordlength = start.length(); 
  
    Queue<String> Q = new LinkedList<>(); 
    Q.add(start); 
  
    while (!Q.isEmpty()) 
    { 
        ++level; 
        int sizeofQ = Q.size(); 
        for (int i = 0; i < sizeofQ; ++i)  
        { 
            char []word = Q.peek().toCharArray(); 
            Q.remove(); 
            for (int pos = 0; pos < wordlength; ++pos) 
            { 
                char orig_char = word[pos]; 
                for (char c = 'a'; c <= 'z'; ++c) 
                { 
                    word[pos] = c; 
                    if (String.valueOf(word).equals(target)) 
                        return level + 1; 
                    if (!wordSet.contains(String.valueOf(word))) 
                        continue; 
                    wordSet.remove(String.valueOf(word)); 
                    Q.add(String.valueOf(word)); 
                } 
                word[pos] = orig_char; 
            } 
        } 
    } 
  
    return 0; 
}
	
	public static void main(String[] args) {
		Set<String> wordSet = new HashSet<String>(); 
		wordSet.add("coins"); 
		wordSet.add("corns"); 
		wordSet.add("cores"); 
		wordSet.add("cones"); 
		wordSet.add("coney"); 
		wordSet.add("money"); 
		Scanner in = new Scanner(System.in);
	    String start = in.nextLine(); 
	    in = new Scanner(System.in);
	    String target = in.nextLine(); 
	    System.out.print("Length of shortest chain is: "
	        + shortestChainLen(start, target, wordSet)); 
	}

}
