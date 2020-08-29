package com.onlineClass.warmup;

import java.util.Scanner;

class areaOfRectangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of rectangle from keyboard\n");
		int l = sc.nextInt();
		System.out.print("Enter breadth of rectangle from keyboard\n");
		int b = sc.nextInt();
		System.out.println("Area of rectangle = " +l*b);
	}
}