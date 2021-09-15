package com.springbootapi.kt_spring_boot_api.service;

import com.springbootapi.kt_spring_boot_api.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
     public Student saveStudent(Student student);

     public List<Student> getAllStudents();

     public  Student getStudentById(Long studentId);

     public  void deleteStudent(Long studentId);

     public  Student updateStudent(Long studentId,Student student);

}
