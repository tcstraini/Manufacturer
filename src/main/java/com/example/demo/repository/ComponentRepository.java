package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Component;

public interface ComponentRepository extends CrudRepository<Component, Integer> {

}