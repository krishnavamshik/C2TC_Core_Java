package com.Acharya.listprs;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(89);
		values.add(47);
		for(int i: values) {
			System.out.println(values);
		}

	}

}
