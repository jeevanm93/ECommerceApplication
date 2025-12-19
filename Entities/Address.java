package com.excelr.project.eommerce.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fullName;
	private String phone;
	private String street;
	private String city;
	private String state;
	private String pincode;
	private String country;

	private boolean isDefault;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

}
