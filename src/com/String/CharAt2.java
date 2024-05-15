package com.String;

public class CharAt2 {

	public static void main(String[] args) {
		
		String a="Java";
		int count=0;
		
		for (int i = 0; i <= a.length()-1; i++) {
			if(a.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("frequency of a is "+count);
	}
}
