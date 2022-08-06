package com.Headfirst.phrase;
import java.util.Scanner;
class Client{
	String name;
	private final String email ;
	long num;
	public Client() {
		this.email = "k";
		Scanner finput = new Scanner(System.in);
		System.out.println("Enter email");
		 String email = finput.nextLine();

	}
	public void info() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = input.nextLine();
		
		
		
		System.out.println("Enter Num");
		long num = input.nextLong();
		System.out.println("Name = "+name+ " Email ="+email+ " Number ="+num);
		
	}
}

public class Superset {

	public static void main(String[] args) {
		Client obj = new Client();
		obj.info();
		
		
		
	}

}
