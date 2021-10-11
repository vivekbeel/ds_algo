package com.example.interview;

@FunctionalInterface
public interface FInterface {
	
		int add();
		
		static int addt() {
			return 0;
		}
		default int addt1() {
			return 0;
		}
	

}
