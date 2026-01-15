package com.example.demo.model;

import java.time.LocalDate;

import lombok.Data;


@Data
public class Invoice {

	private int inoviceNumber;
	private String customerName;
	private LocalDate invoiceDate;
	private double amount;
	
	
	
	
	
}
