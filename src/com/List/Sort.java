package com.List;

import java.util.*;

public class Sort {

	public static void main(String[] args) {
		
		ArrayList alArrayList=new ArrayList();
		alArrayList.add("Arhan");
		alArrayList.add("zaid");
		alArrayList.add("chintu");
		alArrayList.add("Aman");
	    alArrayList.add("bilal");
	    alArrayList.add("dawood");
	    
	    Collections.sort(alArrayList);
	    
	    for (Object ob : alArrayList) {
			System.out.println(ob);
		}
	}
}
