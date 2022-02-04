package com.example.demo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Component;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public void addProduct(Product product) {
		Set<Component> components =  product.getComponents();
		for(Component component: components) {
			component.setProduct(product);
		}
		productRepository.save(product);
	}
}