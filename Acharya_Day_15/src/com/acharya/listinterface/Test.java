package com.acharya.listinterface;
import java.util.ArrayList;
import java.util.List;
public class Test {

	public static void main(String[] args) {
		List<Integer> val= new ArrayList<>();
		val.add(0);
		val.add(100);
		val.add(1);
	for(Integer e : val)
	{
		System.out.print(e);
	}
	System.out.println("ArrayList :" + val);
	}

}
