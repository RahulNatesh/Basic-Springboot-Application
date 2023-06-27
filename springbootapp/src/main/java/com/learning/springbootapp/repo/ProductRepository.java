package com.learning.springbootapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springbootapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
 
}