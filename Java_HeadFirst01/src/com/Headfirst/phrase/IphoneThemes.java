package com.Headfirst.phrase;

import java.util.Scanner;

interface CoolBlues {
	default void cbTheme() {

		String Theme1 = "CoolBlues";
		System.out.println(Theme1);
	}
}

interface NeonVibes {
	default void NeoTheme() {

		String Theme2 = "Neon Vibes";
		System.out.println(Theme2);
	}
}

class Changes implements CoolBlues, NeonVibes {
	public static void tchange() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter");
		String S=inp.nextLine();
		System.out.println();
		
		
		
	}

	@Override
	public String toString() {
		return "Changes [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


}

public class IphoneThemes {

	public static void main(String[] args) {
		
		Changes.tchange();

	}

}
