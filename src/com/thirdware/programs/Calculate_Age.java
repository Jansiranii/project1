package com.thirdware.programs;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

 class Calculate_Age {
	
	static int calculate(LocalDate ld){
		
		LocalDate todaydate=LocalDate.now();
		int result=Period.between(ld,todaydate).getYears();
		return result;
	}
	
    public static void main(String[] args) {
		
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter date of birth in this format yyyy/mm/dd");
	    String dob=s.next();
	    LocalDate ld=LocalDate.parse(dob);
	    System.out.println(calculate(ld));
   }
    
}
