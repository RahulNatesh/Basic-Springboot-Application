package com.learning.springbootapp.controller;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springbootapp.entity.Student;
import com.learning.springbootapp.service.StudentService;
@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	@GetMapping("/students")
	public List<Student> list() {
		return service.listAll();
	}
	@PostMapping("/students")
	public void add(@RequestBody Student student) {
		service.save(student);
	}
	@PutMapping("/students/{id}")
	public ResponseEntity<?> update(@RequestBody Student student,@PathVariable Integer id) {
		try {
			@SuppressWarnings("unused")
			Student existStudent = service.getstudent(id);
			service.save(student);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
		}
	}
	@DeleteMapping("/students/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}	
}