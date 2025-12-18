package com.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(length = 1000)
    private String description;
    
    @Column(nullable = false)
    private Double price;
    
    private Double discountPrice;
    
    @Column(nullable = false)
    private String category; // shirts, tops, jeans, etc.
    
    @Column(nullable = false)
    private String gender; // men, women, kids
    
    private String size; // S, M, L, XL
    private String color;
    
    @Column(nullable = false)
    private Integer stockQuantity;
    
    private String imageUrl;
    private String[] imageGallery;
    
    @Column(nullable = false)
    private Boolean featured = false;
    
    private Double rating;
    private Integer reviewCount;
}