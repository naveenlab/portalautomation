package com.onlineClass.warmup;

import java.util.Scanner;

class fibonacci {

	public static void main(String[] args) {
		System.out.print("Enter number");
		int t1 = 0, t2 = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("First " + n + " terms: ");

		for (int i = 1; i <= n; ++i)
		{
			int sum = t1 + t2;
			t1 = t2;
			System.out.print(t1+" ");	
			t2 = sum;
		}
	}
}
