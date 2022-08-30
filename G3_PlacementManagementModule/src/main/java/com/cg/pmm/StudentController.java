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

import com.cg.certificate.Certificate;

@RestController
public class StudentController {
	
	@Autowired
	private IStudentService service;
	
	//Retrieve all
	@GetMapping("/student")
	public List<Student>list(){
		return service.listAll();
	}
	//Retrieve by id
	@GetMapping("/students/{id}")
	public ResponseEntity <Student>get(@PathVariable Integer id){
		try {
			Student student = service.searchStudentById(id);
			return new ResponseEntity<Student>(student,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Student>( HttpStatus.NOT_FOUND);
		}
	}
	// add student
	@PostMapping("/student")
	public void addStud(@RequestBody Student student) {
		service.addStudent(student);
	}
	//update student
	@PutMapping("/student/{id}")
	public ResponseEntity<?>updateStudent(@RequestBody Student student,@PathVariable Integer id){
		try {
			Student upStudent = service.searchStudentById(id);
			service.addStudent(student);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	// Delete Student
	@DeleteMapping("/student/{id}")
	public void deleteStud(@PathVariable Integer id) {
		service.deleteStudent(id);
	}
	

}
