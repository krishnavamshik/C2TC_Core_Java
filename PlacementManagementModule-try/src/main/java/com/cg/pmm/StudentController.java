package com.cg.pmm;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService services;
	//Retrieve all
		@GetMapping("/student1")
		public List<Student1>list(){
			return services.listAll();
		}
		//Retrieve by id
		@GetMapping("/student1/{id}")
		public ResponseEntity <Student1>get(@PathVariable Integer id){
			try {
				Student1 student1 = services.searchStudentById(id);
				return new ResponseEntity<Student1>(student1,HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<Student1>( HttpStatus.NOT_FOUND);
			}
		}
		//Retrieve by ticket no
		@GetMapping("/student/{ticketNo}")
		public ResponseEntity <Student1>getByTicketNo(@PathVariable Integer ticketNo){
			try {
				Student1 student = services.searchStudentByHallTicket(ticketNo);
				return new ResponseEntity<Student1>(student,HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<Student1>(HttpStatus.NOT_FOUND);
			}	
		}
		// add student
		@PostMapping("/student1")
		public void addStud(@RequestBody Student1 student) {
			services.addStudent(student);
		}
		//update student
		@PutMapping("/student1/{id}")
		public ResponseEntity<?>updateStudent(@RequestBody Student1 student1,@PathVariable Integer id){
			try {
				Student1 upStudent = services.searchStudentById(id);
				services.addStudent(student1);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		// Delete Student
		@DeleteMapping("/student1/{id}")
		public void deleteStud(@PathVariable Integer id) {
			services.deleteStudent(id);
		}
		

}
