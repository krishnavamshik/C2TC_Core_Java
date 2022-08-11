package com.CG.Client;

import java.util.Scanner;

import com.CG.Entity.Student;
import com.CG.Service.*;


public class Client {

	public static void main(String[] args) {
		Student student = new Student();
		StudentService service = new StudentServiceimpl();
		Scanner sc = new Scanner(System.in);
				//create
				System.out.println("Enter id");
				student.setId(sc.nextInt());
				System.out.println("Enter name");
				student.setName(sc.nextLine());
				service.addStudent(student);
				System.out.println("Creation successful");
				
				//retrieve
				service.getStudentById(102);
				System.out.println("Your ID is "+ student.getId());
				System.out.println("Your Name is "+ student.getName());
				
				//update
				student= service.getStudentById(102);
				student.setName("Krishna vamshi");
				service.updateStudent(student);
				System.out.println("Update successful");
				
				//Delete
				student= service.getStudentById(102);
				service.removeStudent(student);
				System.out.println("Delete successful");
	}

}
