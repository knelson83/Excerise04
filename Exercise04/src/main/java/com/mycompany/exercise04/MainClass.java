
package com.mycompany.exercise04;


public class MainClass {
	
	public static void main(String[] args){
		
		long start;
		long end;
		long duration;
		
		long executionTimeTotal_1 = 0;
		for(int i = 0; i<10; i++){
		 start = System.nanoTime();
		sumToN_1(5);
		 end = System.nanoTime();
		 duration = end - start;
		 executionTimeTotal_1 = executionTimeTotal_1 + duration;
		}
	long average_1 = executionTimeTotal_1/10;	
	System.out.println("Average execution time for implementation 1: " 
	+ average_1 + " nano seconds.");
	
	}
	long executionTimeTotal_2 = 0;
		for(int i = 0; i <10; i++){
		 start = System.nanoTime();
		sumToN_2(5);
		 end = System.nanoTime();
		 duration = end - start;
		 executionTimeTotal_2 = executionTimeTotal_2 + duration;
		}
	long average_2 = executionTimeTotal_2/10;	
	System.out.println("Average execution time for implementation 2: " 
	+ average_2 + " nano seconds.");
	
	}
	
	public static int sumToN_1(int n){
		int sum = 0;
	for(int i = 1; i<n+1; i++){
	sum = sum + i;
	
	}
	
	return sum;
	}
	
	public static int sumTon_2(int n){
		int sum =(n * (n+1))/2;
		return sum;
	}
}

		
		
		
	
	


