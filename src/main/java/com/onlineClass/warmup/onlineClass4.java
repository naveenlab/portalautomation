package com.onlineClass.warmup;

import java.util.Scanner;

public class onlineClass4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_A_to_Z();
		print_a_To_Z();
		upper_lower_case_change();
	}
	
	
	
	//Write a program to print A to Z ( by using loop and its acii-code) 
	public static void print_A_to_Z(){
		
		System.out.println("Print A to Z");
		for (int i = 65; i<=90; i++) {
			System.out.print((char)i+ " ");
		}
		System.out.println(" ");
	}
	
	
	//Write a program to print a to z ( by using loop and its acii-code)
	public static void print_a_To_Z(){
		
		System.out.println("Print a to z");
		for (int i = 97; i<=122; i++) {
			System.out.print((char)i+ " ");
		}
		System.out.println(" ");
	}
	
	
	public static void upper_lower_case_change(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter letter: ");
		String ch = sc.next();
		char a = ch.charAt(0);
		if(a>=65 && a<=90) {
			System.out.println((char)(a+'a'-'A'));
		}
		else if(a>=97 && a<=122){
			System.out.println((char)(a-32));
		}
		else {
			System.out.println("Invalid character");
		}
	}

}
