package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ProductRepository;
import com.example.demo.entity.Product;


@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public void saveProduct(Product product) {
    	productRepository.save(product);
    }
	public  Iterable<Product> getProducts() {
		return productRepository.findAll();
	}
}