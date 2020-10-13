package com.org;

public class PatternApp {

	public static void main(String x[])
	{
		System.out.println("Pattern");

		
		for(int i=0;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
		       {
		    	   System.out.print(" ");
		    	   }
			for(int j=0;j<=i;j++)
			{
			       
					System.out.print("*");
			       
				
			}
			
			System.out.println();
		
		}
	}
}
