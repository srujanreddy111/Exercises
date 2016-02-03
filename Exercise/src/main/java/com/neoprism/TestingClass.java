package com.neoprism;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestingClass {
	@Test
	public void primee() {
		PrimeSummation me=new PrimeSummation();
		int d=me.prime();
		assertEquals(3682913,d);
	}
	@Test
	public void fibTest(){
		Fibonacci na=new Fibonacci();
		int i=na.fibs();
		assertEquals(798,i);
		
	}
	@Test
	public void multi() {
		Multiples a=new Multiples();
		int x=a.multi();
		assertEquals(266333,x);
	}

}
