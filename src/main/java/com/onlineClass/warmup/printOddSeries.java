package com.onlineClass.warmup;

import java.util.Scanner;

class printOddSeries{
	public static void main(String args[]){
		int start=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of term");
		int term = sc.nextInt();
		for(int i=1; i<=term; i++){
			System.out.println(start+ " ");
			start = start+2;
		}
	}
}
