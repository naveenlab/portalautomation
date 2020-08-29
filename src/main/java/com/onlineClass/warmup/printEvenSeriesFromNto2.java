package com.onlineClass.warmup;

import java.util.Scanner;

class printEvenSeriesFromNto2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting number");
		int start = sc.nextInt();
		System.out.print("Enter Ending number");
		int end = sc.nextInt();
		while(start>=end){
			System.out.println(start+ "");
			start=start-2;

		}
	}
}