package com.web.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.curd.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
