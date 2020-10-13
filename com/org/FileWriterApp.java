package com.org;
import java.io.*;
import java.util.*;
public class FileWriterApp {


	private static Scanner in;

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("D:\\demo\\test1.txt",true);
		String data;
		
        in = new Scanner(System.in);
        System.out.println("Enter Data to Store In File");
        data = in.nextLine();
        fw.write(data);
        
        fw.close();
        
       
        System.out.println("success......");
        
        
	}

}
