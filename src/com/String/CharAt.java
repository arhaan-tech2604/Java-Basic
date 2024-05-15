package com.String;

import java.util.Iterator;

public class CharAt {

	public static void main(String[] args) {
		
		String a="Arhan";
//		String a1=new String("Arhan");
//		System.out.println(a.compareTo(a1));
		
		for (int i = 0; i <= a.length()-1; i++) {
			if(i%2!=0) {
				System.out.println("char place "+i+" Value At that place is "+a.charAt(i));
			}
		}
		
//		String a=null;
//		String a1="abc";
//		
//		System.out.println(a1.equals("abc")|| a.equals(null));
		
	}
}
