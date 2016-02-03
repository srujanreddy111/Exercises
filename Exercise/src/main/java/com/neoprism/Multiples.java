package com.neoprism;

public class Multiples {
	static int count =1000;
	static int x,y=0;
	public static void main(String[] args) {
		Multiples mul=new Multiples();
		mul.multi();
	}
		public int multi(){
		for(int i=1;i<1000;i++){
		if(i%3==0)	{
			x=x+i;
		}
		}
		for(int j=1;j<1000;j++){
			if(j%5==0)	{
				y=y+j;
			}
			}
		int totalcount=x+y;
		System.out.println("The sum of all the multiples of 3 or 5 below 1000 is "+totalcount);
		return totalcount;
		}
}

