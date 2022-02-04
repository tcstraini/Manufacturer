package com.example.demo.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ComponentService;
import com.example.demo.entity.Component;

@RestController
public class ComponentController {
	@Autowired
	private ComponentService componentService;

	@PostMapping("/component")
	@Transactional
	public void addProduct(@RequestBody @Valid Component component) {
		componentService.addComponent(component);
	}
}