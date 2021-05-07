package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sllerName;
	private Double sum;
	
	public SaleSumDTO() {
		
	}

	public SaleSumDTO(Seller seller, Double sum) {
		super();
		this.sllerName = seller.getName();
		this.sum = sum;
	}

	public String getSllerName() {
		return sllerName;
	}

	public void setSllerName(String sllerName) {
		this.sllerName = sllerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
}
