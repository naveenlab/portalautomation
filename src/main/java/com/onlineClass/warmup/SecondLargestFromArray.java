package com.onlineClass.warmup;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondLargestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secLargest();

	}
	
	
	
	public static void secLargest() {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of Element in Array");
			int eleCount = sc.nextInt();
			if(eleCount<2) {
				System.out.println("\nSorry, Number of Element Should be more than one. \nPlease Try Again.");
				secLargest();
			}
			int[] arr = new int[eleCount];
			System.out.println("Enter "+eleCount+" Element in Array" );
			for(int i=0;i<eleCount;i++) {
				arr[i]=sc.nextInt();
			}
			int temp = 0;
			for(int i = 0;i<arr.length;i++) {
				for(int j = i+1; j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			
					}
			System.out.println("Second Largest Element: "+arr[1]);	
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Argument/Input. Expected:Integer");
		}finally {
			System.out.println("\nPRESS Y TO TRY AGAIN");
			System.out.println("PRESS ANY OTHER KEY TO EXIT");
			Scanner sc2 = new Scanner(System.in);
			String str = sc2.next();
			if(str.equals("Y")) {
				secLargest();
			
			}else {
				System.out.println("\n***EXIT***");
				System.out.println("***THANK YOU***");
				System.exit(0);
			}	
			
		}
		
		
	}

}
