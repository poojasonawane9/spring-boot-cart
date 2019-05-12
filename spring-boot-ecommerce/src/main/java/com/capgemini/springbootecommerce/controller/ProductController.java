package com.capgemini.springbootecommerce.controller;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springbootecommerce.model.Product;
import com.capgemini.springbootecommerce.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "", "/" })
    @CrossOrigin(origins = "http://localhost:4200")
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
}
}
