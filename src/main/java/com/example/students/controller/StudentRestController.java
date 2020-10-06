package com.example.students.controller;

import com.example.students.pojo.Student;
import com.example.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class StudentRestController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public boolean addStudent(@RequestBody Student student) {
        System.out.println("开始新增...");
        return studentService.addStudent(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public boolean updateStudent(@RequestBody Student student) {
        System.out.println("开始更新...");
        return studentService.updateStudent(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "stuId", required = true) String stuId) {
        System.out.println("开始删除...");
        return studentService.deleteStudent(stuId);
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public Student findByStudentId(@RequestParam(value = "stuId", required = true) String stuId) {
        System.out.println("开始查询...");
        return studentService.findStudentById(stuId);
    }


}
