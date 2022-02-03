package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Component;
import com.example.demo.entity.Product;
import com.example.demo.service.ComponentService;
import com.example.demo.service.ProductService;



@RestController
public class ComponentController {
	@Autowired
    ComponentService componentService;
    @GetMapping("/component")
	Iterable<Component> getComponents() {
	      return componentService.getComponent();
	 }
	
	@PostMapping("/component")
	void createComponent(@RequestBody Component component) {
	componentService.saveComponent(component);
	}
}