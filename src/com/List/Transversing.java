package com.List;

import java.util.*;

public class Transversing {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Arhan");
		list.add("Siddiqui");
		list.add("Ashfaq");
		list.add("shaikh");
		list.add("Asif");
		list.add("Sayyed");
		list.add("Furkan");
		list.add("Mansoori");
		
		System.out.println("Iterating value in Forward Direction..");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Iterating value in Backword Direction..");
		
		ListIterator lt=list.listIterator(list.size());
		
		while (lt.hasPrevious()) {
			String str=(String) lt.previous();
			System.out.println(str);
		}
	}
}
