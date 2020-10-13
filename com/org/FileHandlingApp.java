package com.org;
import java.io.*;
public class FileHandlingApp {

   public static void main(String x[])
   {
	   File f[]=File.listRoots();
	   System.out.println("Drive\tTotalSpace\tFreeSpace");
	   for(int i=0;i<f.length;i++)
	   {
		   System.out.println(f[i]+"\t"+f[i].getTotalSpace()/1074741824+"GB \t\t"+
	                                  (f[i].getFreeSpace()/1074741824)+"GB");
	   }
   }

}