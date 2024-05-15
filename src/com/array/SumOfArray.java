package com.array;

public class SumOfArray {

	public static void main(String[] args) {
		
		int arr[]= {45,23,67,13,2};
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum Of Given Array : "+sum);
	}
}
