package com.onlineClass.warmup;

import java.util.Scanner;

class divisibleBy7{
	public static void main(String args[])
	{
		System.out.println("Check if number is divisible by 7 or not");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if(n%7==0){
			System.out.println(n+" is divisble by 7");
		}
		else{
			System.out.println(n+" is not divisble by 7");
		}

	}
}