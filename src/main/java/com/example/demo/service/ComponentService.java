package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ComponentRepository;
import com.example.demo.entity.Component;


@Service
public class ComponentService {
        
	@Autowired
	ComponentRepository componentRepository;
	
	public void saveComponent(Component component) {
		componentRepository.save(component);
		
	}

	public Iterable<Component> getComponent() {
		return componentRepository.findAll();
	}

}
