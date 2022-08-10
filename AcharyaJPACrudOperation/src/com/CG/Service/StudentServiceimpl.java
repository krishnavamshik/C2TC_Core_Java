package com.CG.Service;

import com.CG.Entity.Student;
import com.CG.dao.StudentDao;
import com.CG.dao.StudentDaoimpl;

public class StudentServiceimpl implements StudentService {
	private StudentDao dao;
	public StudentServiceimpl() {
		dao = new StudentDaoimpl();
	
	}

	@Override
	public Student getStudentById(int id) {
		Student student = dao.getStudentById(id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
		
	}

}
