package com.array;

public class SmallestNo {

	public static void main(String[] args) {
		
		int arr[]= {20,45,75,8,35,6};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Smallest Number in given Array : "+min);
	}
}
