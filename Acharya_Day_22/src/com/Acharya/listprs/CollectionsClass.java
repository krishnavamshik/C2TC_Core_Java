package com.Acharya.listprs;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CollectionsClass {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(89);
		values.add(47);
		values.add(0,77);
		Collections.sort(values);
		System.out.println(values);
		
		Iterator i = values.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
	
			
		}
		//for(Object i1 : values) {
			//System.out.println(i1);
		//}
		
	}

}
