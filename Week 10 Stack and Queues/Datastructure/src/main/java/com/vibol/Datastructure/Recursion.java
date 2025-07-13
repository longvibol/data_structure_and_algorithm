package com.vibol.Datastructure;

public class Recursion {
	public static void main(String[] args) {
		int factoriy = factorial(5);
		System.out.println(factoriy);
	}
	
	public static int factorial(int n) {
		int result =1;
		/* option 1
		for(int i =1;i<=n;i++) {
			result = result*i;
		
		}
		*/
		
		for(int i =n; i>=1; i--) {
			result = result*i;		
		}		
		
		return result;
	}
	
	// Recursion
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n * fact(n-1);
	}

}


