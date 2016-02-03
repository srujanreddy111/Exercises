package com.neoprism;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find if it is palindrome");
		int i=sc.nextInt();
		int n=i;
		int rev=0,rmd; 
	       while(n > 0) 
	       { 
	         rmd = n % 10; 
	         rev = rev * 10 + rmd; 
	         n = n / 10; 
	       } 
	       if(rev == i) 
	         System.out.println(i+" is Palindrome Number!"); 
	       else
	         System.out.println(i+" is not a Palindrome Number!"); 

	}

}
