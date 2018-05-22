package com.web.curd.iservice;

import java.util.List;

import com.web.curd.model.Student;

public interface IStudentService {
	public void save(Student std);
	public void update(Student std);
	public void delete(Long studentId);
	public Student getOne(Long studentId);
	public List<Student> findAll();

}
