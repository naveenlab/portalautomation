package com.onlineClass.warmup;

import java.util.Scanner;

class checkEvenOdd{
	public static void main(String args[])
	{
	  System.out.println("check if number is even or odd\n");
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter non decimal number\n");
	  int n = sc.nextInt();
	  if(n%2==0){
	  System.out.println("even");
	}
	else{
	   System.out.println("odd");
	}
	  
	}
}