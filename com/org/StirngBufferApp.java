package com.org;

public class StirngBufferApp {
	public static void main(String x[])
	{
		StringBuffer sb=new StringBuffer("good mornig india");
        sb.append(" 2018");
        System.out.println("After Append: "+sb);
        //int i=sb.length();
        System.out.println("length: "+sb.length());
        
        sb.delete(5,12);
        System.out.println("After delet: "+sb);
        sb.insert(5,"mornig ");
        System.out.println("After isert :"+sb);
       String b=sb.substring(12);
       int j=sb.length();
        System.out.println("after substring: "+b);
        System.out.println(j);
	}

}
