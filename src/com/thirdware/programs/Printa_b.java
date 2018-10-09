package com.thirdware.programs;

import java.util.Scanner;

public class Printa_b {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a and b value");
		int a=s.nextInt();
		int b=s.nextInt();
<<<<<<< HEAD
    	 int x=a-b;
    	 int y=b-a;
			if(x>=2)
			{
				System.out.println(a);	
			}
			else if (y>=2) 
=======
	
		
			if(a-b>=2)
			{
				System.out.println(a);	
			}
			else if (b-a>=2) 
>>>>>>> e70ccdceaaeda27cb01c328a5f6c5ef82e047fef
			{
				System.out.println(b);		
			}
		
			else
			{
				System.out.println("inconclusive");
			}
  }
=======
		
	}
>>>>>>> e70ccdceaaeda27cb01c328a5f6c5ef82e047fef
}
