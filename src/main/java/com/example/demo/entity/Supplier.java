package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer supplierId;
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z\\s]+$")
	private String supplierName;
	
	@ManyToMany(mappedBy = "suppliers", cascade = {
			CascadeType.MERGE,
			CascadeType.PERSIST
	}, fetch = FetchType.LAZY)
	private Set<Component> components;

	public Supplier() {
		
	}

	public Supplier(Integer supplierId, @NotNull @NotBlank @Pattern(regexp = "^[A-Za-z]+$") String supplierName,
			Set<Component> components) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.components = components;
	}
	
	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Set<Component> getComponents() {
		return components;
	}

	public void setComponents(Set<Component> components) {
		this.components = components;
	}

}