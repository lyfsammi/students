package com.example.students.service;

import java.util.List;

import com.example.students.pojo.Student;

public interface StudentService {
	

	boolean addStudent(Student student);
	

	boolean updateStudent(Student student);
	

	boolean deleteStudent(String stuId);
	

	Student findStudentById(String stuId);
    
}
