package com.test.bll;

public class StrReverse {
	
	 public static void main(String[] args)

	    {

	        String str = "Nainsi";

	        // conversion from String object to StringBuffer

	        StringBuffer sbfr = new StringBuffer(str);

	        // To reverse the string

	        sbfr.reverse();

	        System.out.println(sbfr);

	    }

}
