package com.capgemini.springbootecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.springbootecommerce.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
