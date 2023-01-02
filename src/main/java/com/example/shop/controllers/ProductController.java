package com.example.shop.controllers;

import com.example.shop.models.Product;
import com.example.shop.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ProductController {
    @Autowired
    IProductService productService;

    @PostMapping("/products")
    public Product save(@RequestBody Product product) {

        return productService.saveProduct(product);
    }

    @PutMapping("/products")
    public Product update(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @GetMapping("/products/{id}")
    public Product getById(@PathVariable Integer id) {
        return productService.getByIdProduct(id);
    }

    @GetMapping("/products")
    public List<Product> getAll() {
        return productService.getAllProducts();
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }

}