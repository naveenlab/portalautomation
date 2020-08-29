package com.onlineClass.warmup;


public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname = "Sonu Sood"; 
		String text = "I am Engineering Student. I love to play table tennis. I am in Bangalore.";
		findStringLength(text);
		countSentence(text);
		countSentenceMethod2(text);
		NumberOfWords(text);
		NumberOfWordsMethod2(text);
		reverseFnLn(fullname);
		System.out.print(10+10+"Java");
		System.out.print("Java"+10+10);
	}
	
	// length of String
	public static void findStringLength(String text) {
		System.out.println(text.length());// length method for String
		char[] chArray = text.toCharArray();
		int charCount = chArray.length;// length variable
		System.out.println(charCount);
	}
	
	// Count the number of sentence - Method1
	public static void countSentence(String text) {
		String[] str = text.split("\\.");
		System.out.println(str.length);
		
	}
	
	// Count the number of sentence - Method2
	public static void countSentenceMethod2(String text) {
		int count = 0;
		char[] chArray = text.toCharArray();
		for(int i=1; i<chArray.length;i++) {
			if(text.charAt(i)=='.') {
				count++;
			}	
			
		}
		System.out.println(count);
		
	}
	
	//Count the number of Words- Method1
	public static void NumberOfWords(String text) {
		int count = 1;
		char[] chArray = text.toCharArray();
		for(int i=1; i<chArray.length;i++) {
			if(text.charAt(i)==' ') {
				count++;
			}	
			
		}
		System.out.println(count);
		
	}
	
	//Count the number of words - Method2
	public static void NumberOfWordsMethod2(String text) {
			String[] str1 = text.split(" ");
			System.out.println(str1.length);			
	}
	
	public static void reverseFnLn(String fullname) {
		String frev = ""; 
		String lrev = "";
		String[] str =  fullname.split(" ");
		String firstname = str[0];
		String Lastname = str[1];
		System.out.println("First Name: "+firstname+ "and" + "Last Name: "+ Lastname);
		for(int i = firstname.length()-1; i>=0;i--) {
			frev = frev+firstname.charAt(i);
		}
		for(int i = Lastname.length()-1; i>=0;i--) {
			lrev = lrev+Lastname.charAt(i);
		}
		System.out.println("***********************Reverse************************" );
		System.out.println(frev+" "+lrev);
	}
}
