package com.bhanu.meesho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhanu.meesho.entity.Product;
import com.bhanu.meesho.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;


    @PostMapping("/create_product")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

}
