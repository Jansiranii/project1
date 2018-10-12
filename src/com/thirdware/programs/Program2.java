package com.thirdware.programs;
public class Program2 {
   public static void main(String[] args) {
	 int[] arr={6,3,9,8,10,2,1,15,7};
	  for(int i=0;i<arr.length;i++) 
	   {
		  int max=Integer.MAX_VALUE; 
		  int count=-1;
	      for(int j=0;j<arr.length;j++)
		   {
			 if(arr[i]<arr[j]&&arr[j]-arr[i]<max)
			  	 {
				    max=arr[j]-arr[i];
				    count=j;
				 }
		     } 
		if(count==-1)
		  System.out.print("_ ");
		 else
		 System.out.print(arr[count]+" ");
	   }			
         }
}