package com.CG.Client;

import com.CG.Entity.Student;
import com.CG.Service.StudentService;
import com.CG.Service.StudentServiceimpl;

public class Client {

	public static void main(String[] args) {
		Student student = new Student();
		StudentService service = new StudentServiceimpl();
		//create
		student.setId(10);
		student.setName("krishna");
		service.addStudent(student);
		System.out.println("Creation successful");
		
		//retrieve
		service.getStudentById(10);
		System.out.println("Your ID is "+ student.getId());
		System.out.println("Your Name is "+ student.getName());
		
		//update
		student= service.getStudentById(10);
		student.setName("Krishna vamshi");
		service.updateStudent(student);
		System.out.println("Update successful");
		
		//Delete
		student= service.getStudentById(10);
		service.removeStudent(student);
		System.out.println("Delete successful");
	}

}
