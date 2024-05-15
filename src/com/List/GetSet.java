package com.List;

import java.util.*;

public class GetSet {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Arhan");
		al.add("Ahmed");
		al.add("Ashfaq");
		al.add("Furkan");
		al.add("Asif");
		al.add("Asif");
		
		System.out.println("upadting value : " +al.get(0));
		
		al.set(0, "Bilal");
		
		for (String str : al) {
			System.out.println(str);
		}
	}
}
