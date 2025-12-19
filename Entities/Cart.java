package com.excelr.project.eommerce.app.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "carts")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	private List<CartItem> items;

	private Date createdAt;
	private Date updatedAt;

}
