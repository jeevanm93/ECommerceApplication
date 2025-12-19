package com.excelr.project.eommerce.app.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(unique = true, nullable = false)
	private String email;

	private String password;
	private String phone;
	private boolean isActive = true;
	private Date createdAt;
	private Date updatedAt;

//	User -> Role (Many-To-Many)
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

//	User -> Address (One-To-Many)
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Address> addresses;

//	Users -> Orders(One-To-Many)
	@OneToMany(mappedBy = "user")
	private List<Order> orders;

}
