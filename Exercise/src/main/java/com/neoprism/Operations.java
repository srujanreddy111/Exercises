package com.neoprism;

import java.util.Scanner;

public class Operations {

	static double out;
	public static void main(String[] args) {
		System.out.println("Enter the values to perform the Operation");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Select the Operation to be performed");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int i=sc.nextInt();
		switch(i) {
		
		case 1 : 
		out=a+b;
		System.out.println("Addition : " +out);
	break;
		case 2: 
			out=a-b;
			System.out.println("Subtraction: " +out);
			break;
		case 3:
			out=a*b;
			System.out.println("Multiplication : "+out );
			break;
		case 4:
			out=a/b;
			System.out.println("Division : " +out);
			break;
			default : 
				System.out.println("Invalid Selection");

	}

}
}
	
