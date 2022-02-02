package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
       @Autowired
       ProductService productService;
       @GetMapping("/product")
   	Iterable<Product> getProducts() {
   	      return productService.getProducts();
   	 }
   	
   	@PostMapping("/product")
   	void createProduct(@RequestBody Product product) {
   		System.out.println(product.getProductname());
   		System.out.println(product.getQuantity());
   	productService.saveProduct(product);
   	}
}