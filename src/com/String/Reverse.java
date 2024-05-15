package com.String;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		String s;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		s=sc.nextLine();
		
		System.out.println("After Reverse String : ");
		
		int i=s.length();
		
	    while (i>0) {
			System.out.print(s.charAt(i-1));
			--i;
		}
	}
}
