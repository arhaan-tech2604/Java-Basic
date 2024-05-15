package com.array;

public class LinearSearch {
	
	public static int linearSearch(int a[],int b) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[]= {56,89,27,45,90};
		int b=45;
		
		System.out.println(b+" is found at index : "+linearSearch(a, b));
	}
}
