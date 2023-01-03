package com.example.shop.dao;

import com.example.shop.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryDao extends CrudRepository<Category, Integer> {
}
