package com.weeklyTest.ecommerceapi.service;

import com.weeklyTest.ecommerceapi.dao.ProductRepo;
import com.weeklyTest.ecommerceapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public String saveProduct(Product product) {
        productRepo.save(product);
        return "save address";
    }
}
