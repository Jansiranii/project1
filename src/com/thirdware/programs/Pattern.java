package com.thirdware.programs;

public class Pattern {

	public static void main(String[] args) {
		String str="JAVAJ2EE";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(ch[j]);	           
			}		
	System.out.println();
	}
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(ch[j]);	           
			}	
			
	System.out.println();

	}	
		
}
}