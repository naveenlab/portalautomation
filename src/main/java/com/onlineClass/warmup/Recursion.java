package com.onlineClass.warmup;

import java.util.Scanner;

public class Recursion {
	
	int Recursion = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println(lengthOfString("Javaw"));
		 * System.out.println(factorialres(5)); for (int i = 1; i<=10; i++ ) {
		 * System.out.print(fab(i)+" "); }
		 */
		
		//table
		int i = 2;
		table(10, i);

	}
	
	
	public static int lengthOfString(String str) {
		if(str.equals("")) {
			return 0;
		}else {
			return lengthOfString(str.substring(1))+1 ;
		}
		
		
	}
	
	public static int factorialres(int n) {
		if(n==1) {
			return 1;
		}else if(n==0) {
			return 0;
		}else {
			return factorialres(n-1)*n;
		}
		
	}
	
	public static int fab(int n) {
		if(n==1) {
			return 0;
		}else if(n==2) {
			return 1;
		}else {
			 
			return fab(n-1)+fab(n-2);
		}
		
	}

	
	public static int table(int n, int i) {
		
		if(i>10) {
			System.out.println("");
			return 0;
		}else {
			System.out.println(n+" * "+i+ "=" +n*i );
			return table(n, i+1);
		}
		
		
		
	}
	
}
