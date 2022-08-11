package com.CG.Service;

import com.CG.Entity.Student;

public interface StudentService {
	public abstract Student getStudentById(int id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);

}
