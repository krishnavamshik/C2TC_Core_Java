package com.acharya.Set;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test {

	public static void main(String[] args) {
		Set<String> x = new HashSet<String>();
		x.add("ok");
		x.add("then");
		x.add("fine");
		System.out.println(x);
		Set<String>y = new<String> LinkedHashSet();
		y.add("ok");
		y.add("then");
		y.add("fine");
		System.out.println(y);

	}

}
