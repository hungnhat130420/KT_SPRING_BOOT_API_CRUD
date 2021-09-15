package com.springbootapi.kt_spring_boot_api.repository;

import com.springbootapi.kt_spring_boot_api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
