package com.org;
import java.io.*;
public class ListFileAndFolder {

	public static void main(String[] args) {
		File f=new File("D:\\");
		File f1[]=f.listFiles();
		
		
		int n=1;
		System.out.println("NO \t FOLDER");
		for(int i=0;i<f1.length;i++)
		{   
			
			System.out.printf("%d\t",n++);
			System.out.println(f1[i]);
			
			}

	}

}
