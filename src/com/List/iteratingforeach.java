package com.List;

import java.util.*;

public class iteratingforeach {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("Arhan");
		list.add(19);
		list.add("Ashfaq");
		list.add(20);
		list.add("Furkan");
		list.add(19);
		
		System.out.println("Iterating value without for-each loop..");
		System.out.println(list);
		
		System.out.println("Iterating value by for-each Lopp..");
		
		for (Object al : list) {
			System.out.println(al);
		}
	}
}
