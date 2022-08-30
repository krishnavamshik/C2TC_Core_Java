package com.cg.pmm;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.certificate.Certificate;

@Service
@Transactional
public class IStudentService {
	@Autowired
	private IStudentRepositry repo;

	public List<Student> listAll() {

		return repo.findAll();
	}

	public Student searchStudentById(int id) {
		return repo.findById(id).get();
	}

//	public Student searchStudentByHallTicket(int ticketNo) {
//		return repo.findById(ticketNo).get();
//	}

	public void addStudent(Student student) {
		repo.save(student);
	}

	public void deleteStudent(int id) {
		repo.deleteById(id);
	}

}
