package com.array;

import java.util.Iterator;

public class Reverse {

	public static void main(String[] args) {
		 
		int arr[]= {1,2,3,4,5};
		
		System.out.println("Original Value");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Reverse Array");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}	
	}
}
