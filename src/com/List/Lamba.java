package com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class A implements Comparator {
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		if (I1 > I2)
			return -1;
		else {
			
			return +1;
		}
	}
}

public class Lamba {
	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(3);
		list.add(5);
		list.add(4);

	    Collections.sort(list,new A());
		System.out.println(list);

	}
}
