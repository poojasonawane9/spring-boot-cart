package com.capgemini.springbootecommerce.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.springbootecommerce.model.OrderProduct;
import com.capgemini.springbootecommerce.repository.OrderProductRepository;

@Service
@Transactional
public class OrderProductServiceImpl  implements OrderProductService{

	private OrderProductRepository orderProductRepository;

    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
}
}
