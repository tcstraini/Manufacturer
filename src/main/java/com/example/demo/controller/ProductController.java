package com.example.demo.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ProductService;
import com.example.demo.entity.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("/product")
	@Transactional
	public void addProduct(@RequestBody @Valid Product product) {
		productService.addProduct(product);
	}
}