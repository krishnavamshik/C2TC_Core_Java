// Hierarchial inheritance
package com.acharya.inheritance;
class Animal_s{
	void eat() {
		System.out.println("Eating,,");
	}
}
class Dogs extends Animal_s{
	void bark() {
		System.out.println("Barking,,");
	}
}
class Cats extends Animal_s{
	void meow() {
		System.out.println("Meowing,,");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Dogs d1 = new Dogs();
		Cats c1 = new Cats();
		d1.bark();
		c1.meow();
		d1.eat();
		c1.eat();

	}

}
