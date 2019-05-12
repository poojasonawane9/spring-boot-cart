package com.capgemini.springbootecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.springbootecommerce.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
