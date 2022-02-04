package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Component;
import com.example.demo.repository.ComponentRepository;

@Service
public class ComponentService {
	
	@Autowired
	private ComponentRepository componentRepository;
	
	public void addComponent(Component component) {
		componentRepository.save(component);
	}

}
