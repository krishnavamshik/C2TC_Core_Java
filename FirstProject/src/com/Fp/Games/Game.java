package com.Fp.Games;

import java.util.Scanner;

class P1 {
	String name;
	 int weapon1;
	 int Life1;
	public P1(String name, int G1, int health) {
		weapon1 = G1;
		Life1 = health;
		this.name=name;

	}
	public int shoot1(boolean Aspirine) {
		int damage2 = P2.weapon2;
		Life1 = Life1 - damage2;
		int Meds = Life1 + 30;
		System.out.println("Name "+name);
		System.out.println("Health P1 - " + 100);
		if (Aspirine) {
			Life1 = Meds;
			System.out.println("Health after Meds " + Life1);
		}
		else {
			System.out.println("Health "+Life1);
		}
		System.out.println();
		return weapon1;
	}
}

class P2 {
	String name;
	static int weapon2;
	static int Life2;
	
	public P2(String name, int  G2, int health) {
		weapon2=G2;
		Life2 = health;
		this.name=name;
	}
	public int shoot2(boolean Armor) {
		int GA2 = weapon2 - 20; 
		System.out.println("Name "+name);
		System.out.println("Health P2 - " + 100);
		if(Armor) {
			Life2 =Life2 - GA2;
			System.out.println( "Armor saved u " + Life2);
		}
		else {
			Life2 = Life2 - weapon2;
			System.out.println("Health "+Life2);
		}
		System.out.println();
		System.out.println();
		return weapon2;	
	}
}

public class Game {

	public static void main(String[] args) {
		P1 obj = new P1("kris", 50, 100);
		P2 obj1 = new P2("Niki", 40 , 100);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Attacks: ");
		int A = sc.nextInt();
		for(int i =0;i<A;i++) {
			obj.shoot1(true);
			obj1.shoot2(true);
		}
		
	}

}
