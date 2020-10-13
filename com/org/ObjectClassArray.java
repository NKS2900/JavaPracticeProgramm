package com.org;

public class ObjectClassArray {

	public static void main(String[] args) throws Exception {
		Object obj[]=new Object[]{"good",2222,"this is","4.5f","object class arry"};
		
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
			Thread.sleep(1000);
		}

	}

}
