package com.onlineClass.warmup;

import java.util.Scanner;

class PrintNNumbersDivisibleByM{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get the table");
		int m = sc.nextInt();
		System.out.println("Enter the number of term you wish to get");
		int n = sc.nextInt();
		for(int i =1; i<=n;i++){
			int result=m*i;
			System.out.println(result + "\n");
		}	
	}
}
