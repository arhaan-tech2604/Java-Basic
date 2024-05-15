package com.String;

public class Mutable {
	
	private String str;
	
	public Mutable(String str) {
		this.str=str;
	}
	
	public String getName() {
		return str;	
	}
	
	public void setName(String Surname) {
		this.str=Surname;
	}
	
	public static void main(String[] args) {
		Mutable mutable=new Mutable("Arhan");
		System.out.println(mutable.getName());
		
		mutable.setName("Siddiqui");
		System.out.println(mutable.getName());
	}	
}
 