package com.example.shop.controllers;

import com.example.shop.models.Category;
import com.example.shop.models.Product;
import com.example.shop.services.ICategoryService;
import com.example.shop.servicesImpl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200/")
public class CategoryController {

    @Autowired
    ICategoryService categoryService;
    @PostMapping("/categories")
    public Category save(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

}
