package com.String;

public class Test1 {

	public static void main(String[] args) {
		String str="Affan Khan Kurla";
		
		String lower=str.toLowerCase();
		
		int count=0;
		
		char[] d=lower.toCharArray();
		
		for (int i = 0; i < d.length; i++) {
			if (d[i]=='a'||d[i]=='e'||d[i]=='i'||d[i]=='o'||d[i]=='u') {
				count++;
			}
		}
		System.out.println("vowel come"+count+"times");
	}
}
