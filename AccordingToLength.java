package com.test.bll;

import java.util.Scanner;
class AccordingToLength
{
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String:");
	        String str = sc.nextLine();
	        
	        String arr[] = str.split("\\s+");
	        for (int i = 0; i < arr.length-1; i++) {
	            int outer = arr[i].length();
	            for (int j = i + 1; j < arr.length; j++) {
	                int inner = arr[j].length();
	                if (outer > inner || outer == inner && arr[i].compareTo(arr[j]) > 0) {
	                    String temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                    outer = inner; // outer has new length (what was just swapped)
	                }
	            }
	        }
	        
	        String result = "";
	        for (String word : arr) {
	            result += word + " ";
	        }
	        System.out.println(result);
	        sc.close();
        }
    }