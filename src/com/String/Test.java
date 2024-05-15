package com.String;

public class Test {

	public static void main(String[] args) {
//		String a="Arhan";
//		String b=a+"Siddiqui";
//		String c="Arhan Siddiqui";
//		System.out.println(b==c);
//		
//		 String a=("abc");
//		String a1 =("abc");
//		
//		System.out.println(a.equals(a1));
//		System.out.println(a==a1);
		
		String s="arhan";
		char[] charArray = s.toCharArray();
		charArray[0] = Character.toUpperCase(charArray[0]);
		charArray[3] = Character.toUpperCase(charArray[3]);
		charArray[4] = Character.toUpperCase(charArray[4]);
		String string = new String(charArray);
		System.out.println(string);
		
		
		
	}
}