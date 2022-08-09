package com.Acharya.listprs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		List<Integer> val0 = new ArrayList<>();

		val0.add(1);
		val0.add(2);
		val0.add(3);
		val0.add(4);
		val0.add(5);
		Collections.rotate(val0, 2);
		System.out.println(val0+ "rotated");
		Collections.sort(val0);
		System.out.println(val0+ " sorted the list");
		Collections.sort(val0, Collections.reverseOrder());
		System.out.println(val0+ " reversed the order");
		Collections.fill(val0, 0);
		System.out.println(val0+ " filled ");
		System.out.println(val0.get(4)+" get method");
		val0.set(0, 9);
		System.out.println(val0.isEmpty());
		System.out.println(val0.size());
		System.out.println(val0);

	}

}
