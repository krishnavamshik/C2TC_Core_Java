package com.acharya.listinterface;
import java.util.ArrayList;
import java.util.List;
public class Test5 {

	public static void main(String[] args) {
		List<Integer> val2 = new ArrayList<>();
		val2.add(5);
		val2.add(6);
		val2.add(0);
		List<Integer> val3 = new ArrayList<>();
		val3.add(6);
		System.out.println(val2);
		System.out.println(val3);

		val2.removeAll(val3);
		System.out.println(val2);


	}

}
