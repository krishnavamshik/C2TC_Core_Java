package com.Acharya.listprs;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {
		List<Integer> values = new LinkedList<Integer>();
		values.add(1);
		values.add(89);
		values.add(47);
		for(int i: values) {
			System.out.println(values);
		}

	}

}
