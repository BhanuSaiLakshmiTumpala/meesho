package com.bhanu.meesho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhanu.meesho.entity.Product;
import com.bhanu.meesho.entity.User;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>  {

}
