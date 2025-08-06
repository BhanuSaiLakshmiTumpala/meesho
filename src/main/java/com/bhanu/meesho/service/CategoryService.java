package com.bhanu.meesho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhanu.meesho.entity.Category;
import com.bhanu.meesho.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }
}
