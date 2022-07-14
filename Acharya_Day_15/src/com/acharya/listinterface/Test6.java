package com.acharya.listinterface;
import java.util.ArrayList;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		List<String> val0= new ArrayList<>();
		
		val0.add("ok");
		val0.add("sure");
		val0.add("fine");
		val0.add("1");
		val0.add("2");
		System.out.println(val0);
		List<String> x = val0.subList(0, 4);
		System.out.println(x);
	}

}
