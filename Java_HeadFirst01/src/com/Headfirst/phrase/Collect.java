package com.Headfirst.phrase;
interface An{
	public void method();
}
class B {
	public void method() {
		System.out.println("B");
	}
}
class C extends B implements An{
	public void method() {
		System.out.println("c");
}
public class Collect extends C  {
	public static void main(String[] args) {
		 An a = new C();
		a.method();
	}
		
	}
}
