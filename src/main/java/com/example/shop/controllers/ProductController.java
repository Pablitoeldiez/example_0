package com.example.shop.controllers;

import com.example.shop.models.Product;
import com.example.shop.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")

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
    public ResponseEntity getAll() {
        if(productService.getAllProducts().isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body("Not found products");
        }
        else{
            return  new ResponseEntity<List<Product>>(this.productService.getAllProducts(), HttpStatus.OK);
        }
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }


}