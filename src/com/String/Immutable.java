package com.String;

final class Employee{
	
	final String pancardNo;
	
	public Employee(String pancardNo) {
		this.pancardNo=pancardNo;
	}
	
	public String getpancardNo() {
		return pancardNo;
	}
}

public class Immutable {

	public static void main(String[] args) {
		
		Employee e=new Employee("37P43SAW2381");
		String s1=e.getpancardNo();
		System.out.println("PanCard Number :"+s1);
	}
}
