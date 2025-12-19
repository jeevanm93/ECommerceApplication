package com.excelr.project.eommerce.app.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String orderNumber;
	private double totalAmount;
	private String status; // PLACED, SHIPPED, DELIVERED
	private String paymentMode;
	private Date orderDate;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address shippingAddress;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<OrderItem> items;

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	private Payment payment;

}
