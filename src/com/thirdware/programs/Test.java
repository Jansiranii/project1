package com.thirdware.programs;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a and b value");
		int a=s.nextInt();
		int b=s.nextInt();
    	 int x=a-b;
    	 int y=b-a;
			if(x>=2)
			{
				System.out.println(a);	
			}
			else if (y>=2) 
			{
				System.out.println(b);		
			}
		
			else
			{
				System.out.println("inconclusive");
			}
  }


}
