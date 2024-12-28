package com.datetime.implement;

import java.time.LocalDate;
import java.time.Period;

public class StudentAge {
	public static void main(String[] args) {

		LocalDate dateOfBirth = LocalDate.of(1995, 7, 20);
		LocalDate todaysdate = LocalDate.now();
		Period p = Period.between(dateOfBirth, todaysdate);
		System.out.println(p);
		//System.out.println("Days>>" + p.getDays());
		//System.out.println("Month>>" + p.getMonths());
		//System.out.println("Year>>" + p.getYears());
	}
}
