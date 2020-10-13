package com.org;

import java.io.*;

public class FileCreateApp {

	public static void main(String[] args) throws Exception {

		File f = new File("D:\\demo\\test.txt");
		boolean e = f.exists();
		if (e) {
			System.out.println("File already exist.......");
				} 
			else {
				boolean b = f.createNewFile();
				if (b) {
						System.out.println("file created successfullyyyy.....");
					  	} 
					else {
						System.out.println("file not created?????");
						}
		}
	}

}
