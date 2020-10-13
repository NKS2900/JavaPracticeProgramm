package com.org;
import java.io.*;
public class FileReaderApp {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
         FileReader fr=new FileReader("D:\\demo\\test.txt");
         int data;
         while((data=fr.read())!=-1)
         {
        	System.out.println((char)data);
        	Thread.sleep(1000);
         }
	}

}
