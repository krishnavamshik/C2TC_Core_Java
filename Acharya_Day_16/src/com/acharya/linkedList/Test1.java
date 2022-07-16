package com.acharya.linkedList;

import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList<String>cc=new LinkedList<String>();
		cc.add("q");
		cc.add("w");
		cc.add("e");
		cc.add(1,"r");
		cc.addFirst("T");
		cc.addLast("Y");
		System.out.println(cc);
		LinkedList<String>ii=new LinkedList<String>();
		ii.add("x");
		ii.add("r");
		ii.add("z");
		cc.addAll(ii);
		cc.remove(0);
		cc.removeFirst();
		cc.removeLast();
		System.out.println(cc);
		cc.removeFirstOccurrence("r");
		cc.removeLastOccurrence("r");
		System.out.println(cc);


	}

}
