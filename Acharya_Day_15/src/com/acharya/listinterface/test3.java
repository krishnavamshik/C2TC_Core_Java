package com.acharya.listinterface;
import java.util.ArrayList;
import java.util.List;
public class test3 {

	public static void main(String[] args) {
		List<String> val2 = new ArrayList<>();
		val2.add("corona");
		List<String> val3 = new ArrayList<>();
		val3.add("stop");
		System.out.println(val3);

		val3.clear();
		System.out.println(val3);

	}

}
