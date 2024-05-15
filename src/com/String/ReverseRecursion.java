package com.String;

import java.util.Scanner;

public class ReverseRecursion {

	public static void main(String[] args) {
		String str;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		str = sc.nextLine();
		sc.close();

		String reversed = reverseStr(str);
		System.out.println("After Reversing The String : " + reversed);
	}

	public static String reverseStr(String s) {

		if (s.isEmpty()) 
			return s;
		return reverseStr(s.substring(1)) + s.charAt(0);
	}
}
