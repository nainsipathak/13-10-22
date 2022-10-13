package com.test.bll;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
				
		char charArray[] =reverseString(str);
		for(char c:charArray) {
		System.out.print(c);
				
		sc.close();
		}
	}

	public static char[] reverseString(String str) {
		
		char charArray[] =new char[str.length()];
		int index=0;
		
		for(int i=str.length()-1; i>=0; i--) {
			charArray[index] = (str.charAt(i));
			index++;
			}
		return charArray;

	}

}
