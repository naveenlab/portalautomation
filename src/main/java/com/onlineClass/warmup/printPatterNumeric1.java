package com.onlineClass.warmup;

import java.util.Scanner;

public class printPatterNumeric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of row");
		int row = sc.nextInt();

		for(int i = 1; i<=row;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("\n");
		}

	}

}
