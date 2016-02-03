package com.neoprism;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find out if it is prime");
		int i=sc.nextInt();
		
	
		if(i%2==0){
			System.out.println("False");
		}
			else
				System.out.println("True");
			}
}
