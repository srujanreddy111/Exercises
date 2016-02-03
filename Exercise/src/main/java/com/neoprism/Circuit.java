package com.neoprism;

import java.util.Scanner;

public class Circuit {
static int out;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(("Enter two different inputs 0 or 1 "));
		int x=sc.nextInt();
		int y=sc.nextInt();
		Circuit c=new Circuit();
		c.circ(x, y);
	}
		public final int circ(int x,int y)
		{
		out=x^y;
		System.out.println("The output for inputs is "+out);
		return out;
		}
	

}
