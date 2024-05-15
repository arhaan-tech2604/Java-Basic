package com.Inner;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		double radius=3.14;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AREA");
		double r1= sc.nextDouble();
		
		
		double area=3.14*radius*radius;
		System.out.println("The Area of circle is"+area);
	}
}
