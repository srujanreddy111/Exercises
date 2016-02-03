package com.neoprism;

public class PrimeSummation {
static int num=0;
static int count=0;;

static int number=2;
public static void main(String[] args) {
	PrimeSummation pr=new PrimeSummation();
	pr.prime();
	
}
	public int prime() {
	while(count<1000){
			if(isPrime(number)) {
				num+=number; 
				count++;
				}
	number++;
	}
	System.out.println("The sum of primes from 1 to 1000 is "  +num);
	return num;
}
public static boolean isPrime(int number)
	{
	for(int i=2;i<=number/2;i++) 
		if((number%i)==0){
			return false;
			}
	return true;
	
	}
}

