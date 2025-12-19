package com.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Double discountPrice;
    private String category;
    private String gender;
    private String size;
    private String color;
    private Integer stockQuantity;
    private String imageUrl;
    private String[] imageGallery;
    private Boolean featured;
    private Double rating;
    private Integer reviewCount;
}