package com.example.shop.servicesImpl;

import com.example.shop.dao.IProductDao;
import com.example.shop.models.Product;
import com.example.shop.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    IProductDao productDao;

    @Override
    public Product saveProduct(Product product) {
        return productDao.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productDao.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) productDao.findAll();
    }

    @Override
    public Product getByIdProduct(Integer id) {
        return productDao.findById(id).orElse(null);
    }

    @Override
    public void deleteProduct(Integer id) {
        productDao.deleteById(id);
    }
}
