package com.cg.pmm;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentRepository repos;
	public List<Student1> listAll() {

		return repos.findAll();
	}

	public Student1 searchStudentById(int id) {
		return repos.findById(id).get();
	}
	public Student1 searchStudentByHallTicket(int ticketNo) {	
	return repos.findById(ticketNo).get();	}

	public void addStudent(Student1 student1) {
		repos.save(student1);
	}

	public void deleteStudent(int id) {
		repos.deleteById(id);
	}

}
