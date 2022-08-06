package com.acharya.string;
import java.util.Formatter;

public class Demo1 {

	public static void main(String[] args) {
		String n = "ask for help";
		int x = 10;
		String y = String.valueOf(x);
		System.out.println(n.startsWith("ask"));
		System.out.println(n.endsWith("help"));
		System.out.println(String.format("%s",n));
		System.out.println(String.format("%3.3f", 32.2));
		System.out.println(n.isEmpty());
		System.out.println(y + 10);
	}

}
