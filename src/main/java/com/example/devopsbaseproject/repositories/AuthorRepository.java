package com.example.devopsbaseproject.repositories;

import com.example.devopsbaseproject.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
