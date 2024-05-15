package com.Inner;

class Out{
	int x=30;
	
	class Inner{
		public int OuterClass() {
			return x;
		}
	}
}
public class Main1 {

    public static void main(String[] args) {
		Out out=new Out();
		Out.Inner in= out.new Inner();
		System.out.println(in.OuterClass());
	}
}