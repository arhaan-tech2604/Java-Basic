package com.List;

import java.util.*;

class Student{
	
	int rollno;
	String name;
	String Address;
	
	public Student(int rollno,String name,String Address) {
		this.rollno=rollno;
		this.name=name;
		this.Address=Address;
	}
}
public class USerDefined {
	public static void main(String[] args) {
		
		Student s1=new Student(1, "Arhan SIddiqui", "Powai");
		Student s2=new Student(2, "Ashfaq Shaikh", "Karnatak");
		
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		
		Iterator i = al.iterator();
		
		while (i.hasNext()) {
			Student st=(Student) i.next();
			System.out.println(st.rollno+" "+st.name+" "+st.Address);
		}		
	}
}
