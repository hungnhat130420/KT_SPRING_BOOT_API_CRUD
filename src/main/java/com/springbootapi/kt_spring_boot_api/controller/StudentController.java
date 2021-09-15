package com.springbootapi.kt_spring_boot_api.controller;

import com.springbootapi.kt_spring_boot_api.entity.Student;
import com.springbootapi.kt_spring_boot_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") Long studentId){
        return studentService.getStudentById(studentId);
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable("id") Long id,@RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
         studentService.deleteStudent(id);
        return "delete successfully !";
    }

}
