package com.onlineClass.warmup;

import java.util.Scanner;

public class sumOfArrayElement {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int term = sc.nextInt();
		int n[] = new int[term];
		System.out.println("Enter values for all terms");
		for (int i=0;i<term;i++) {
			n[i]= sc.nextInt();
			sum=sum+n[i];

		}
		System.out.println("sum of all element in Array = "+sum);
		

	}

}

