package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Component {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer componentid;
     private String componentname;
     private String description;
     private String suppliers;
     private String productname;
     
   

 	@OneToOne(mappedBy ="component")
 	Product product;


	public Integer getComponentid() {
		return componentid;
	}
	
	
	public void setComponentid(Integer componentid) {
		this.componentid = componentid;
	}
	public String getComponentname() {
		return componentname;
	}
	public void setComponentname(String componentname) {
		this.componentname = componentname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(String suppliers) {
		this.suppliers = suppliers;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
}