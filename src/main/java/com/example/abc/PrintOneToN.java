package com.example.abc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintOneToN {

	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(s->System.out.println(s));
		
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> lists=number.stream().map(x->x*x).collect(Collectors.toList());
		number.stream().map(x->x*x).forEach(y->System.out.println(y));
		
		List<Integer> ug=number.stream().map(x->x*x).collect(Collectors.toList());
		List<Integer> ioihw=number.stream().filter(x->x>3).collect(Collectors.toList());
		List<Integer> uio=number.stream().sorted().collect(Collectors.toList());
		List<Integer> oioi=number.stream().filter(x->x%2==0).collect(Collectors.toList());
	}
	
	

}
