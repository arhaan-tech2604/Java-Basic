package com.String;

public class ToString {

	int Id;
	String Name;
	int age;
	
	public ToString(int Id,String Name,int age) {
	   this.Id=Id;
	   this.Name=Name;
	   this.age=age;
	}
	
	public String toString() {
		
		return Id+""+Name+""+""+age;
	}
	
	public static void main(String[] args) {
		
		ToString s1=new ToString(1 , "Arhan Siddiqui" , 19);
		ToString s2=new ToString(2 , "Ahmed Khan" , 22);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
