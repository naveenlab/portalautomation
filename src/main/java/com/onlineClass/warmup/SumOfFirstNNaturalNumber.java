package com.onlineClass.warmup;

import java.util.Scanner;

class SumOfFirstNNaturalNumber{
	public static void main(String args[]){
		System.out.println("====Sum Of First Nth Natural Number=====");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of term  ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i =1; i<=n;i++){
			sum = sum+i;
		}
		System.out.println("Sum of first "+n+ " term = " +sum);	
	}
}