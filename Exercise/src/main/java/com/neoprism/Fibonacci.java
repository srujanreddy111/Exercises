package com.neoprism;

public class Fibonacci {
static int a=0;
static int count=1000;
static int n;
	public static void main(String[] args) {
		Fibonacci fi=new Fibonacci();
		fi.fibs();
	}
	
	public int fibs(){        
	int[] feb = new int[count];
	         feb[0] = 1;
	         feb[1] = 2;
	         for(int i=2; n< count; i++){
	             feb[i] = feb[i-1] + feb[i-2];
	             n=feb[i];
	         }
	 
	         for(int i=1; i< count; i++){
			if(feb[i]%2==0) {
				a=feb[i]+a;
			}
	         }
	       System.out.println(a);
	       return a;
	}

}
