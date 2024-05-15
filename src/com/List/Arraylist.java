package com.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Arhan");
		al.add("Bilal");
		al.add("Ashfaq");
		al.add("Furkan");
		al.add("Asif");
		
		System.out.println("Before Iterating the value....!");
		System.out.println(al);
		
		System.out.println("After Iterating the value....!");
		
		Iterator it=al.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}
}
