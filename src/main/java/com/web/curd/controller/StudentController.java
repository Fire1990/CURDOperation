package com.web.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.curd.model.Student;
import com.web.curd.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {
	@Autowired
	private StudentServiceImpl service;
	@GetMapping("/test")
	public String test() {
		return"yeh,its working fine ";
	}
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student stud) {
		return service.saveStudent(stud);
		
	}
	
	@GetMapping("/delete")
	public String deleteRecord(@RequestParam Student stdId) {
		return service.deleteRecord(stdId);
	}

}
