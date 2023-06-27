package com.learning.springbootapp.service;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springbootapp.entity.Product;
import com.learning.springbootapp.repo.ProductRepository;
 
@Service
@Transactional
public class ProductService {
	@Autowired
    ProductRepository productRepo;
	
	
	public List<Product> listAll() {
        return productRepo.findAll();
    }
     
    public void save(Product product) {
    	productRepo.save(product);
    }
     
    public Product get(Integer id) {
        return productRepo.findById(id).get();
    }
     
    public void delete(Integer id) {
    	productRepo.deleteById(id);
    }


        
        
    }
	

