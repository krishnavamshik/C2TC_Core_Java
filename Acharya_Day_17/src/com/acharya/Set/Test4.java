package com.acharya.Set;
import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		Set<String> obj = new LinkedHashSet<String>();
		obj.add("a");
		obj.add("e");
		obj.add("i");
		List<String> a = new ArrayList<String>();
		a.add("u");
		a.add("o");
		System.out.println(obj);
		System.out.println(a);
		obj.addAll(a);
		System.out.println(obj);
		System.out.println(a);
	}

}
