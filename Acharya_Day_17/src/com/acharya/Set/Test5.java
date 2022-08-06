package com.acharya.Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {
		Set<Integer> obj1 = new LinkedHashSet<Integer>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		System.out.println(obj1);
		System.out.println(a);
		obj1.retainAll(a);
		obj1.removeAll(a);
		System.out.println(obj1);
	}

}
