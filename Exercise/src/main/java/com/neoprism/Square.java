package com.neoprism;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer to compute the square ");
		int i=sc.nextInt();
		System.out.println("The square of the entered integer is "+(i*i));
	}

}
