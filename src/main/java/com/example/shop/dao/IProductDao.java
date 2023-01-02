package com.example.shop.dao;

import com.example.shop.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IProductDao extends CrudRepository<Product, Integer> {

}