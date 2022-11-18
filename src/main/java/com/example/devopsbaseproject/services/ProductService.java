package com.example.devopsbaseproject.services;

import com.example.devopsbaseproject.domain.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(Integer id);

    List<Product> listProducts();
}
