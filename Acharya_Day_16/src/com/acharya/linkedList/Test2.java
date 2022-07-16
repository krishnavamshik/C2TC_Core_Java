package com.acharya.linkedList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		LinkedList<String> x = new LinkedList<String>();
		x.add("we");
		x.add("us");
		x.add("they");
		x.add("all");
		System.out.println(x);
		Iterator i =x.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		String q = "all";
		boolean l=  x.contains("all");
		if(l) {
			System.out.println("included all");	
		}
		ArrayList<String> obj = new
		ArrayList<String>(Arrays.asList("yes", "ok", "gd"));
		System.out.println(obj);
		System.out.println(x.peek());
		System.out.println(x.peekFirst());
		System.out.println(x.peekLast());
		System.out.println(x.poll());
		System.out.println(x);
		
	}

}
