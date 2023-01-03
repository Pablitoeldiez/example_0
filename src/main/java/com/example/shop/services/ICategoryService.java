package com.example.shop.services;

import com.example.shop.models.Category;

import java.util.List;

public interface ICategoryService {
    Category saveCategory(Category category);
    Category updateCategory(Category category);
    List<Category> getAllCategories();
    void deleteCategory(Integer id);
    Category getByIdCategory(Integer id);
}

