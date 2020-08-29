package com.onlineClass.warmup;

import java.util.Scanner;

class primeCheck{
	public static void main(String args[]){
		boolean flag=true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int middle= num/2;

		if(num==0||num==1){
			System.out.println("no prime number");
		}
		else{
			for(int i=2;i<=middle; i++){
				if(num%i==0){
					System.out.println("not prime number");      
					flag=false;
					break;
				}
			}
			if(flag==true){System.out.println("Prime Number");}
		}
	}
}
