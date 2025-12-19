package com.excelr.project.eommerce.app.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "wishlists")
public class Wishlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	private Date createdAt;

}
