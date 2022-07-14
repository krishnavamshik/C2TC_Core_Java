package com.acharya.listinterface;
import java.util.ArrayList;
import java.util.List;


public class Test4 {

	public static void main(String[] args) {
	List<String> val0= new ArrayList<>();
	val0.add("ok");
	val0.add("sure");
	val0.add("fine");
	System.out.println(val0);
	boolean x = val0.contains("sure");
	System.out.println(x);

	}

}
