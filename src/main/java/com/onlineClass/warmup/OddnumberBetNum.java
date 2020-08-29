package com.onlineClass.warmup;

import java.util.Scanner;

class OddnumberBetNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int n = sc.nextInt();
		System.out.println("Enter second Number");
		int m = sc.nextInt();
		for(int i=n; i<=m; i++){
			if(i%2!=0){
				System.out.println(i+ "");
			}
		}
	}
}
