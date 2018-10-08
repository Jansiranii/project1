package com.thirdware.programs;

import java.util.Scanner;

public class Printa_b {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a and b value");
		int a=s.nextInt();
		int b=s.nextInt();
    	
		int diff=a-b;
		
		if(diff>1||diff<=0)
		{
			if(a>b)
			{
				System.out.println(a);	
			}
			else if (b>a) 
			{
				System.out.println(b);		
			}
		
			else
			{
				System.out.println("inconclusive");
			}
		}
	}
}
