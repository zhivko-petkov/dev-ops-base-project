package com.example.devopsbaseproject.repositories;

import com.example.devopsbaseproject.domain.ProductCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {
}
