package com.org;

public class CompareTwoString {
	
	public static void main(String x[])
	{
		String str1= "good morning";
		String str2= "good morning this is string example";
		int i=str1.length();
		int j=str2.length();
		System.out.println("FIRST STRING :"+i+"\t SECOND STRING :"+j);
		System.out.println("compare the string");
		if(i>j)
		{
		
		int k=i-j;
		System.out.println("Comapre Diff: "+k+" first strng is bigger");
	
		}
		else
		{
			int k=j-i;
			System.out.println("Comapre Diff :"+k+" second string is bigger");
			
		}
	}

}
