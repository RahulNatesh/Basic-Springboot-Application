package com.learning.springbootapp.service;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springbootapp.entity.Student;
import com.learning.springbootapp.repo.StudentRepo;
@Service
@Transactional
public class StudentService {
	@Autowired
	StudentRepo StudentRepo;

	
	public List<Student> listAll() {
        return StudentRepo.findAll();
    }
     
    public void save(Student student) {
    	StudentRepo.save(student);
    }
     
    public Student getstudent(int id) {
        return StudentRepo.getById(id);
    }
    public void delete(int id) {
    	StudentRepo.deleteById(id);
    }    
    public void update(Student student) {
		StudentRepo.save(student);
	}

}

