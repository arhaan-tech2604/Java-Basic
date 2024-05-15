package com.Inner;

class Outer{
	int x=5;
	
	static class Inner{
		int y=10;
	}
}

public class Main{
	public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner in=new Outer.Inner();
		System.out.println(in.y + out.x);
	}
}