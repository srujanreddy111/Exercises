package com.neoprism;

import java.util.Scanner;

public class Float {
static double res;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a in float");
		float a=sc.nextFloat();
		System.out.println("Enter the value b in float");
		float b=sc.nextFloat();
		
		res=a+b;
		System.out.println("The output is "+res);
		

	}

}
