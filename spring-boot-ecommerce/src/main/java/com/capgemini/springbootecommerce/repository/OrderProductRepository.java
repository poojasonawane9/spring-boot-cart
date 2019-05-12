package com.capgemini.springbootecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.springbootecommerce.model.OrderProduct;
import com.capgemini.springbootecommerce.model.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct	, OrderProductPK>{

}
