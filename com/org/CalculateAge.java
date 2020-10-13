package com.org;

import java.time.*;


public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y,d;
		String m;
		LocalDate today=LocalDate.now();
		LocalDate bdate=LocalDate.of(1995,Month.APRIL,13);
		Period p=Period.between(bdate, today);
		System.out.println("Today :"+today);
		System.out.println("Age is :"+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days");
	
	}

}
