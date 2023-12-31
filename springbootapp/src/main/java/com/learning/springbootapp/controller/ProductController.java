package com.learning.springbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springbootapp.entity.Product;
import com.learning.springbootapp.service.ProductService;

@RestController
public class ProductController {
    
	 @Autowired
	    private ProductService service;
	 
	 @GetMapping("/products")
	 public List<Product> list() {
	     return service.listAll();
	 }


	}
