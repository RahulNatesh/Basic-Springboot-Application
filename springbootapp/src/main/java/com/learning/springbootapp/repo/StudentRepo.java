package com.learning.springbootapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springbootapp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
 
}