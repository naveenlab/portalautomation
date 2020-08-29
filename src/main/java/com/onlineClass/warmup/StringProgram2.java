package com.onlineClass.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class StringProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountVowelAndConsonant();
		removeWhiteSpaces("Ram Mohan Sita");
		removeWhiteSpaces2("Ram Mohan Sita2");
		System.out.println(isPolindrome("AMA"));
		//printDuplicateWOrd("I am going to Patna I is great city Patna");
		findSmallestAndLargestWOrdInSTring("Learning java is great");
		swappingString("Naveen", "Kumar");
	}
	
	public static void CountVowelAndConsonant(){
		int vc = 0;
		int cc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next().toLowerCase();
		char[] ch = str.toCharArray();
		for(int i = 0; i<ch.length; i++) {
			if(ch[i]=='a' || ch[i]=='i' || ch[i]=='e' || ch[i]=='o' || ch[i]=='u' ) {
				vc = vc+1;	
			}else if (ch[i] >= 97 && ch[i]<=122){
				cc = cc+1;
			}
				
		}
		
		System.out.println("vowel = "+vc+" and "+"consonant = "+cc);
	}
	
	public static void removeWhiteSpaces(String str) {
		String str2 = str.replace(" ", "");
		System.out.println(str2);
	}
	
	public static void removeWhiteSpaces2(String str) {
		String[] str1 = str.split(" ");
		String res="";
		for(int i=0;i<str1.length;i++) {
			res=res+str1[i];
		}
		System.out.println(res);
		
		
	}
	
	
	public static boolean isPolindrome(String str) {
		String res = "";
		char[] ch = str.toCharArray();
		for(int i = ch.length-1; i>=0; i--) {
			res=res+ ch[i];
		}
		
		System.out.println(res);
		if(res.equalsIgnoreCase(str)) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
	
	public static void printDuplicateWOrd(String str) {
		
		//pending
			
		}
	public static void findSmallestAndLargestWOrdInSTring(String str) {
		
		
		String[] str1 = str.split(" ");
		String smallest =str1[0];
		String greatest =str1[0];
		for(int i = 0; i< str1.length-1;i++) {
			if(smallest.length()>str1[i].length()) {
				smallest=str1[i];
			}
			
			if(greatest.length()<str1[i].length()) {
				greatest=str1[i];
			}
		}
		
		System.out.println("smallest: " + smallest);
		System.out.println("greatest: " + greatest);
			
		
		
	}
	
public static void swappingString(String a, String b) {
	
a=a+b;
b=a.substring(0, a.length()-b.length());
a=a.substring(b.length());
System.out.println(a+" "+b);							
	}
				
}
