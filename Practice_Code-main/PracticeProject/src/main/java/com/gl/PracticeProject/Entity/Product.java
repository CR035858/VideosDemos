package com.gl.PracticeProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Builder
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pNo;
	
	@Column(name="productName")
	private String pName;
	
	@Column(name="quantity")
	private int qty;
	
	@Column(name="unitPrice")
	private double price;

}
