package com.org;

import java.util.*;
import javax.swing.*;

public class AgeCal {
	public static void main(String args[]) {
		
		Scanner sn = new Scanner(System.in);
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		int dd, mm, yy;
		dd = today.get(Calendar.DATE);
		mm = today.get(Calendar.MONTH) + 1;
		yy = today.get(Calendar.YEAR);
		
		cal1.set(yy, mm, dd); // set current date
		System.out.print("Enter your date of birth(dd mm year): ");
		dd = Integer.parseInt(JOptionPane.showInputDialog("DD: "));
		mm = Integer.parseInt(JOptionPane.showInputDialog("MM: "));
		yy = Integer.parseInt(JOptionPane.showInputDialog("YY: "));
        
		cal2.set(yy, mm, dd); // set date of birth
		int days = daysBetween(cal1.getTime(), cal2.getTime()); // number of days
		System.out.println("Days= " + days);
		int year = days / 365; // findout year
		days = days % 365;
		int month = days / 30; // findout month
		days = days % 30;
		System.out.println("YOUR age is " + year + " yrea " + month + " month " + days + " days");
	}

public static int daysBetween(Date d1, Date d2)
{
return (int)( (d1.getTime()-d2.getTime()) /(1000 * 60 * 60 * 24));
}
}