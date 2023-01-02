package com.example.shop.services;

import com.example.shop.models.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    List<Product> getAllProducts();
    void deleteProduct(Integer id);
    Product getByIdProduct(Integer id);
}

