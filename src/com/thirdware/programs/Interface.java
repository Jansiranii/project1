package com.thirdware.programs;

public interface Interface {
	int x=10;
}
 public interface B
 { 
	 int x=100;
 }
  class samp implements Interface,B{
	  public static void main(String[] args) {
		  System.out.println(Interface.x);
		  System.out.println(B.x);
		  
	}
  }