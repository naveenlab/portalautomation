package com.onlineClass.warmup;

import java.util.Scanner;

public class printLargestNumbetFromArray {

	public static void main(String[] args) {

		int max = 0;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int term = sc.nextInt();
		int n[] = new int[term];
		System.out.println("Enter values for all terms");
		for (int i=0;i<term;i++) {
			n[i]= sc.nextInt();
			if(max<n[i]) {
				max = n[i];
			}
			if(min>n[i]) {
				min = n[i];
			}

		}
		System.out.println("largest number = "+max);
		System.out.println("Smallest number = "+min);

	}

}
