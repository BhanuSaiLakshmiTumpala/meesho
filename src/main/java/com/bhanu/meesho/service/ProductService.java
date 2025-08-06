package com.bhanu.meesho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhanu.meesho.entity.Category;
import com.bhanu.meesho.entity.Product;
import com.bhanu.meesho.entity.User;
import com.bhanu.meesho.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryService categoryService;

     public Product createProduct(Product product){
        Category category= categoryService.createCategory(product.getCategory());
        product.setCategory(category);
       return productRepository.save(product);

}
}
