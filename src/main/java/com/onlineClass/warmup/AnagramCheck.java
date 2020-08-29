package com.onlineClass.warmup;

import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
	}
	
	 static boolean isAnagram(String a, String b) {
	        // Complete the function\
		 boolean flag = true;
		 int[] al = new int[256];
		 int[] bl = new int[256];
		 
		 for(char c: a.toCharArray()) {
			 int index = (int)c;
			 al[index]++;
		 }
		 
		 for(char c: b.toCharArray()) {
			 int index = (int)c;
			 bl[index]++;
		 }
		 
		 for(int i = 0; i<256; i++) {
			 if(al[i] != bl[i]) {
				 flag = false;
				 break;
			 }
		 }
		 
		 return flag;
		
	    }

}
