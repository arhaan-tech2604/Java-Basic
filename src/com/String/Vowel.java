package com.String;

public class Vowel {

	public static void main(String[] args) {
		
		String str="Arhan Siddiqui";
		
//		String lower=str.toLowerCase();
		
		int count=0;
		
//		char[]c=lower.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
				System.out.print(str.charAt(i)+" ");
			}
		}
		System.out.println("\nvowel comes "+count+" times");
	}
}
