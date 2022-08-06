package com.acharya.string;

public class Demo {

	public static void main(String[] args) {
		String s = "new concept" ;
		String d = "NEW CONCEPT";
		String a = "old concept  ";
		System.out.println(s.substring(0));
		System.out.println(s.substring(0,3));
		System.out.println(s.replace("e","n"));
		System.out.println(s.contains("new"));
		System.out.println(s.contains("wen"));
		System.out.println(s.equalsIgnoreCase(d));
		System.out.println(s.equalsIgnoreCase(a));
		System.out.println(s.indexOf("x"));
		System.out.println(s.lastIndexOf("c"));
		System.out.println(d.length());
		System.out.println(a.charAt(2));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String all = s.concat(a);
		System.out.println(all);
		System.out.println(s+a);
		System.out.println(all.trim()+"easy");
		System.out.println(s.toCharArray());
	}

}
