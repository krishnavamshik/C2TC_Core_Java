package com.acharya.Set;

import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		Set <String> x = new LinkedHashSet<String> ();
		x.add("no");
		x.add("yes");
		x.add("may");
		List<String> y = new ArrayList<String>();
		y.add("may");
		y.add("be");
		System.out.println(x);
		System.out.println(y);
		x.retainAll(y);
		System.out.println("x is"+x);
		x.addAll(y);
		System.out.println(x);
		x.removeAll(y);
		
		System.out.println(x);

	}

}
