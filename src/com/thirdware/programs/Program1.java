package com.thirdware.programs;
public class Program1 {
	public static void main(String[] args) {
		int[] array={2,2,4,0,8,2};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
				 array[i]=array[i]+array[j];
				 array[j]=0;
				}	
				else if(array[i]==0){
					  int temp=array[i];
					  array[i]=array[j];
					  array[j]=temp;
				    }
				}
			   System.out.print(array[i]+" ");
				}
		}
	}