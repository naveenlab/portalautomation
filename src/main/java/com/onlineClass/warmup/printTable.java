package com.onlineClass.warmup;

import java.util.Scanner;

public class printTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print table");
		int n = sc.nextInt();
		if(n>=999999999) {
			System.out.println("Invalid Number");
		}
		else {
			callTable(n);
		}
		

	}

	public static void callTable(int num) {
		
		for (int i = 1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}


