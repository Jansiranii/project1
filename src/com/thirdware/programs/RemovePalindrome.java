package com.thirdware.programs;
import java.util.Scanner;
public class RemovePalindrome {
  public static void main(String[] args){
	  Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		String word[]=str.split(" ");
	   for(int i=0;i<word.length;i++)
	   {
		   StringBuffer sb=new StringBuffer(word[i]);
		   sb.reverse();
		   String s1=sb.toString();
		   String[] s2=s1.split(" ");
		   for(int j=0;j<s2.length;j++)
		   {
			if(word[i].equals(s2[j])){
			   if(word[i].length()==1)
			   {
				   System.out.print(word[i]+" ");
			   }
		    }
			   else{
				   System.out.print(word[i]+" ");
                 }
	       }
       }
    }
 }

