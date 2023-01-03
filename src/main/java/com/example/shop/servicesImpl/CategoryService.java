package com.example.shop.servicesImpl;

import com.example.shop.dao.ICategoryDao;
import com.example.shop.models.Category;
import com.example.shop.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    ICategoryDao categoryDao;

    @Override
    public Category saveCategory(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return (List<Category>) categoryDao.findAll();
    }

    @Override
    public Category getByIdCategory(Integer id) {
        return categoryDao.findById(id).orElse(null);
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryDao.deleteById(id);
    }
}
