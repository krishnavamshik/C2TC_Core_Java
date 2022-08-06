package com.acharya.Set;

//List

import java.util.*;



public class Test3{

public static void main(String args[])

{
	Set<String> set= new LinkedHashSet<String>();
	set.add("object");
	set.add("Method");
	set.add("Meth");
	set.add("10");
	set.add("100");
	System.out.println(set);
	Object[] arr = set.toArray();   
	for (int j = 0; j < arr.length; j++)
	System.out.println(arr[j]);

	}
}
