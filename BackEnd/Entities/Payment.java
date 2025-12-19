package com.excelr.project.eommerce.app.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String paymentMethod;
	private String paymentStatus;
	private String transactionId;
	private Date paymentDate;
	
	@OneToOne
	@JoinColumn(name="order_id")
	private Order order;

}
