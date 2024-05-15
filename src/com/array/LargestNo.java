package com.array;

public class LargestNo {

	public static void main(String[] args) {

		int arr[]= {45,65,3,4,23};
		
		int max=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
				
				System.out.println("Largets No in list : "+max);
			}
		}
	}
}
