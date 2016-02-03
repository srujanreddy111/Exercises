package com.neoprism;

public class Person {
	String name="srujan";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void writeName(){
		
		System.out.println("My Name is " +name);
	}
	public static void main(String[] args) {
		Person na=new Person();
		String sur =na.getName();
		na.setName(sur +" Thummala");
		
		na.writeName();
		}
}
