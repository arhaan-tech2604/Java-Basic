package com.array;

public class Duplicate {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,2,4,5,4,6,7,8,8,9};
		System.out.println("Duplicate Array");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
