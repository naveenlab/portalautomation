package com.onlineClass.warmup;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecLargestUsingSingleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secLargest();

	}
	
	
	
	public static void secLargest() {
		
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of Element in Array");
			int eleCount = sc.nextInt();
			if(eleCount<2) {
				System.out.println("\nSorry, Number of Element Should be more than one.");
				System.exit(0);
			}
			int[] arr = new int[eleCount];
			System.out.println("Enter Element in Array" );
			for(int i=0;i<eleCount;i++) {
				arr[i]=sc.nextInt();
			}
			
			for(int i = 1;i<arr.length;i++) {
				if(arr[i] > arr[i-1] ) {
					arr[i]=arr[i]+arr[i-1];
					arr[i-1]= arr[i]-arr[i-1];
					arr[i]=arr[i]-arr[i-1];
					i=0;
					 
				}
				
			}
			System.out.println("Second Largest Element: "+arr[1]);								
	}

}
