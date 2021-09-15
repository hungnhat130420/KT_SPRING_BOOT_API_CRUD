package com.springbootapi.kt_spring_boot_api.service;

import com.springbootapi.kt_spring_boot_api.entity.Student;
import com.springbootapi.kt_spring_boot_api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student updateStudent(Long studentId, Student student) {
        Student studentFormDB = studentRepository.findById(studentId).get();
        studentFormDB.setName(student.getName());
        studentFormDB.setEmail(student.getEmail());
        studentRepository.save(studentFormDB);
        return studentFormDB;
    }
}
