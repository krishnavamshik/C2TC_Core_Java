package com.acharya.linkedList;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
	LinkedList<String>ll=new LinkedList<String>();
	ll.add("qd");
	ll.add("wr");
	ll.add("er");
	ll.add(1,"rr");
	ll.addFirst("Tr");
	ll.addLast("Yr");
	System.out.println(ll);
	LinkedList<String>oo=new LinkedList<String>();
	oo.add("1");
	oo.add("2");
	oo.add("3");
	ll.addAll(1,oo);
	System.out.println(oo);
	System.out.println(ll);
	}

}
