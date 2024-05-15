package com.Inner;

class B{
	static void m1() {
		System.out.println("hi");
	}
	{
		System.out.println("SakiNaka");
	}
	static {
		System.out.println("OPPo");
		{
			System.out.println("vivo");
		}
	}
	
	void show() {
		System.out.println("iphone");
	}
	
	public static void main(String[] args) {
		B a=new B();
		a.show();
		B.m1();
	}
}
