package com.Loop;

public class Reverse {
	public static void main(String[] args) {
		int number = 10578, reverse = 0;
		System.out.println(number);
		
		while (number != 0) {
			int a= number % 10;
			reverse = reverse * 10 + a;
			number = number / 10;
		}
		
		System.out.println(reverse);
	}
}