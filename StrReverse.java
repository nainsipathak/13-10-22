package com.test.bll;
import java.util.Scanner;

public class StrReverse {
	
	 public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
				
			System.out.println("Enter a string : ");
			String str = sc.nextLine();
			System.out.println("Origional string : "+str);
				
			reverseString(str);
				
			
		  sc.close();
			}
		
	 public static void reverseString(String str) {
		
		 for(int i=str.length()-1; i>=0; i--) {
			if(i==str.length()-1)
				System.out.print("Reverse string : ");
				System.out.print(str.charAt(i));
				}
			}

}
