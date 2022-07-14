package com.acharya.listinterface;
import java.util.ArrayList;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		List<String> val2 = new ArrayList<>();
		val2.add("corona");
		List<String> val3 = new ArrayList<>();
		val3.add("stop");
		val3.addAll(val2);
		System.out.println(val2);
		System.out.println(val3);
	
	}

}
