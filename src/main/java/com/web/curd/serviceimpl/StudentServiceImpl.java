package com.web.curd.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.curd.iservice.IStudentService;
import com.web.curd.model.Student;
import com.web.curd.repository.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentRepository repository;

	@Override
	public void save(Student std) {
		repository.save(std);
		
		
	}

	@Override
	public void update(Student std) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getOne(Long studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public String saveStudent(Student stud) {
		repository.save(stud);
		return"data is inserted";
		
	}

	public String deleteRecord(Student stdId) {
		repository.delete(stdId);
		return "record is deleted..";
	}

	
	

}
