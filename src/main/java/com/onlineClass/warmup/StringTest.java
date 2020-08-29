package com.onlineClass.warmup;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * We will learn some of the Method of String Class which 
			 * is very useful for most of the programs
			 * 1.) + operator --> concatenation
			 * 2.) concat method
			 * Suppose you want to concat (add) two string
			 * then you can use this + operator as well as concat method
			 * 
			 */
			
			String str1 = "ABCD";
			String str2 = "CDEF";
			
			String str3 = str1 + str2; // str3 = "ABCDCDEF"
			System.out.println(str3);
			String str4 = str1.concat(str2); // str4 = "ABCDCDEF"
			System.out.println(str4);
			
			/*if we do like follow 
			 *  str1 + "XYZ"  --> what is the value of str1 ?? 
			 *  
			 *  Here str1 will be "ABCD", its value does not change. Why ?
			 *  
			 *  Because we have not assign the newly created object to str1
			 *  
			 *  So correct statement will be 
			 *  
			 *  str1 = str1 + "XYZ"
			 */
			str1 = str1 + "XYZ";
			//System.out.println(str1); 
			
			/*
			 * 3.) length() --> it gives length of string 
			 * 
			 * int len = str4.length(); --> 8
			 */
			int len = str4.length(); 
			System.out.println(len);
			
			/*
			 * 4.) equals method --> to check if two strings are equals
			 */
			boolean isEqual = str2.equals("CDEF");
			System.out.println(isEqual);
			
			String s1 = new String("JAVA");
			String s2 = "JAVA";
			String s3 = new String("JAVA");
			String s4 = "JAVA";
			/* what will be output, think before running the program 
			 * and try to think the reason by drawing SCP and heap memory of each object
			 */
			System.out.println("-------------String == test");
			System.out.println(s1 == s2);//false
			System.out.println(s2 == s4);//true
			System.out.println(s1 == s3);//false
			System.out.println("-------------String equals test");
			System.out.println(s1.equals(s2));//true
			System.out.println(s2.equals(s4));//true
			System.out.println(s1.equals(s3));//true
			
			/*
			 * 5.) toCharArray() --> to convert a String to char array 
			 * "JAVA"  its char array --> {'J','A','V','A'}
			 * char[] charArray = "JAVA".toCharArray();
			 */
			System.out.println("---------------toCharArray() Example");
			char[] charArray = "JAVA".toCharArray();
			for(int i=0; i<charArray.length; i++) {
				System.out.println(charArray[i]);
			}
			
			/*
			 * 6.) split method --> This method will break the string into small pieces
			 * String text = "Java program is very easy";
			 * if we want to break the string text by each space (" ")
			 * Means like --> "Java", "program", "is", "very", "each"
			 * 
			 * String[] strArray = text.split(" ");
			 */
			System.out.println("---------------split Example");
			String text = "Java program is very easy";
			String[] strArray = text.split(" ");
			for(int i=0; i<strArray.length; i++) {
				System.out.println(strArray[i]);
			}
			
			
			
			String text1 = "Apple,Mango,Guava,Pineapple,Plum";
			//Now if we want to split the text1 on comma (",")
			String[] strArray1 = text1.split(",");
			for(String word : strArray1) { // this is enhanced for loop will discuss
				System.out.println(word);
			}
			
			/*
			 * 7.) substring(startIndex, endIndex) --> if we want to break String index wise
			 */
			System.out.println("---------------substring Example");
			String name = "Java Kumar";
			String firstName = name.substring(0, 4);
			System.out.println(firstName);
			String lastName = name.substring(5, 10);
			System.out.println(lastName);
		}


	}


