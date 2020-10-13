package com.org;

import java.text.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.*;
public class AgeApp
{
	
	public static void main(String x[])
	{
		LocalDate today=LocalDate.now();
		LocalDate bdate=LocalDate.of(1995,Month.APRIL,13);
		Period p=Period.between(today,bdate);
		System.out.println(p.getYears()+"years "+p.getMonths()+"months "+p.getDays()+"days");
		
	}
}