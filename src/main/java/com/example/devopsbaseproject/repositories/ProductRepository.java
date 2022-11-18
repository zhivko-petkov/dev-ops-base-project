package com.example.devopsbaseproject.repositories;

import com.example.devopsbaseproject.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {


    Optional<Product> findById(Integer integer);
    List<Product> findAll();
}
