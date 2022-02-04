package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Component {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer componentId;
	
	@NotBlank
	@NotNull
	@Pattern(regexp = "^[a-zA-Z\\s]+$")
	private String componentName;
	
	@NotBlank
	@NotNull
	private String description;
	
	@ManyToMany(cascade = {
			CascadeType.MERGE,
			CascadeType.PERSIST
	}, fetch = FetchType.LAZY)
	@JoinTable(name = "Component_Supplier", 
				joinColumns = {@JoinColumn(name = "componentId" ,referencedColumnName = "componentId")}, 
				inverseJoinColumns = {@JoinColumn(name = "supplierId", referencedColumnName = "supplierId")})
	private Set<Supplier> suppliers;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE,
			CascadeType.PERSIST
	})
	@JoinColumn(name = "productId", referencedColumnName = "productId")
	private Product product;

	public Component() {
		
	}
	public Component(Integer componentId, @Pattern(regexp = "^[A-Za-z]+$") String componentName,
						String description, Set<Supplier> suppliers, Product product) {
		super();
		this.componentId = componentId;
		this.componentName = componentName;
		this.description = description;
		this.suppliers = suppliers;
		this.product = product;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(Set<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}