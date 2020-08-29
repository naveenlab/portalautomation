package com.onlineClass.warmup;

import java.util.Scanner;

class firstNPrimeNo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number less than 999999999");
		int num = sc.nextInt();
		
		if(num>=999999999 || num <1) {
			System.out.println("Invalid number");
		}
		else {
			int count = 0;
			for (int i=2;i<=999999999;i++) {
				if(primeCheck(i)) {
					count++;
					if(count == num) {
						break;
					}
				}

			}

		}

	}



	public static boolean primeCheck(int n) {
		boolean flag=true;
		for(int j=2;j<=n/2;j++) {
			if(n%j==0) {
				flag = false;
			}
		}
		if(flag==true) {
			System.out.print(n+" ");
			flag = true;
		}
		return flag;
	}
}
