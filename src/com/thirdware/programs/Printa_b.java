package com.thirdware.programs;

import java.util.Scanner;

public class Printa_b {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a and b value");
		int a=s.nextInt();
		int b=s.nextInt();
	
		
			if(a-b>=2)
			{
				System.out.println(a);	
			}
			else if (b-a>=2) 
			{
				System.out.println(b);		
			}
		
			else
			{
				System.out.println("inconclusive");
			}
		
	}
}
