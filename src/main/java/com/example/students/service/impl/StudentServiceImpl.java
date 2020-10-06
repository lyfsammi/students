package com.example.students.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.students.dao.StudentDao;
import com.example.students.pojo.Student;
import com.example.students.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
    private StudentDao studentDao;
	
	
	@Override
	public boolean addStudent(Student student) {
		boolean flag=false;
		try{
			studentDao.addStudent(student);
			flag=true;
		}catch(Exception e){
			System.out.println("新增失败!");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean updateStudent(Student student) {
		boolean flag=false;
		try{
			studentDao.updateStudent(student);
			flag=true;
		}catch(Exception e){
			System.out.println("修改失败!");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean deleteStudent(String stuId) {
		boolean flag=false;
		try{
			studentDao.deleteStudent(stuId);
			flag=true;
		}catch(Exception e){
			System.out.println("删除失败!");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public Student findStudentById(String stuId) {
		return studentDao.findById(stuId);
	}

}
