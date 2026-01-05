package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories/")
public class CategoryControllerClass {
    @GetMapping
    public String getCategory() {

        return "Electronics";
    }

@GetMapping("/count")
    public int getCount()
{

    return 5;
}
@PostMapping
public String getPostCategory()
{

    return "post Electronics";
}
}
