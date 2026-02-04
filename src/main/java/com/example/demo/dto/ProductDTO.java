package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO{
	private String image;
	private Object price;
	private String description;
	private int id;
	private String title;
	private String category;
}