package com.thirdware.programs;

import java.util.Scanner;

public class PatternWithUserInput {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string");
	String str=s.next();
	int len=str.length();
	char[] ch=str.toCharArray();
   for(int i=0;i<len;i++)
	{
		for(int j=0;j<i+1;j++){

			System.out.print(ch[j]+" ");	           
		}		
System.out.println();
}

	for( int i=len;i>=0;i--)
	{
		for(int j=0;j<i-1;j++)
		{
			System.out.print(ch[j]+" ");	           
		}	
		
System.out.println();

}	
}
}