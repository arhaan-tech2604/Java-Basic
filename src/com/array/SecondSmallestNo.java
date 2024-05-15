package com.array;

public class SecondSmallestNo {

	public static int getSecondSmallest(int[] a,int total) {
		int temp;
		
		for (int i = 0; i < total; i++) {
			for (int j = i+1; j < total; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}
	
	public static void main(String[] args) {
		int a[]= {26,33,22,67,100};
		int b[]= {45,5,1,99,44,33};
		
		System.out.println("Second Smallest Number : "+getSecondSmallest(a, 5));
		System.out.println("Second Smallest Number : "+getSecondSmallest(b, 6));
	}
}
