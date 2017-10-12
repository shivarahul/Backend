package com.backend.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.stereotype.Component;
@Entity
@Component
public class Product {

	@javax.persistence.Id
	@GeneratedValue
	
	private int Id;
	private String Name;
	private int Quantity;
	private double Price;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getProduct_Name() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

