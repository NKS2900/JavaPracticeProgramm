package com.org;

/**
 * @author NIJAM
 *
 */
public class StringApp {

	public static void main(String x[]) {
		String str = "gOoD mOrnIg india";

		String s = str.toLowerCase();
		String s1 = str.toUpperCase();
		System.out.println("LOWER CASE: " + s);
		System.out.println("UPPER CASE: " + s1);

		String[] s3 = str.split("gOoD");
		for (int i = 0; i < s3.length; i++) {
			System.out.println("After split STRING: " + s3[i]);
		}

		s = str.substring(5);
		int l = str.length();
		System.out.println("Length of Stirng: " + l);
		System.out.println("After using Substring: " + s);

		System.out.println("after TRIM: " + s);
		
		System.out.println("split the string");
	 
		
		
		String[] s4=str.split(" ");
		for (int j=0;j<s4.length;j++)
		{
			
			System.out.println(s4[j]);
			
		}

	}

}
