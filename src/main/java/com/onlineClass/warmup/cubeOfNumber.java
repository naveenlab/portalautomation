package com.onlineClass.warmup;

import java.util.Scanner;

class cubeOfNumber{
	public static void main(String args[]){
		int mult=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("Enter power on number");
		int power = sc.nextInt();
		for(int i=1;i<=power;i++){
			mult=mult*num;
		}
		System.out.println("Result = " +mult);

	}
}
