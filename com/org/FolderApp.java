package com.org;

import java.io.*;

public class FolderApp {

	public static void main(String[] args)throws IOException {

		File f=new File("D:\\demo");
		boolean b=f.exists();
		if(b)
		{
			System.out.println("Folder already exists????");
		}
		else {
				boolean m=f.mkdir();
				if(m) {
					System.out.println("folder created successfullyyyyy");
				
				}
		}
	
	}

}
