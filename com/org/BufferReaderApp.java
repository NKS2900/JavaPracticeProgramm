package com.org;
import java.io.*;
public class BufferReaderApp {

	public static void main(String[] args)throws Exception {
		
		FileReader fr=new FileReader("D:\\demo\\test1.txt");
		BufferedReader br=new BufferedReader(fr);
		String data;
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
			Thread.sleep(1000);
		}

	}

}
