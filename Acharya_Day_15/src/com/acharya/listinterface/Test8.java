package com.acharya.listinterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Test8 {

	public static void main(String[] args) {
List<Integer> val0= new ArrayList<>();
		
		val0.add(1);
		val0.add(2);
		val0.add(3);
		val0.add(4);
		val0.add(5);
		Collections.rotate(val0,2);
		System.out.println(val0);
		Collections.sort(val0);
		System.out.println(val0);
		Collections.sort(val0,Collections.reverseOrder());
		System.out.println(val0);
		Collections.fill(val0,0);
		System.out.println(val0);
		System.out.println(val0.get(4));
		val0.set(0, 9);
		System.out.println(val0.isEmpty());
		System.out.println(val0.size());
		System.out.println(val0);

	}

}
