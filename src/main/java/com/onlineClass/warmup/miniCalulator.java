package com.onlineClass.warmup;

import java.util.Scanner;

public class miniCalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miniCalulator mc = new miniCalulator();
		mc.pressNumber();

	}
	public void pressNumber() {
		System.out.println("Welcome to Mini Calculator");
		System.out.println("Press\n 1 FOR ADD\n 2 FOR SUBSTRACT\n 3 FOR MULTIPLY\n 4 FOR DIVIDE");
		Scanner sc = new Scanner(System.in);
		int optr = sc.nextInt();
		operation(optr);
	}

	public void operation(int optr) {

		if(optr==0) {
			System.out.println("Calculator power off. Please Restart the Calculation");
			System.exit(0);
		}else if(optr>4 || optr<0) {
			System.out.println("INVALID PRESS. PLEASE PRESS AGAIN");
			pressNumber();
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two number");	
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(optr==1) {
				System.out.println(a+b);
				pressNumber();
			}else if(optr==2) {
				System.out.println(a-b);
				pressNumber();
			}else if(optr==3) {
				System.out.println(a*b);
				pressNumber();
			}else if(optr==4) {
				float result = a/b;
				System.out.println(result);
				pressNumber();
			}
		}
	}
}